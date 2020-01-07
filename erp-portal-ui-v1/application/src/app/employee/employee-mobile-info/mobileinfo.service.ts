import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MobileinfoService  {
  

 
  
 
  


  constructor(private http: HttpClient) { } 

  createMobileinfo(mobileinfo: Object): Observable<any> {
    
    
    console.log(mobileinfo);
      return this.http.post(`${'http://localhost:8081/api/v1/add/mob/details'}`, mobileinfo);
  }
  
  getMobileinfo( employeeCode: number): Observable<any> {
       
    return this.http.get(`${'http://localhost:8081/api/v1/get/mob/details'}/${ employeeCode}`);
  }
  updateMobileinfo(mobileinfo: Object): Observable<any> {
   
    return this.http.put(`${'http://localhost:8081/api/v1/edit/mob/details'}`, mobileinfo);
  }
  deleteMobileinfo(communicationDetail: number): Observable<any> {
    return this.http.delete(`${'http://localhost:8081/api/v1/delete/com/{empCode}/mob/{mobilecode}'}/${communicationDetail}`, { responseType: 'text' });
  }

}


