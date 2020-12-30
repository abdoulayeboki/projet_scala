package models
import com.google.inject.Inject
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile
import scala.concurrent.{ExecutionContext, Future}
import slick.jdbc.MySQLProfile.api._
import java.sql.Date

 
case class Cours(val id:Long, val date_debut:Date,val date_fin: Date, val id_professeur: Long,
  val id_salle: Long, val id_classe: Long)
case class CoursFormData( val date_debut:Date,val date_fin: Date,val id_professeur: Long,
  val id_salle: Long, val id_classe: Long)

object CoursForm {
  val form = Form(
    mapping(
      "date_debut" -> sqlDate,
      "date_fin" -> sqlDate,
      "id_professeur" -> longNumber,
      "id_salle" -> longNumber,
      "id_classe" -> longNumber
    )(CoursFormData.apply)(CoursFormData.unapply)
  )
}
class CoursTableDef(tag: Tag) extends Table[Cours](tag, "cours") {
 
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def date_debut = column[Date]("date_debut")
  def date_fin = column[Date]("date_fin")
  def id_professeur = column[Long]("id_professeur")
  def id_salle = column[Long]("id_salle")
  def id_classe = column[Long]("id_classe")
 
  override def * = (id,date_debut,date_fin,id_professeur,id_salle,id_classe) <>
   (Cours.tupled, Cours.unapply)
}

class Courss @Inject()(
    protected val dbConfigProvider: DatabaseConfigProvider)
    (implicit executionContext: ExecutionContext)
    extends HasDatabaseConfigProvider[JdbcProfile] {
        var cours = TableQuery[CoursTableDef]

    def getAll: Future[Seq[Cours]] = {
       dbConfig.db.run(cours.result)
       }

//     def add(coursItem: Cours): Future[String] = {
//       dbConfig.db
//       .run(courss += coursItem)
//       .map(res => "CoursItem successfully added")
//       .recover {
//         case ex: Exception => {
//             printf(ex.getMessage())
//             ex.getMessage
//         }
//       }
//   }
//    def delete(id: Long): Future[Int] = {
//     dbConfig.db.run(courss.filter(_.id === id).delete)
//   }

// def update_debut(coursItem: Cours): Future[Int] = {
//     dbConfig.db
//       .run(courss.filter(_.id === coursItem.id)
//             .map(x => (x.libelle))
//             .update_debut(coursItem.libelle)
//       )
//   }

//   def get(id: Long): Future[Option[Cours]] = {
//     dbConfig.db.run(courss.filter(_.id === id).result.headOption)
//   }
 
  

}