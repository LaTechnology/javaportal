import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs'

@Injectable({
  providedIn: 'root'
})
export class EmployeeService  {

  private baseUrl = 'http://localhost:8081/springboot-crud-rest/api/v1/get/empinfo/{employeeCode}';

  constructor(private http: HttpClient) { }

  getEmployee(employeeCode: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${employeeCode}`);
  }

  createEmployee(employee: Object): Observable<any> {
    var postUrl = 'http://localhost:8081/springboot-crud-rest/api/v1/employee/add';
    var createBaseUrl=postUrl+"/employee/create";
    console.log(employee);
      return this.http.post(`${createBaseUrl}`, employee);
  }

  updateEmployee(employeeCode: number, value: any): Observable<any> {
    return this.http.put(`${this.baseUrl}/${employeeCode}`, value);
  }

  deleteEmployee(employeeCode: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${employeeCode}`, { responseType: 'text' });
  }

  getEmployeesList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}