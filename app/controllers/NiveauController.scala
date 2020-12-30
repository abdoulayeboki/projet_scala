package controllers
  
import javax.inject._
import play.api.mvc._
import play.api.libs.json._
import models.{Niveau, NiveauForm}
 
import services.NiveauService
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
 
class NiveauController @Inject()(
    cc: ControllerComponents,
    niveauService: NiveauService
) extends AbstractController(cc) {
 
    implicit val niveauFormat = Json.format[Niveau]
 
    def getAll() = Action.async { implicit request: Request[AnyContent] =>
        niveauService.getAllItems map { items =>
          Ok(Json.toJson(items))
        }
      }
     
      // def getById(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   niveauService.getItem(id) map { item =>
      //     Ok(Json.toJson(item))
      //   }
      // }
     
      // def add() = Action.async { implicit request: Request[AnyContent] =>
      //   NiveauForm.form.bindFromRequest.fold(
      //     // if any error in submitted data
      //     errorForm => {
      //       errorForm.errors.foreach(println)
      //       Future.successful(BadRequest("Error!"))
      //     },
      //     data => {
      //       val newNiveauItem = Niveau(0, data.libelle)
      //       niveauService.addItem(newNiveauItem).map( _ => Redirect(routes.NiveauController.getAll))
      //     })
      // }
     
      // def update(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   NiveauForm.form.bindFromRequest.fold(
      //     // if any error in submitted data
      //     errorForm => {
      //       errorForm.errors.foreach(println)
      //       Future.successful(BadRequest("Error!"))
      //     },
      //     data => {
      //       val niveauItem = Niveau(id, data.libelle)
      //       niveauService.updateItem(NiveauItem).map( _ => Redirect(routes.NiveauController.getAll))
      //     })
      // }
     
      // def delete(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   niveauService.deleteItem(id) map { res =>
      //     Redirect(routes.NiveauController.getAll)
      //   }
      // }
}