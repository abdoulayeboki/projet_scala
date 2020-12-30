import { Injectable } from '@angular/core';
import { map } from 'rxjs/operators';
import { Observable } from 'rxjs/index';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ProfesseurService {
  constructor(private http: HttpClient) { }
  url = "api/getProfesseur";

  public getProfesseurs(){
   return this.http.get(this.url);
 }
}
