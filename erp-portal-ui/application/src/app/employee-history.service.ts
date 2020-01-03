import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { EmployeeHistory } from './employee-history';
import { EmployeeHistoryAddress } from './employee-history-address';


@Injectable({
  providedIn: 'root'
})
export class EmployeeHistoryService {
  private baseUrl = 'http://localhost:8080';
  constructor(private http: HttpClient) { }
  
  createEmployeeHistory(employeeHistory: Object): Observable<any> {
    var postUrl = this.baseUrl+'/employee/create';
    
    console.log(EmployeeHistory);
      return this.http.post(`${postUrl}`, EmployeeHistoryAddress);
  }

  getEmployeeHistory(id: number): Observable<any> {

    return this.http.get(`${this.baseUrl}/${id}`);
  }
  updateEmployeeHistory(id: number, value: any): Observable<any> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }
  deleteEmployeeHistory(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getEmployeesHistory(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
  getEmployeesHistoryList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
 

}
