package models
import com.google.inject.Inject
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile
import scala.concurrent.{ExecutionContext, Future}
import slick.jdbc.MySQLProfile.api._
 
case class Etudiant(val id:Long, val nom:String,prenom: String, val id_classe: Long)
case class EtudiantFormData(nom: String,prenom: String, id_classe: Long)

object EtudiantForm {
  val form = Form(
    mapping(
      "nom" -> nonEmptyText,
      "prenom" -> nonEmptyText,
      "id_classe" -> longNumber
    )(EtudiantFormData.apply)(EtudiantFormData.unapply)
  )
}
class EtudiantTableDef(tag: Tag) extends Table[Etudiant](tag, "etudiant") {
 
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def nom = column[String]("nom")
  def prenom = column[String]("prenom")
  def id_classe = column[Long]("id_classe")
 
  override def * = (id, nom,prenom, id_classe) <> (Etudiant.tupled, Etudiant.unapply)
}

class Etudiants @Inject()(
    protected val dbConfigProvider: DatabaseConfigProvider)
    (implicit executionContext: ExecutionContext)
    extends HasDatabaseConfigProvider[JdbcProfile] {
        var etudiants = TableQuery[EtudiantTableDef]

    def getAll: Future[Seq[Etudiant]] = {
       dbConfig.db.run(etudiants.result)
       }

//     def add(etudiantItem: Etudiant): Future[String] = {
//       dbConfig.db
//       .run(etudiants += etudiantItem)
//       .map(res => "EtudiantItem successfully added")
//       .recover {
//         case ex: Exception => {
//             printf(ex.getMessage())
//             ex.getMessage
//         }
//       }
//   }
//    def delete(id: Long): Future[Int] = {
//     dbConfig.db.run(etudiants.filter(_.id === id).delete)
//   }

// def update(etudiantItem: Etudiant): Future[Int] = {
//     dbConfig.db
//       .run(etudiants.filter(_.id === etudiantItem.id)
//             .map(x => (x.libelle))
//             .update(etudiantItem.libelle)
//       )
//   }

//   def get(id: Long): Future[Option[Etudiant]] = {
//     dbConfig.db.run(etudiants.filter(_.id === id).result.headOption)
//   }
 
  

}