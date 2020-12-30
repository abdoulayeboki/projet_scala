import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { map } from 'rxjs/operators';
import { Observable } from 'rxjs/index';
@Injectable({
  providedIn: 'root'
})
export class NiveauService {

  constructor(private http: HttpClient) { }
    url = "api/getNiveau";

   public getNiveaus(){
     return this.http.get(this.url);
   }
   
  //  public postNiveau(iveau: any){
  //   return this.http.post(`api/postNiveau`,iveau);
  // }
}
