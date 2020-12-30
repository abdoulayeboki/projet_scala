import { GradeServiceService } from './../../service/grade-service.service';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-grade-add',
  templateUrl: './grade-add.component.html',
  styleUrls: ['./grade-add.component.css']
})
export class GradeAddComponent implements OnInit {

  constructor(private gradeServiceService: GradeServiceService ) { }

  ngOnInit() {
  }
  addGrade(){
     this.gradeServiceService.postGrade("{'libelle':'B'}").subscribe(
       data => {
         console.log(data)
       },
       error => {
         console.log(error)
       }
      );
  }

}
