import { Component, OnInit } from '@angular/core';
import { NiveauService } from './../../service/niveau.service';

@Component({
  selector: 'app-niveau-list',
  templateUrl: './niveau-list.component.html',
  styleUrls: ['./niveau-list.component.css']
})
export class NiveauListComponent implements OnInit {
  private niveaux : any

  constructor(private niveauService: NiveauService) { }

   ngOnInit() {
    this.getNiveaus()
  }

  getNiveaus(){
    this.niveauService.getNiveaus().subscribe(
       data => {
        console.log(data);
        this.niveaux = data;
      },
      error => {
        console.log(error);
      }
    );
  }
}
