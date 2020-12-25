package models
import scala.collection.mutable.ListBuffer

class Classe (id:Int,libelle:String,niv:Niveau){
  private[this] var _idClasse: Int = id
  private[this] var _libelleClasse: String = libelle
  private[this] var _niveau: Niveau = niv
  private[this] var _cours: List[Cours] = null


  // getter and setter
  def cours: List[Cours] = _cours

  def cours_=(value: List[Cours]): Unit = {
    _cours = value
  }

  def niveau: Niveau = _niveau

  def niveau_=(value: Niveau): Unit = {
    _niveau = value
  }

  def libelleClasse: String = _libelleClasse

  def libelleClasse_=(value: String): Unit = {
    _libelleClasse = value
  }

  def idClasse: Int = _idClasse

  def idClasse_=(value: Int): Unit = {
    _idClasse = value
  }
  // fin getter setter

  override def toString = s"Classe($niveau, $libelleClasse, $idClasse)"
}
