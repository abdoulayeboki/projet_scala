package services

import com.google.inject.Inject
import models.{Etudiant, Etudiants}
 
import scala.concurrent.Future

 class EtudiantService @Inject() (items: Etudiants) {
  
   def getAllItems: Future[Seq[Etudiant]] = {
    items.getAll
   }
 
  // def addItem(item: Etudiant): Future[String] = {
  //   items.add(item)
  // }
 
  // def deleteItem(id: Long): Future[Int] = {
  //   items.delete(id)
  // }
 
  // def updateItem(item: Etudiant): Future[Int] = {
  //   items.update(item)
  // }
 
  // def getItem(id: Long): Future[Option[Etudiant]] = {
  //   items.get(id)
  // }
 
  
}
