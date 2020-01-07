import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MobileinfoService  {

  private baseUrl = 'localhost:8081/api/v1/get/mob/details';
  puttbaseUrl: any;
  
 
  


  constructor(private http: HttpClient) { } 

  createMobileinfo(mobileinfo: Object): Observable<any> {
    var postUrl = 'http://localhost:8081/api/v1';
    var createBaseUrl=postUrl+"/add/mob/details";
    console.log(mobileinfo);
      return this.http.post(`${this.baseUrl}`, mobileinfo);
  }
  
  getMobileinfo(code: number=111): Observable<any> {
       
    return this.http.get(`${this.baseUrl}/${code}`);
  }
  updateMobileinfo(code: number, value: any): Observable<any> {
    var puturl='http://localhost:8081/api/v1'
    var puttbaseUrl=puturl+"/edit/mob/details";
    return this.http.put(`${this.puttbaseUrl}/${code}`, value);
  }
  getmobinfodetailsList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
  deleteMobileinfo(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

}


