import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeaddressService {

  private baseUrl = 'http://localhost:8080/api/v1/employees';

  constructor(private http: HttpClient) { }

  getEmployeeAddress(empid: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${empid}`);
  }

  createEmployeeAddress(employeeaddress: Object): Observable<any> {
      return this.http.post(`${this.baseUrl}`, employeeaddress);
  }

  updateEmployeeAddress(empid: number, value: any): Observable<any> {
    return this.http.put(`${this.baseUrl}/${empid}`, value);
  }

  deleteEmployeeAddress(empid: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${empid}`, { responseType: 'text' });
  }

  getEmployeesAddressList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}

