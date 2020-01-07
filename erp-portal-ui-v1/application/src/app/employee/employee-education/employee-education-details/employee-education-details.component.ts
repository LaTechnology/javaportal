import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { EmployeeEducationService } from '../employee-education.service';
import { EmployeeEducationDetails } from '../employee-education-details';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-employee-education-details',
  templateUrl: './employee-education-details.component.html',
  styleUrls: ['./employee-education-details.component.css']
})
export class EmployeeEducationDetailsComponent implements OnInit {


  id: number;
  employeeEducation: EmployeeEducationDetails[];
 // employeesEducation:Observable<EmployeeEducationDetails[]>; testing
   constructor(private route: ActivatedRoute,private router: Router,
    private employeeEducationService: EmployeeEducationService) { }

  ngOnInit() {
    //this.employeeEducation = new EmployeeEducationDetails();

    this.id = this.route.snapshot.params['id'];
    
    this.employeeEducationService.getEmployeeEducation(this.id)
      .subscribe(data => {
       // console.log(data)
        this.employeeEducation = data;
        console.log(this.employeeEducation)
      }, error => console.log(error));
  }

  list(){
    this.router.navigate(['/edulist']);
  }
}
