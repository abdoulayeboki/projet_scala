import { Injectable } from '@angular/core';

import { map } from 'rxjs/operators';
import { Observable } from 'rxjs/index';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class EtudiantService {
 
constructor(private http: HttpClient) { }
  url = "api/getEtudiant";

  public getEtudiants(){
   return this.http.get(this.url);
 }
    
}
