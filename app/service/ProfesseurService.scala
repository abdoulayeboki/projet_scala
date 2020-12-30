package services

import com.google.inject.Inject
import models.{Professeur, Professeurs}
 
import scala.concurrent.Future

 class ProfesseurService @Inject() (items: Professeurs) {
  
   def getAllItems: Future[Seq[Professeur]] = {
    items.getAll
   }
 
  // def addItem(item: Professeur): Future[String] = {
  //   items.add(item)
  // }
 
  // def deleteItem(id: Long): Future[Int] = {
  //   items.delete(id)
  // }
 
  // def updateItem(item: Professeur): Future[Int] = {
  //   items.update(item)
  // }
 
  // def getItem(id: Long): Future[Option[Professeur]] = {
  //   items.get(id)
  // }
 
  
}
