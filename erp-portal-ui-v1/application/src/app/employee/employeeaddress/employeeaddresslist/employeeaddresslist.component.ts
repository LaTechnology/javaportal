import { Component, OnInit } from '@angular/core';
import { EmployeeAddressVO } from '../employee-address-vo';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { EmployeeaddressService } from '../employeeaddress.service';

@Component({
  selector: 'app-employeeaddresslist',
  templateUrl: './employeeaddresslist.component.html',
  styleUrls: ['./employeeaddresslist.component.css']
})
export class EmployeeaddresslistComponent implements OnInit {
  employeeaddressvo: Observable<EmployeeAddressVO[]>;

  constructor(private employeeaddressService: EmployeeaddressService,
    private router: Router) { }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    
  //this.employeeaddressvo= this.employeeService.getEmployeeAddressList();
    
  }

  //deleteEmployeeAddressVO(employeeCode: number) {
   // this.employeeService.deleteEmployeeAddressVO(employeeCode)
     // .subscribe(
       // data => {
         // console.log(data);
          //this.reloadData();
        //},
        //error => console.log(error));
  //}

  employeeaddressDetails(employeeCode: number){
    this.router.navigate(['detailsaddress', employeeCode]);
  }

  updateEmployeeAddressVO(employeeCode: number){
    this.router.navigate(['updateaddress', employeeCode]);
  }
}


