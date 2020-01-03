import { Component, OnInit } from '@angular/core';
import { EmployeeInfoVO } from '../employee';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {

  employeeCode: BigInteger;
  employee: EmployeeInfoVO;

  constructor(private route: ActivatedRoute,private router: Router,
    private employeeService: EmployeeService) { }

  ngOnInit(){
    this.employee = new EmployeeInfoVO();

    this.employeeCode = this.route.snapshot.params['employeeCode'];
    
    this.employeeService.getEmployee(this.employeeCode)
      .subscribe(data => {
        console.log(data)
        this.employee = data;
      }, error => console.log(error));
  }

  updateEmployee() {
    this.employeeService.updateEmployee(this.employeeCode, this.employee)
      .subscribe(data => console.log(data), error => console.log(error));
    this.employee = new EmployeeInfoVO();
    this.gotoList();
  }

  onSubmit() {
    this.updateEmployee();    
  }

  gotoList() {
    this.router.navigate(['/employees']);
  }
}