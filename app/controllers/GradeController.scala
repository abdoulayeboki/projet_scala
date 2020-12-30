package controllers
  
import javax.inject._
import play.api.mvc._
import play.api.libs.json._
import models.{Grade, GradeForm}
 
import services.GradeService
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
 
class GradeController @Inject()(
    cc: ControllerComponents,
    gradeService: GradeService
) extends AbstractController(cc) {
 
    implicit val gradeFormat = Json.format[Grade]
 
    def getAll() = Action.async { implicit request: Request[AnyContent] =>
        gradeService.getAllItems map { items =>
          Ok(Json.toJson(items))
        }
      }
     
      // def getById(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   gradeService.getItem(id) map { item =>
      //     Ok(Json.toJson(item))
      //   }
      // }
     
      def add() = Action.async { implicit request: Request[AnyContent] =>
        GradeForm.form.bindFromRequest.fold(
          // if any error in submitted data
          errorForm => {
            errorForm.errors.foreach(println)
            Future.successful(BadRequest("Error!"))
          },
          data => {
            val newGradeItem = Grade(0, data.libelle)
            gradeService.addItem(newGradeItem).map( _ => Redirect(routes.GradeController.getAll))
          })
      }
     
      // def update(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   GradeForm.form.bindFromRequest.fold(
      //     // if any error in submitted data
      //     errorForm => {
      //       errorForm.errors.foreach(println)
      //       Future.successful(BadRequest("Error!"))
      //     },
      //     data => {
      //       val gradeItem = Grade(id, data.libelle)
      //       gradeService.updateItem(GradeItem).map( _ => Redirect(routes.GradeController.getAll))
      //     })
      // }
     
      // def delete(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      //   gradeService.deleteItem(id) map { res =>
      //     Redirect(routes.GradeController.getAll)
      //   }
      // }
}