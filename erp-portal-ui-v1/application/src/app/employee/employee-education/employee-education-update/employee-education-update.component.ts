import { Component, OnInit } from '@angular/core';
import { EmployeeEducationDetails } from '../employee-education-details';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeEducationService } from '../employee-education.service';

@Component({
  selector: 'app-employee-education-update',
  templateUrl: './employee-education-update.component.html',
  styleUrls: ['./employee-education-update.component.css']
})
export class EmployeeEducationUpdateComponent implements OnInit {

  id: number;
  employeeEducation: EmployeeEducationDetails[];
 employeeEducations: EmployeeEducationDetails;
  

  constructor(private route: ActivatedRoute,private router: Router,
    private employeeService: EmployeeEducationService) { }

  ngOnInit(){
  //this.employeeEducations= new EmployeeEducationDetails();

    this.id = this.route.snapshot.params['id'];
    
    this.employeeService.getEmployeeEducation(this.id)
      .subscribe(data => {
        console.log(data)
        this.employeeEducation= data;


      }, 
      error => console.log(error));
     // this.employeeEducations=this.employeeEducation;
  }

  updateEmployeeEducation() {
   this.employeeEducations= new EmployeeEducationDetails();
this.employeeEducations=this.employeeEducation[0];
    this.employeeService.updateEmployeeEducation(this.employeeEducations)
      .subscribe(data => console.log(data), error => console.log(error));
    console.log(this.employeeEducations);
    console.log("updated successfully");
    //this.gotoList();
  }

  onSubmit() {
    this.updateEmployeeEducation();    
  }

  gotoList() {
    this.router.navigate(['/edulist']);
  }

}
