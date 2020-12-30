import { Component, OnInit } from '@angular/core';
import { MatiereService } from './../../service/matiere.service';


@Component({
  selector: 'app-matiere-list',
  templateUrl: './matiere-list.component.html',
  styleUrls: ['./matiere-list.component.css']
})
export class MatiereListComponent implements OnInit {

  private matieres :any

  constructor(private matiereService: MatiereService) { }

  ngOnInit() {
    this.getMatiere()
  }
  getMatiere(){
    this.matiereService.getMatieres().subscribe(
       data => {
        console.log(data);
        this.matieres = data;
      },
      error => {
        console.log(error);
      }
    );
  }
}
