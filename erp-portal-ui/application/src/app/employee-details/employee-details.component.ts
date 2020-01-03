import { Component, OnInit } from '@angular/core';
import { EmployeeInfoVO } from '../employee';
import { EmployeeService } from '../employee.service';
import { EmployeeListComponent } from '../employee-list/employee-list.component';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {

  employeeCode: string;
  employee: EmployeeInfoVO;

  constructor(private route: ActivatedRoute,private router: Router,
    private employeeService: EmployeeService) { }

  ngOnInit() {
    this.employee = new EmployeeInfoVO();

    this.employeeCode = this.route.snapshot.params['employeeCode'];
    
    this.employeeService.getEmployee(this.employeeCode)
      .subscribe(data => {
        console.log(data)
        this.employee = data;
      }, error => console.log(error));
  }

  list(){
    this.router.navigate(['/employees']);
  }
}