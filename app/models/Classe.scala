package models
import com.google.inject.Inject
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile
import scala.concurrent.{ExecutionContext, Future}
import slick.jdbc.MySQLProfile.api._
 
case class Classe(val id:Long, val libelle:String, val id_niveau: Long)
case class ClasseFormData(libelle: String, id_niveau: Long)

object ClasseForm {
  val form = Form(
    mapping(
      "libelle" -> nonEmptyText,
      "id_niveau" -> longNumber
    )(ClasseFormData.apply)(ClasseFormData.unapply)
  )
}
class ClasseTableDef(tag: Tag) extends Table[Classe](tag, "classe") {
 
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def libelle = column[String]("libelle")
  def id_niveau = column[Long]("id_niveau")
 
  override def * = (id, libelle, id_niveau) <> (Classe.tupled, Classe.unapply)
}

class Classes @Inject()(
    protected val dbConfigProvider: DatabaseConfigProvider)
    (implicit executionContext: ExecutionContext)
    extends HasDatabaseConfigProvider[JdbcProfile] {
        var classes = TableQuery[ClasseTableDef]
    def add(classeItem: Classe): Future[String] = {
      dbConfig.db
      .run(classes += classeItem)
      .map(res => "ClasseItem successfully added")
      .recover {
        case ex: Exception => {
            printf(ex.getMessage())
            ex.getMessage
        }
      }
  }
   def delete(id: Long): Future[Int] = {
    dbConfig.db.run(classes.filter(_.id === id).delete)
  }

def update(classeItem: Classe): Future[Int] = {
    dbConfig.db
      .run(classes.filter(_.id === classeItem.id)
            .map(x => (x.libelle))
            .update(classeItem.libelle)
      )
  }

  def get(id: Long): Future[Option[Classe]] = {
    dbConfig.db.run(classes.filter(_.id === id).result.headOption)
  }
 
  def getAll: Future[Seq[Classe]] = {
    dbConfig.db.run(classes.result)
  }

}