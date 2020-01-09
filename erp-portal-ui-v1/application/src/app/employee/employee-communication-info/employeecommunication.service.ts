import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs'
import { EmployeeCommunication } from './employeecommunication';
@Injectable({
  providedIn: 'root'
})
export class EmployeecommunicationService {
  
  
    
  


  constructor(private http: HttpClient) { } 


  createEmployeecommunication(employeecommunication: Object): Observable<any> {
    
    
    console.log(employeecommunication);
      return this.http.post(`${'http://localhost:8081/api/v1/add/com/details/'}`, employeecommunication);
  }
   
  getemployeecommunication(employeeCode: number): Observable<any> {
    
    return this.http.get(`${'http://localhost:8081/api/v1/get/com/details'}/${employeeCode}`);
  }
  updateEmployeecommunication(employeecommunication: Object): Observable<any> {
    
    
    console.log(employeecommunication);
      return this.http.put(`${'http://localhost:8081/api/v1/edit/com/details'}`, employeecommunication);
  }
  
  

}



