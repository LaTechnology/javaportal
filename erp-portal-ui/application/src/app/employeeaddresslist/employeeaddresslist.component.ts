import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
import { EmployeeaddressService } from '../employeeaddress.service';
import { Employeeaddress } from '../employeeaddress';

@Component({
  selector: 'app-employeeaddresslist',
  templateUrl: './employeeaddresslist.component.html',
  styleUrls: ['./employeeaddresslist.component.css']
})
export class EmployeeaddresslistComponent implements OnInit {

  employeeaddress: Observable<Employeeaddress[]>;

  constructor(private employeeaddressService: EmployeeaddressService,
    private router: Router) { }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    
    this.employeeaddress= this.employeeaddressService.getEmployeesAddressList();
    
  }

  deleteEmployeeAddress(empid: number) {
    this.employeeaddressService.deleteEmployeeAddress(empid)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  employeeaddressDetails(empid: number){
    this.router.navigate(['details', empid]);
  }

  updateEmployeeAddress(empid: number){
    this.router.navigate(['update', empid]);
  }
}

