import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs'
import { EmployeeCommunication } from './employeecommunication';
@Injectable({
  providedIn: 'root'
})
export class EmployeecommunicationService {
  
  
     private baseurl= 'http://localhost:8081/api/v1';
  


  constructor(private http: HttpClient) { } 


  createEmployeecommunication(employeecommunication: Object): Observable<any> {
    var postUrl = 'http://localhost:8081/api/v1';
    var createBaseUrl=postUrl+"/employee/create";
    console.log(employeecommunication);
      return this.http.post(`${createBaseUrl}`, employeecommunication);
  }
   
  getemployeecommunication(id: number): Observable<any> {
    
    return this.http.get(`${this. baseurl}/${id}`);
  }
  updatecommunication(id: number, value: any): Observable<any> {
    return this.http.put(`${this.baseurl}/${id}`, value);
  }
  getcommunicationinfodetailsList(): Observable<any> {
    return this.http.get(`${this.baseurl}`);
  }
  deleteEmployeecommunication(id: number): Observable<any> {
    return this.http.delete(`${this.baseurl}/${id}`, { responseType: 'text' });
  }






}
