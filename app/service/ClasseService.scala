package services

import com.google.inject.Inject
import models.{Classe, Classes}
 
import scala.concurrent.Future

 class ClasseService @Inject() (items: Classes) {
 
  def addItem(item: Classe): Future[String] = {
    items.add(item)
  }
 
  def deleteItem(id: Long): Future[Int] = {
    items.delete(id)
  }
 
  def updateItem(item: Classe): Future[Int] = {
    items.update(item)
  }
 
  def getItem(id: Long): Future[Option[Classe]] = {
    items.get(id)
  }
 
  def getAllItems: Future[Seq[Classe]] = {
    items.getAll
  }
}
