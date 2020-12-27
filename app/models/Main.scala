package models

import java.util.Date
import scala.collection.mutable.ListBuffer

object Main {
  def main(args: Array[String]) {
    var niveau: Niveau = new Niveau(1,"ffgg")
    var classe = new Classe(23,"classe A",niveau)
    niveau.idNiveau
    var etudiant = new Etudiant(2,"sarr","prenom",classe)
    var etudiant1 = new Etudiant(24,"ba","ouz",classe)
    etudiant.idEtudiant_=  (44)
    var salle = new Salle(2,"B")
    var grade = new Grade(4,"A")
    val professeur = new Professeur(3,"sow","laye",grade )
    professeur.idProfesseur_= (2)
    var matiere = new Matiere("mat","Mathematique",4)
    var add = matiere.addNotes(ListBuffer(new Note(devoir_1 = 100,23,32,true,etudiant,matiere)))
    var note = new Note(etudiant,matiere)
    var note1 = new Note(etudiant,matiere)
    // recuperer le nom de l'etudiant dans etudiantMatiere
    println(note.etudiant.nomEtudiant)
    // ajouter le note à etudiant
    etudiant.notes_= (List(note,note1))

    matiere.notes_= (ListBuffer (note,note1))
    var cours = new Cours(new Date(),new Date(),professeur,salle,matiere,classe)
    salle.cours = List(cours)


    var ajouNote = etudiant.addNotes(new Note(12,12,13,true,etudiant,matiere))
    var addn = matiere.addNotes(ListBuffer(new Note(342,20,13,true,etudiant,matiere)))
    professeur.addCours(List(cours))

    println(matiere.notes)
    println(professeur.cours)
    println(classe)
    println(cours)
    println("les notes de la matiere"+ matiere.libelleMatiere+"sont "+ matiere.notes)
    println(etudiant.notes)
    println(note)
    println(matiere)
    println(professeur)
    println(salle)
    println(niveau)
    println(etudiant)
  }
}
