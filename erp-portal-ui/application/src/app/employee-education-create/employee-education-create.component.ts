import { Component, OnInit } from '@angular/core';
import { EmployeeEducationDetails } from '../employee-education-details';
import { Router } from '@angular/router';
import { EmployeeEducationService } from '../employee-education.service';

@Component({
  selector: 'app-employee-education-create',
  templateUrl: './employee-education-create.component.html',
  styleUrls: ['./employee-education-create.component.css']
})
export class EmployeeEducationCreateComponent implements OnInit {

  employeeEducation: EmployeeEducationDetails= new EmployeeEducationDetails();
  submitted = false;

  constructor(private employeeEducationService: EmployeeEducationService,
    private router: Router) { }

  ngOnInit() {
  }

  newEmployee(): void {
    this.submitted = false;
    this.employeeEducation = new EmployeeEducationDetails();
    
  }

  save() {
    //this.employeeEducation.employeecode=11813;
    this.employeeEducationService.createEmployeeEducation(this.employeeEducation)
      .subscribe(data => console.log(data), error => console.log(error));
    this.employeeEducation = new EmployeeEducationDetails();
    
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();    
  }

  gotoList() {
    this.router.navigate(['/edulist']);
  }

}
