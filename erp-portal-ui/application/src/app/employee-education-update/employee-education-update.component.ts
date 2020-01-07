import { Component, OnInit } from '@angular/core';
import { EmployeeEducationDetails } from '../employee-education-details';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeHistoryService } from '../employee-history.service';
import { EmployeeEducationService } from '../employee-education.service';

@Component({
  selector: 'app-employee-education-update',
  templateUrl: './employee-education-update.component.html',
  styleUrls: ['./employee-education-update.component.css']
})
export class EmployeeEducationUpdateComponent implements OnInit {

  id: number;
  employeeEducation: EmployeeEducationDetails;

  constructor(private route: ActivatedRoute,private router: Router,
    private employeeService: EmployeeEducationService) { }

  ngOnInit(){
    this.employeeEducation= new EmployeeEducationDetails();

    this.id = this.route.snapshot.params['id'];
    
    this.employeeService.getEmployeeEducation(this.id)
      .subscribe(data => {
        console.log(data)
        this.employeeEducation= data;
      }, 
      error => console.log(error));
  }

  updateEmployeeHistory() {
    this.employeeService.updateEmployeeEducation(this.id, this.employeeEducation)
      .subscribe(data => console.log(data), error => console.log(error));
    this.employeeEducation= new EmployeeEducationDetails();
    this.gotoList();
  }

  onSubmit() {
    this.updateEmployeeHistory();    
  }

  gotoList() {
    this.router.navigate(['/edulist']);
  }

}
