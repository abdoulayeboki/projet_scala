
import { GradeServiceService } from './../../service/grade-service.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-grade-list',
  templateUrl: './grade-list.component.html',
  styleUrls: ['./grade-list.component.css']
})
export class GradeListComponent implements OnInit {
  private grades :any
  constructor(private gradeServiceService : GradeServiceService) { }
  
  ngOnInit() {
    this.getGrades()
  }

  getGrades(){
    this.gradeServiceService.getGrades().subscribe(
       data => {
        console.log(data);
        this.grades = data;
      },
      error => {
        console.log(error);
      }
    );
  }

}
