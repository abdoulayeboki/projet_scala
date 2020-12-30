package services

import com.google.inject.Inject
import models.{Salle, Salles}
 
import scala.concurrent.Future
 
class SalleService @Inject() (items: Salles) {
 
  def getAllItems: Future[Seq[Salle]] = {
    items.getAll
  }
  // def addItem(item: Salle): Future[String] = {
  //   items.add(item)
  // }
 
  // def deleteItem(id: Long): Future[Int] = {
  //   items.delete(id)
  // }
 
  // def updateItem(item: Salle): Future[Int] = {
  //   items.update(item)
  // }
 
  // def getItem(id: Long): Future[Option[Salle]] = {
  //   items.get(id)
  // }
 
  
}