package models
import com.google.inject.Inject
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile
import scala.concurrent.{ExecutionContext, Future}
import slick.jdbc.MySQLProfile.api._
 
case class Salle(val id:Long, val libelle:String)
case class SalleFormData(libelle: String)

object SalleForm {
  val form = Form(
    mapping(
      "libelle" -> nonEmptyText
    )(SalleFormData.apply)(SalleFormData.unapply)
  )
}
class SalleTableDef(tag: Tag) extends Table[Salle](tag, "salle") {
 
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def libelle = column[String]("libelle")
 
  override def * = (id, libelle) <> (Salle.tupled, Salle.unapply)
}

class Salles @Inject()(
    protected val dbConfigProvider: DatabaseConfigProvider)
    (implicit executionContext: ExecutionContext)
    extends HasDatabaseConfigProvider[JdbcProfile] {
        var salles = TableQuery[SalleTableDef]

  def getAll: Future[Seq[Salle]] = {
    dbConfig.db.run(salles.result)
  }
//     def add(salleItem: Salle): Future[String] = {
//       dbConfig.db
//       .run(salles += salleItem)
//       .map(res => "SalleItem successfully added")
//       .recover {
//         case ex: Exception => {
//             printf(ex.getMessage())
//             ex.getMessage
//         }
//       }
//   }
//    def delete(id: Long): Future[Int] = {
//     dbConfig.db.run(salles.filter(_.id === id).delete)
//   }

// def update(salleItem: Salle): Future[Int] = {
//     dbConfig.db
//       .run(salles.filter(_.id === salleItem.id)
//             .map(x => (x.libelle))
//             .update(salleItem.libelle)
//       )
//   }

//   def get(id: Long): Future[Option[Salle]] = {
//     dbConfig.db.run(salles.filter(_.id === id).result.headOption)
//   }
 


}