package controllers
  
import javax.inject._
import play.api.mvc._
import play.api.libs.json._
import models.{Cours, CoursForm}
 
import services.CoursService
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
 
class CoursController @Inject()(
    cc: ControllerComponents,
    coursService: CoursService
) extends AbstractController(cc) {
 
    implicit val coursFormat = Json.format[Cours]
 
    def getAll() = Action.async { implicit request: Request[AnyContent] =>
        coursService.getAllItems map { items =>
          Ok(Json.toJson(items))
        }
      }
     
      // def getById(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   coursService.getItem(id) map { item =>
      //     Ok(Json.toJson(item))
      //   }
      // }
     
      // def add() = Action.async { implicit request: Request[AnyContent] =>
      //   CoursForm.form.bindFromRequest.fold(
      //     // if any error in submitted data
      //     errorForm => {
      //       errorForm.errors.foreach(println)
      //       Future.successful(BadRequest("Error!"))
      //     },
      //     data => {
      //       val newCoursItem = Cours(0, data.libelle)
      //       coursService.addItem(newCoursItem).map( _ => Redirect(routes.CoursController.getAll))
      //     })
      // }
     
      // def update(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   CoursForm.form.bindFromRequest.fold(
      //     // if any error in submitted data
      //     errorForm => {
      //       errorForm.errors.foreach(println)
      //       Future.successful(BadRequest("Error!"))
      //     },
      //     data => {
      //       val coursItem = Cours(id, data.libelle)
      //       coursService.updateItem(CoursItem).map( _ => Redirect(routes.CoursController.getAll))
      //     })
      // }
     
      // def delete(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   coursService.deleteItem(id) map { res =>
      //     Redirect(routes.CoursController.getAll)
      //   }
      // }
}