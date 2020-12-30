package controllers
  
import javax.inject._
import play.api.mvc._
import play.api.libs.json._
import models.{Etudiant, EtudiantForm}
 
import services.EtudiantService
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
 
class EtudiantController @Inject()(
    cc: ControllerComponents,
    etudiantService: EtudiantService
) extends AbstractController(cc) {
 
    implicit val etudiantFormat = Json.format[Etudiant]
 
    def getAll() = Action.async { implicit request: Request[AnyContent] =>
        etudiantService.getAllItems map { items =>
          Ok(Json.toJson(items))
        }
      }
     
      // def getById(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   etudiantService.getItem(id) map { item =>
      //     Ok(Json.toJson(item))
      //   }
      // }
     
      // def add() = Action.async { implicit request: Request[AnyContent] =>
      //   EtudiantForm.form.bindFromRequest.fold(
      //     // if any error in submitted data
      //     errorForm => {
      //       errorForm.errors.foreach(println)
      //       Future.successful(BadRequest("Error!"))
      //     },
      //     data => {
      //       val newEtudiantItem = Etudiant(0, data.libelle)
      //       etudiantService.addItem(newEtudiantItem).map( _ => Redirect(routes.EtudiantController.getAll))
      //     })
      // }
     
      // def update(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   EtudiantForm.form.bindFromRequest.fold(
      //     // if any error in submitted data
      //     errorForm => {
      //       errorForm.errors.foreach(println)
      //       Future.successful(BadRequest("Error!"))
      //     },
      //     data => {
      //       val etudiantItem = Etudiant(id, data.libelle)
      //       etudiantService.updateItem(EtudiantItem).map( _ => Redirect(routes.EtudiantController.getAll))
      //     })
      // }
     
      // def delete(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   etudiantService.deleteItem(id) map { res =>
      //     Redirect(routes.EtudiantController.getAll)
      //   }
      // }
}