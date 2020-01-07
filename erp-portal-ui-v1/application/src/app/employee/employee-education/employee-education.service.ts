import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeEducationService {

 
  constructor(private http: HttpClient) { }
  
  createEmployeeEducation(employeeEducation: Object): Observable<any> {
      console.log(employeeEducation);
      return this.http.post(`${'http://localhost:8081/add/educationdetails'}`, employeeEducation);
  }

  getEmployeeEducation(id: number): Observable<any> {
    //var id=employeeNumber;
    //var id=11813; //testing
    return this.http.get(`${'http://localhost:8081/get/educationdetails'}/${id}`);
  }
  updateEmployeeEducation(employeeEducation: Object): Observable<any> {
    //var id=employeeNumber;
     //testing
    return this.http.put(`${'http://localhost:8081/edit/educationdetails/'}`, employeeEducation);
  }

  deleteEmployeeEducation(employeeNumber: number): Observable<any> {
    //var id=employeeNumber;
    var id=11814; //testing
    return this.http.delete(`${''}/${id}`, { responseType: 'text' });
  }

  getEmployeesEducationList(): Observable<any> {
    return this.http.get(`${'http://localhost:8081/get/educationdetails'}`);
  }

}
