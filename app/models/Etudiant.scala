package models

class Etudiant (var id:Int, nom:String, prenom:String, classe:Classe){
  // definition des fields
  private[this] var _idEtudiant: Int = id
  private[this] var _nomEtudiant: String = nom
  private[this] var _prenomEtudiant: String = prenom
  private[this] var _classeEtudiant: Classe = classe
  private[this] var _notes: List[Note] = null

  // definition de la methode permettant d'ajouter une note dans la collection _notes
  def addNotes(note: Note): List[Note] = {
   notes = note+:_notes // ajout de la note au debut de la liste
    return notes
  }

  // getter et setter  de la variable _notes
  def notes: List[Note] = _notes

  def notes_=(value: List[Note]): Unit = {
    _notes = value
  }
  // getter et setter  de la variable _idEtudiant
  def idEtudiant: Int = _idEtudiant

  def idEtudiant_=(value: Int): Unit = {
    _idEtudiant = value
  }
  // getter et setter  de la variable _nomEtudiant
  def nomEtudiant: String = _nomEtudiant

  def nomEtudiant_=(value: String): Unit = {
    _nomEtudiant = value
  }
  // getter et setter  de la variable _prenomEtudiant
  def prenomEtudiant: String = _prenomEtudiant

  def prenomEtudiant_=(value: String): Unit = {
    _prenomEtudiant = value
  }

  // getter et setter  de la variable _classeEtudiant
  def classeEtudiant: Classe = _classeEtudiant

  def classeEtudiant_=(value: Classe): Unit = {
    _classeEtudiant = value
  }
  // redefinition de la methode toString
  override def toString = s"Etudiant($id, $idEtudiant, $nomEtudiant, $prenomEtudiant, $classeEtudiant)"
}
