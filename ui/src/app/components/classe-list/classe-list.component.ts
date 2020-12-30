import { ClasseService } from './../../service/classe.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-classe-list',
  templateUrl: './classe-list.component.html',
  styleUrls: ['./classe-list.component.css']
})
export class ClasseListComponent implements OnInit {
  private classes :any

  constructor(private classeService: ClasseService) { }

  ngOnInit() {
    this.getClasses()
  }
  getClasses(){
    this.classeService.getClasses().subscribe(
       data => {
        console.log(data);
        this.classes = data;
      },
      error => {
        console.log(error);
      }
    );
  }
}
