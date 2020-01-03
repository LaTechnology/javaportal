import { Component, OnInit } from '@angular/core';
import { EmployeeDetailsComponent } from './../employee-details/employee-details.component';
import { Observable } from "rxjs";
import { EmployeeService } from "./../employee.service";
import { EmployeeInfoVO } from "./../employee";
import { Router } from '@angular/router';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employees: Observable<EmployeeInfoVO[]>;


  constructor(private employeeService: EmployeeService,
    private router: Router) { }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.employees = this.employeeService.getEmployeesList();
  }

  deleteEmployee(employeeCode: BigInteger) {
    this.employeeService.deleteEmployee(employeeCode)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  employeeDetails(employeeCode: BigInteger){
    this.router.navigate(['details', employeeCode]);
  }

  updateEmployee(employeeCode: BigInteger){
    this.router.navigate(['update', employeeCode]);
  }
}


