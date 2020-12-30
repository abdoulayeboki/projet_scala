import { Component, OnInit } from '@angular/core';
import { SalleService } from 'src/app/service/salle.service';

@Component({
  selector: 'app-salle-list',
  templateUrl: './salle-list.component.html',
  styleUrls: ['./salle-list.component.css']
})
export class SalleListComponent implements OnInit {

  private salles :any
  constructor(private salleServiceService : SalleService) { }
  
  ngOnInit() {
    this.getSalles()
  }

  getSalles(){
    this.salleServiceService.getSalles().subscribe(
       data => {
        console.log(data);
        this.salles = data;
      },
      error => {
        console.log(error);
      }
    );
  }

}
