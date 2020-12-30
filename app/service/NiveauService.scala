package services

import com.google.inject.Inject
import models.{Niveau, Niveaus}
 
import scala.concurrent.Future

 class NiveauService @Inject() (items: Niveaus) {
 
  def addItem(item: Niveau): Future[String] = {
    items.add(item)
  }
 
  def deleteItem(id: Long): Future[Int] = {
    items.delete(id)
  }
 
  def updateItem(item: Niveau): Future[Int] = {
    items.update(item)
  }
 
  def getItem(id: Long): Future[Option[Niveau]] = {
    items.get(id)
  }
 
  def getAllItems: Future[Seq[Niveau]] = {
    items.getAll
  }
}
