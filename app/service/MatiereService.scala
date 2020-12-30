package services

import com.google.inject.Inject
import models.{Matiere, Matieres}
 
import scala.concurrent.Future

 class MatiereService @Inject() (items: Matieres) {
  
   def getAllItems: Future[Seq[Matiere]] = {
    items.getAll
   }
 
  // def addItem(item: Matiere): Future[String] = {
  //   items.add(item)
  // }
 
  // def deleteItem(id: Long): Future[Int] = {
  //   items.delete(id)
  // }
 
  // def updateItem(item: Matiere): Future[Int] = {
  //   items.update(item)
  // }
 
  // def getItem(id: Long): Future[Option[Matiere]] = {
  //   items.get(id)
  // }
 
  
}
