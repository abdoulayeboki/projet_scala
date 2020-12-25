package models

import scala.collection.mutable.ListBuffer

class Matiere (code:String,libelle:String,coefficient:Int){
  private[this] var _codeMatiere: String = code
  private[this] var _libelleMatiere: String = libelle
  private[this] var _coefficientMatiere: Int = coefficient
  private[this] var _notes: ListBuffer[Note] = null
  private[this] var _cours: List[Cours] = null

  // definition de la methode permettant d'ajouter une note dans la collection _notes
  def addNotes(note: ListBuffer[Note]): ListBuffer[Note] = {
    if (_notes == null )
      _notes = note
    else
      _notes = note++_notes // ajout de la note au debut de la liste
    return _notes
  }

  // getter setter
  def cours: List[Cours] = _cours

  def cours_=(value: List[Cours]): Unit = {
    _cours = value
  }

  def notes: ListBuffer[Note] = _notes

  def notes_=(value: ListBuffer[Note]): Unit = {
    _notes = value
  }

  def codeMatiere: String = _codeMatiere

  def codeMatiere_=(value: String): Unit = {
    _codeMatiere = value
  }

  def libelleMatiere: String = _libelleMatiere

  def libelleMatiere_=(value: String): Unit = {
    _libelleMatiere = value
  }

  def coefficientMatiere: Int = _coefficientMatiere

  def coefficientMatiere_=(value: Int): Unit = {
    _coefficientMatiere = value
  }

  override def toString = s"Matiere($codeMatiere, $libelleMatiere)"
}
