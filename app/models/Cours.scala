package models
import java.util.Date

class Cours (dateD:Date,dateF:Date,prof:Professeur,sal:Salle,mat:Matiere,clas: Classe){
  private[this] var _dateDebut: Date = dateD
  private[this] var _dateFin: Date = dateF
  private[this] var _professeur: Professeur = prof
  private[this] var _salle: Salle = sal
  private[this] var _matiere: Matiere = mat
  private[this] var _classe: Classe = clas

  def classe: Classe = _classe

  def classe_=(value: Classe): Unit = {
    _classe = value
  }

  def matiere: Matiere = _matiere

  def matiere_=(value: Matiere): Unit = {
    _matiere = value
  }

  def salle: Salle = _salle

  def salle_=(value: Salle): Unit = {
    _salle = value
  }


  def professeur: Professeur = _professeur

  def professeur_=(value: Professeur): Unit = {
    _professeur = value
  }


  def dateFin: Date = _dateFin

  def dateFin_=(value: Date): Unit = {
    _dateFin = value
  }


  def dateDebut: Date = _dateDebut

  def dateDebut_=(value: Date): Unit = {
    _dateDebut = value
  }


  override def toString = s"Cours($classe, $matiere, $salle, $professeur, $dateFin, $dateDebut)"
}
