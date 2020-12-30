import { CoursService } from './../../service/cours.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cours-list',
  templateUrl: './cours-list.component.html',
  styleUrls: ['./cours-list.component.css']
})
export class CoursListComponent implements OnInit {
  private cours :any

  constructor(private coursService: CoursService) { }

  ngOnInit() {
    this.getClasses()
  }
  getClasses(){
    this.coursService.getClasses().subscribe(
       data => {
        console.log(data);
        this.cours = data;
      },
      error => {
        console.log(error);
      }
    );
  }

}
