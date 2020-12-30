package services

import com.google.inject.Inject
import models.{Cours, Courss}
 
import scala.concurrent.Future

 class CoursService @Inject() (items: Courss) {
  
   def getAllItems: Future[Seq[Cours]] = {
    items.getAll
   }
 
  // def addItem(item: Cours): Future[String] = {
  //   items.add(item)
  // }
 
  // def deleteItem(id: Long): Future[Int] = {
  //   items.delete(id)
  // }
 
  // def updateItem(item: Cours): Future[Int] = {
  //   items.update(item)
  // }
 
  // def getItem(id: Long): Future[Option[Cours]] = {
  //   items.get(id)
  // }
 
  
}
