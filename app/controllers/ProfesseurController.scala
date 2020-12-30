package controllers
  
import javax.inject._
import play.api.mvc._
import play.api.libs.json._
import models.{Professeur, ProfesseurForm}
 
import services.ProfesseurService
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
 
class ProfesseurController @Inject()(
    cc: ControllerComponents,
    professeurService: ProfesseurService
) extends AbstractController(cc) {
 
    implicit val professeurFormat = Json.format[Professeur]
 
    def getAll() = Action.async { implicit request: Request[AnyContent] =>
        professeurService.getAllItems map { items =>
          Ok(Json.toJson(items))
        }
      }
     
      // def getById(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   professeurService.getItem(id) map { item =>
      //     Ok(Json.toJson(item))
      //   }
      // }
     
      // def add() = Action.async { implicit request: Request[AnyContent] =>
      //   ProfesseurForm.form.bindFromRequest.fold(
      //     // if any error in submitted data
      //     errorForm => {
      //       errorForm.errors.foreach(println)
      //       Future.successful(BadRequest("Error!"))
      //     },
      //     data => {
      //       val newProfesseurItem = Professeur(0, data.libelle)
      //       professeurService.addItem(newProfesseurItem).map( _ => Redirect(routes.ProfesseurController.getAll))
      //     })
      // }
     
      // def update(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   ProfesseurForm.form.bindFromRequest.fold(
      //     // if any error in submitted data
      //     errorForm => {
      //       errorForm.errors.foreach(println)
      //       Future.successful(BadRequest("Error!"))
      //     },
      //     data => {
      //       val professeurItem = Professeur(id, data.libelle)
      //       professeurService.updateItem(ProfesseurItem).map( _ => Redirect(routes.ProfesseurController.getAll))
      //     })
      // }
     
      // def delete(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   professeurService.deleteItem(id) map { res =>
      //     Redirect(routes.ProfesseurController.getAll)
      //   }
      // }
}