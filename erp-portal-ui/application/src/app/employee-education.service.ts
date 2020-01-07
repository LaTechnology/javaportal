import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { EmployeeEducationDetails } from './employee-education-details';

@Injectable({
  providedIn: 'root'
})
export class EmployeeEducationService {

 
  constructor(private http: HttpClient) { }
  
  createEmployeeEducation(employeeEducation: Object): Observable<any> {
    
    console.log(EmployeeEducationDetails);
      return this.http.post(`${'http://localhost:8081/add/educationdetails'}`, EmployeeEducationDetails);
  }

  getEmployeeEducation(id: number=11813): Observable<any> {
    return this.http.get(`${'http://localhost:8081/get/educationdetails'}/${id}`);
  }
  updateEmployeeEducation(id: number, value: any): Observable<any> {
    return this.http.put(`${''}/${id}`, value);
  }

  deleteEmployeeEducation(id: number): Observable<any> {
    return this.http.delete(`${''}/${id}`, { responseType: 'text' });
  }

  getEmployeesEducationList(): Observable<any> {
    return this.http.get(`${''}`);
  }

}
