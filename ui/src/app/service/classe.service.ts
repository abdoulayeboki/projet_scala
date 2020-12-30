import { Injectable } from '@angular/core';
// import { HttpClient } from '@angular/common/http';

import { map } from 'rxjs/operators';
import { Observable } from 'rxjs/index';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ClasseService {

  constructor(private http: HttpClient) { }
    url = "api/getClasse";

   public getClasses(){
     return this.http.get(this.url);
   }
}
