import { environment } from './../../environments/environment';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { map } from 'rxjs/operators';
import { Observable } from 'rxjs/index';

@Injectable({
  providedIn: 'root'
})
export class GradeServiceService {

  constructor(private http: HttpClient) { }
    urlGradeAll = "api/gradeAll";

   public getGrades(){
     return this.http.get(this.urlGradeAll);
   }
   
  
}
