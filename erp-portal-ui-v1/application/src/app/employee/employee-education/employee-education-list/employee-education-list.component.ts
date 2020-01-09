import { Component, OnInit } from '@angular/core';
import { EmployeeEducationDetails } from '../employee-education-details';
import { Observable } from 'rxjs';
import { EmployeeEducationService } from '../employee-education.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employee-education-list',
  templateUrl: './employee-education-list.component.html',
  styleUrls: ['./employee-education-list.component.css']
})
export class EmployeeEducationListComponent implements OnInit {
  employeesEducation: Observable<EmployeeEducationDetails[]>;


  constructor(private employeeEducationService: EmployeeEducationService,
    private router: Router) { }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.employeesEducation = this.employeeEducationService.getEmployeesEducationList();
  }

  deleteEmployeeEducation(id: number) {
    this.employeeEducationService.deleteEmployeeEducation(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  employeeEducationDetails(id: number){
    this.router.navigate(['details', id]);
  }

  updateEmployeeEducation(id: number){
    this.router.navigate(['update', id]);
  }

}
