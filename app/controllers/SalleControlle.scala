package controllers
  
import javax.inject._
import play.api.mvc._
import play.api.libs.json._
import models.{Salle, SalleForm}
 
import services.SalleService
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
 
class SalleController @Inject()(
    cc: ControllerComponents,
    salleService: SalleService
) extends AbstractController(cc) {
 
    implicit val salleFormat = Json.format[Salle]
 
    def getAll() = Action.async { implicit request: Request[AnyContent] =>
        salleService.getAllItems map { items =>
          Ok(Json.toJson(items))
        }
      }
     
      // def getById(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   salleService.getItem(id) map { item =>
      //     Ok(Json.toJson(item))
      //   }
      // }
     
      // def add() = Action.async { implicit request: Request[AnyContent] =>
      //   SalleForm.form.bindFromRequest.fold(
      //     // if any error in submitted data
      //     errorForm => {
      //       errorForm.errors.foreach(println)
      //       Future.successful(BadRequest("Error!"))
      //     },
      //     data => {
      //       val newSalleItem = Salle(0, data.libelle)
      //       salleService.addItem(newSalleItem).map( _ => Redirect(routes.SalleController.getAll))
      //     })
      // }
     
      // def update(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   SalleForm.form.bindFromRequest.fold(
      //     // if any error in submitted data
      //     errorForm => {
      //       errorForm.errors.foreach(println)
      //       Future.successful(BadRequest("Error!"))
      //     },
      //     data => {
      //       val salleItem = Salle(id, data.libelle)
      //       salleService.updateItem(SalleItem).map( _ => Redirect(routes.SalleController.getAll))
      //     })
      // }
     
      // def delete(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   salleService.deleteItem(id) map { res =>
      //     Redirect(routes.SalleController.getAll)
      //   }
      // }
}