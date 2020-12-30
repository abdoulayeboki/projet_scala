import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { map } from 'rxjs/operators';
import { Observable } from 'rxjs/index';
@Injectable({
  providedIn: 'root'
})
export class SalleService {

  constructor(private http: HttpClient) { }
  url = "api/getSalle";

 public getSalles(){
   return this.http.get(this.url);
 }
 
//  public postSalle(grade: any){
//   return this.http.post(`api/postSalle`,grade);
// }
}
