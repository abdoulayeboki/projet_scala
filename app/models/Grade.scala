package models
class Grade(val id:Int, val libelle:String){
  private var _idGrade: Int = id
  private[this] var _libelleGrade: String = libelle

  // getter libelleGrade
  def libelleGrade: String = _libelleGrade
  // setter libelleGrade_
  def libelleGrade_=(value: String): Unit = {
    _libelleGrade = value
  }
  // getter idGrade
  def idGrade: Int = _idGrade
  // setter idiveau
  private def idGrade_=(value: Int): Unit = {
    _idGrade = value
  }


  override def toString = s"Grade($idGrade,$libelleGrade)"
}
