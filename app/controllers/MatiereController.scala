package controllers
  
import javax.inject._
import play.api.mvc._
import play.api.libs.json._
import models.{Matiere, MatiereForm}
 
import services.MatiereService
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
 
class MatiereController @Inject()(
    cc: ControllerComponents,
    matiereService: MatiereService
) extends AbstractController(cc) {
 
    implicit val matiereFormat = Json.format[Matiere]
 
    def getAll() = Action.async { implicit request: Request[AnyContent] =>
        matiereService.getAllItems map { items =>
          Ok(Json.toJson(items))
        }
      }
     
      // def getById(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   matiereService.getItem(id) map { item =>
      //     Ok(Json.toJson(item))
      //   }
      // }
     
      // def add() = Action.async { implicit request: Request[AnyContent] =>
      //   MatiereForm.form.bindFromRequest.fold(
      //     // if any error in submitted data
      //     errorForm => {
      //       errorForm.errors.foreach(println)
      //       Future.successful(BadRequest("Error!"))
      //     },
      //     data => {
      //       val newMatiereItem = Matiere(0, data.libelle)
      //       matiereService.addItem(newMatiereItem).map( _ => Redirect(routes.MatiereController.getAll))
      //     })
      // }
     
      // def update(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   MatiereForm.form.bindFromRequest.fold(
      //     // if any error in submitted data
      //     errorForm => {
      //       errorForm.errors.foreach(println)
      //       Future.successful(BadRequest("Error!"))
      //     },
      //     data => {
      //       val matiereItem = Matiere(id, data.libelle)
      //       matiereService.updateItem(MatiereItem).map( _ => Redirect(routes.MatiereController.getAll))
      //     })
      // }
     
      // def delete(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   matiereService.deleteItem(id) map { res =>
      //     Redirect(routes.MatiereController.getAll)
      //   }
      // }
}