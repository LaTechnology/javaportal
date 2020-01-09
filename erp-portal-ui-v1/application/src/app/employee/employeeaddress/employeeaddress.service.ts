import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeaddressService{
  constructor(private http: HttpClient) { }

  getEmployeeAddressVO(employeeCode: number): Observable<any> 
  {
    return this.http.get(`${'http://localhost:8081/api/v1/get/address'}/${employeeCode}`) 
  }

  createEmployeeAddressVO(employeeaddressvo: Object): Observable<any> {
    console.log(employeeaddressvo);
      return this.http.post(`${'http://localhost:8081/api/v1/add/address/'}`, employeeaddressvo, { responseType: 'text' });
  }

  updateEmployeeAddressVO(employeeaddressvo: Object): Observable<any> {
    return this.http.put(`${'http://localhost:8081/api/v1/edit/employee/address/'}`,employeeaddressvo);
  }

  deleteEmployeeAddressVO(employeeCode: number): Observable<any> {
    return this.http.delete(`${'http://localhost:8081/api/v1/delete/address'}/${employeeCode}`, { responseType: 'text' });
  }

  getEmployeesAddressList(employeeaddressvo: Object): Observable<any> {
    return this.http.get(`${'http://localhost:8081/api/v1/get/address'}/${employeeaddressvo}`)
  }
}

