package models

class Professeur(var id:Int, nom:String, prenom:String, grade:Grade){
  // definition des attributs
  private[this] var _idProfesseur: Int = id
  private[this] var _nomProfesseur: String = nom
  private[this] var _prenomProfesseur: String = prenom
  private[this] var _gradeProfesseur: Grade = grade
  private[this] var _cours: List[Cours] = null

  // definition de la methode permettant d'ajouter un cours dans la collection _cours
  def addCours(cour: List[Cours]): List[Cours] = {
    if (cours == null)
      _cours = cour
    else
      _cours = cours ++ cour // ajout cours au debut de la liste
    return _cours
  }
  // getter setter
  def cours: List[Cours] = _cours

  def cours_=(value: List[Cours]): Unit = {
    _cours = value
  }

  def idProfesseur: Int = _idProfesseur

  def idProfesseur_=(value: Int): Unit = {
    _idProfesseur = value
  }

  def nomProfesseur: String = _nomProfesseur

  def nomProfesseur_=(value: String): Unit = {
    _nomProfesseur = value
  }

  def prenomProfesseur: String = _prenomProfesseur

  def prenomProfesseur_=(value: String): Unit = {
    _prenomProfesseur = value
  }


  def gradeProfesseur: Grade = _gradeProfesseur

  def gradeProfesseur_=(value: Grade): Unit = {
    _gradeProfesseur = value
  }
  // fin getter setter
  override def toString = s"Professeur($idProfesseur, $nomProfesseur, $prenomProfesseur, $gradeProfesseur)"
}
