package models
import com.google.inject.Inject
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile
import scala.concurrent.{ExecutionContext, Future}
import slick.jdbc.MySQLProfile.api._
 
case class Grade(val id:Long, val libelle:String)
case class GradeFormData(libelle: String)

object GradeForm {
  val form = Form(
    mapping(
      "libelle" -> nonEmptyText
    )(GradeFormData.apply)(GradeFormData.unapply)
  )
}
class GradeTableDef(tag: Tag) extends Table[Grade](tag, "grade") {
 
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def libelle = column[String]("libelle")
 
  override def * = (id, libelle) <> (Grade.tupled, Grade.unapply)
}

class Grades @Inject()(
    protected val dbConfigProvider: DatabaseConfigProvider)
    (implicit executionContext: ExecutionContext)
    extends HasDatabaseConfigProvider[JdbcProfile] {
        var grades = TableQuery[GradeTableDef]
    def add(gradeItem: Grade): Future[String] = {
      dbConfig.db
      .run(grades += gradeItem)
      .map(res => "GradeItem successfully added")
      .recover {
        case ex: Exception => {
            printf(ex.getMessage())
            ex.getMessage
        }
      }
  }
   def delete(id: Long): Future[Int] = {
    dbConfig.db.run(grades.filter(_.id === id).delete)
  }

def update(gradeItem: Grade): Future[Int] = {
    dbConfig.db
      .run(grades.filter(_.id === gradeItem.id)
            .map(x => (x.libelle))
            .update(gradeItem.libelle)
      )
  }

  def get(id: Long): Future[Option[Grade]] = {
    dbConfig.db.run(grades.filter(_.id === id).result.headOption)
  }
 
  def getAll: Future[Seq[Grade]] = {
    dbConfig.db.run(grades.result)
  }

}