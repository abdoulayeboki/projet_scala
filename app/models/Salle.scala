package models
class Salle(val numero:Int, val libelle:String){
  private[this] var _numeroSalle: Int = numero
  private[this] var _libelleSalle: String = libelle
  private[this] var _cours: List[Cours] = null

  def cours: List[Cours] = _cours

  def cours_=(value: List[Cours]): Unit = {
    _cours = value
  }

  def numeroSalle: Int = _numeroSalle

  def numeroSalle_=(value: Int): Unit = {
    _numeroSalle = value
  }

  def libelleSalle: String = _libelleSalle

  def libelleSalle_=(value: String): Unit = {
    _libelleSalle = value
  }


  override def toString = s"Salle($numeroSalle, $libelleSalle)"
}
