import { Component, OnInit } from '@angular/core';
import { EtudiantService } from './../../service/etudiant.service';
@Component({
  selector: 'app-etudiant-list',
  templateUrl: './etudiant-list.component.html',
  styleUrls: ['./etudiant-list.component.css']
})
export class EtudiantListComponent implements OnInit {
  private etudiants : any
  constructor(private etudiantService: EtudiantService) { }

  ngOnInit() {
    this.getEtudiants()
  }
  getEtudiants(){
    this.etudiantService.getEtudiants().subscribe(
       data => {
        console.log(data);
        this.etudiants = data;
      },
      error => {
        console.log(error);
      }
    );
  }

}
