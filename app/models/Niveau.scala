package models
import com.google.inject.Inject
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile
import scala.concurrent.{ExecutionContext, Future}
import slick.jdbc.MySQLProfile.api._
 
case class Niveau(val id:Long, val libelle:String)
case class NiveauFormData(libelle: String)

object NiveauForm {
  val form = Form(
    mapping(
      "libelle" -> nonEmptyText
    )(NiveauFormData.apply)(NiveauFormData.unapply)
  )
}
class NiveauTableDef(tag: Tag) extends Table[Niveau](tag, "niveau") {
 
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def libelle = column[String]("libelle")
 
  override def * = (id, libelle) <> (Niveau.tupled, Niveau.unapply)
}

class Niveaus @Inject()(
    protected val dbConfigProvider: DatabaseConfigProvider)
    (implicit executionContext: ExecutionContext)
    extends HasDatabaseConfigProvider[JdbcProfile] {
        var niveaus = TableQuery[NiveauTableDef]
    def add(niveauItem: Niveau): Future[String] = {
      dbConfig.db
      .run(niveaus += niveauItem)
      .map(res => "NiveauItem successfully added")
      .recover {
        case ex: Exception => {
            printf(ex.getMessage())
            ex.getMessage
        }
      }
  }
   def delete(id: Long): Future[Int] = {
    dbConfig.db.run(niveaus.filter(_.id === id).delete)
  }

def update(niveauItem: Niveau): Future[Int] = {
    dbConfig.db
      .run(niveaus.filter(_.id === niveauItem.id)
            .map(x => (x.libelle))
            .update(niveauItem.libelle)
      )
  }

  def get(id: Long): Future[Option[Niveau]] = {
    dbConfig.db.run(niveaus.filter(_.id === id).result.headOption)
  }
 
  def getAll: Future[Seq[Niveau]] = {
    dbConfig.db.run(niveaus.result)
  }

}