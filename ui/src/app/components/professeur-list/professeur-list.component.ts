import { Component, OnInit } from '@angular/core';
import { ProfesseurService } from './../../service/professeur.service';

@Component({
  selector: 'app-professeur-list',
  templateUrl: './professeur-list.component.html',
  styleUrls: ['./professeur-list.component.css']
})
export class ProfesseurListComponent implements OnInit {

  private professeurs : any
  constructor(private professeurService: ProfesseurService) { }

  ngOnInit() {
    this.getProfesseurs()
  }
  getProfesseurs(){
    this.professeurService.getProfesseurs().subscribe(
       data => {
        console.log(data);
        this.professeurs = data;
      },
      error => {
        console.log(error);
      }
    );
  }

}
