package services

import com.google.inject.Inject
import models.{Grade, Grades}
 
import scala.concurrent.Future
 
class GradeService @Inject() (items: Grades) {
 
  def addItem(item: Grade): Future[String] = {
    items.add(item)
  }
 
  def deleteItem(id: Long): Future[Int] = {
    items.delete(id)
  }
 
  def updateItem(item: Grade): Future[Int] = {
    items.update(item)
  }
 
  def getItem(id: Long): Future[Option[Grade]] = {
    items.get(id)
  }
 
  def getAllItems: Future[Seq[Grade]] = {
    items.getAll
  }
}