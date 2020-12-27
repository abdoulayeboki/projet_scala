
package models
class Note(devoir_1:Double, devoir_2:Double, exam:Double, valide:Boolean, etud: Etudiant, mat:Matiere) {
  private[this] var _devoir1: Double = devoir_1
  private[this] var _examen: Double = exam
  private[this] var _devoir2: Double = devoir_2
  private[this] var _etudiant: Etudiant = etud
  private[this] var _matiere: Matiere = mat

  // creation d'un constructeur
  def this(etu:Etudiant,mat:Matiere) = this(0,0,0,false,etu,mat)

  def etudiant: Etudiant = _etudiant

  def etudiant_=(value: Etudiant): Unit = {
    _etudiant = value
  }


  def matiere: Matiere = _matiere

  def matiere_=(value: Matiere): Unit = {
    _matiere = value
  }

  def devoir1: Double = _devoir1

  def devoir1_=(value: Double): Unit = {
    _devoir1 = value
  }


  def devoir2: Double = _devoir2

  def devoir2_=(value: Double): Unit = {
    _devoir2 = value
  }


  def examen: Double = _examen

  def examen_=(value: Double): Unit = {
    _examen = value
  }


  override def toString = s"Note($etudiant, $matiere, $devoir1, $devoir2, $examen)"
}
