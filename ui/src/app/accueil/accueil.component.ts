import { Component, OnInit } from '@angular/core';
import { AppService } from '.././app.service';

@Component({
  selector: 'app-accueil',
  templateUrl: './accueil.component.html',
  styleUrls: ['./accueil.component.css']
})
export class AccueilComponent implements OnInit {
  constructor(private appService: AppService) {
    this.appService.getTodos().subscribe((data: any) => {
      
    });
  }

  ngOnInit() {
  }

}
