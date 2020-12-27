package models
import scala.beans.BeanProperty

class Niveau (val id:Int, val libelle:String){
  private var _idNiveau: Int = id
  private[this] var _libelleNiveau: String = libelle

  // getter libelleNiveau
  def libelleNiveau: String = _libelleNiveau
  // setter libelleNiveau_
  def libelleNiveau_=(value: String): Unit = {
    _libelleNiveau = value
  }
  // getter idNiveau
  def idNiveau: Int = _idNiveau
  // setter idiveau
  private def idNiveau_=(value: Int): Unit = {
    _idNiveau = value
  }


  override def toString = s"Niveau($libelleNiveau, $idNiveau)"
}
