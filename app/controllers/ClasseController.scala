package controllers
  
import javax.inject._
import play.api.mvc._
import play.api.libs.json._
import models.{Classe, ClasseForm}
 
import services.ClasseService
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
 
class ClasseController @Inject()(
    cc: ControllerComponents,
    classeService: ClasseService
) extends AbstractController(cc) {
 
    implicit val classeFormat = Json.format[Classe]
 
    def getAll() = Action.async { implicit request: Request[AnyContent] =>
        classeService.getAllItems map { items =>
          Ok(Json.toJson(items))
        }
      }
     
      // def getById(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   classeService.getItem(id) map { item =>
      //     Ok(Json.toJson(item))
      //   }
      // }
     
      // def add() = Action.async { implicit request: Request[AnyContent] =>
      //   ClasseForm.form.bindFromRequest.fold(
      //     // if any error in submitted data
      //     errorForm => {
      //       errorForm.errors.foreach(println)
      //       Future.successful(BadRequest("Error!"))
      //     },
      //     data => {
      //       val newClasseItem = Classe(0, data.libelle)
      //       classeService.addItem(newClasseItem).map( _ => Redirect(routes.ClasseController.getAll))
      //     })
      // }
     
      // def update(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   ClasseForm.form.bindFromRequest.fold(
      //     // if any error in submitted data
      //     errorForm => {
      //       errorForm.errors.foreach(println)
      //       Future.successful(BadRequest("Error!"))
      //     },
      //     data => {
      //       val classeItem = Classe(id, data.libelle)
      //       classeService.updateItem(ClasseItem).map( _ => Redirect(routes.ClasseController.getAll))
      //     })
      // }
     
      // def delete(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   classeService.deleteItem(id) map { res =>
      //     Redirect(routes.ClasseController.getAll)
      //   }
      // }
}