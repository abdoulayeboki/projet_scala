package models
import com.google.inject.Inject
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile
import scala.concurrent.{ExecutionContext, Future}
import slick.jdbc.MySQLProfile.api._
 
case class Matiere(val codeMatiere:String, val libelle:String, val coefficient: Long)
case class MatiereFormData(codeMatiere: String,libelle: String, coefficient: Long)

object MatiereForm {
  val form = Form(
    mapping(
      "codeMatiere" -> nonEmptyText,
      "libelle" -> nonEmptyText,
      "coefficient" -> longNumber
    )(MatiereFormData.apply)(MatiereFormData.unapply)
  )
}
class MatiereTableDef(tag: Tag) extends Table[Matiere](tag, "matiere") {
 
  def codeMatiere = column[String]("codeMatiere", O.PrimaryKey)
  def libelle = column[String]("libelle")
  def coefficient = column[Long]("coefficient")
 
  override def * = (codeMatiere,libelle, coefficient) <> (Matiere.tupled, Matiere.unapply)
}

class Matieres @Inject()(
    protected val dbConfigProvider: DatabaseConfigProvider)
    (implicit executionContext: ExecutionContext)
    extends HasDatabaseConfigProvider[JdbcProfile] {
        var matieres = TableQuery[MatiereTableDef]

    def getAll: Future[Seq[Matiere]] = {
       dbConfig.db.run(matieres.result)
       }

//     def add(matiereItem: Matiere): Future[String] = {
//       dbConfig.db
//       .run(matieres += matiereItem)
//       .map(res => "MatiereItem successfully added")
//       .recover {
//         case ex: Exception => {
//             printf(ex.getMessage())
//             ex.getMessage
//         }
//       }
//   }
//    def delete(id: Long): Future[Int] = {
//     dbConfig.db.run(matieres.filter(_.id === id).delete)
//   }

// def update(matiereItem: Matiere): Future[Int] = {
//     dbConfig.db
//       .run(matieres.filter(_.id === matiereItem.id)
//             .map(x => (x.libelle))
//             .update(matiereItem.libelle)
//       )
//   }

//   def get(id: Long): Future[Option[Matiere]] = {
//     dbConfig.db.run(matieres.filter(_.id === id).result.headOption)
//   }
 
  

}