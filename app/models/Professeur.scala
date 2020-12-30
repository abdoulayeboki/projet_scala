package models
import com.google.inject.Inject
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile
import scala.concurrent.{ExecutionContext, Future}
import slick.jdbc.MySQLProfile.api._
 
case class Professeur(val id:Long, val nom:String,prenom: String, val id_grade: Long)
case class ProfesseurFormData(nom: String,prenom: String, id_grade: Long)

object ProfesseurForm {
  val form = Form(
    mapping(
      "nom" -> nonEmptyText,
      "prenom" -> nonEmptyText,
      "id_grade" -> longNumber
    )(ProfesseurFormData.apply)(ProfesseurFormData.unapply)
  )
}
class ProfesseurTableDef(tag: Tag) extends Table[Professeur](tag, "professeur") {
 
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def nom = column[String]("nom")
  def prenom = column[String]("prenom")
  def id_grade = column[Long]("id_grade")
 
  override def * = (id, nom,prenom, id_grade) <> (Professeur.tupled, Professeur.unapply)
}

class Professeurs @Inject()(
    protected val dbConfigProvider: DatabaseConfigProvider)
    (implicit executionContext: ExecutionContext)
    extends HasDatabaseConfigProvider[JdbcProfile] {
        var professeurs = TableQuery[ProfesseurTableDef]

    def getAll: Future[Seq[Professeur]] = {
       dbConfig.db.run(professeurs.result)
       }

//     def add(professeurItem: Professeur): Future[String] = {
//       dbConfig.db
//       .run(professeurs += professeurItem)
//       .map(res => "ProfesseurItem successfully added")
//       .recover {
//         case ex: Exception => {
//             printf(ex.getMessage())
//             ex.getMessage
//         }
//       }
//   }
//    def delete(id: Long): Future[Int] = {
//     dbConfig.db.run(professeurs.filter(_.id === id).delete)
//   }

// def update(professeurItem: Professeur): Future[Int] = {
//     dbConfig.db
//       .run(professeurs.filter(_.id === professeurItem.id)
//             .map(x => (x.libelle))
//             .update(professeurItem.libelle)
//       )
//   }

//   def get(id: Long): Future[Option[Professeur]] = {
//     dbConfig.db.run(professeurs.filter(_.id === id).result.headOption)
//   }
 
  

}