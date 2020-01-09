import { Component, OnInit } from '@angular/core';
import { EmployeecommunicationService } from '../employeecommunication.service';

import { Router, ActivatedRoute } from '@angular/router';
import { EmployeeCommunication } from '../employeecommunication';
@Component({
  selector: 'app-employeecommunicationinformationdetails',
  templateUrl: './employeecommunicationinformationdetails.component.html',
  styleUrls: ['./employeecommunicationinformationdetails.component.css']
})
export class EmployeecommunicationinformationdetailsComponent implements OnInit {

  employeeCode: number;
  
  employeecommunication: EmployeeCommunication;
 
  
  

  constructor(private route: ActivatedRoute,private router: Router,
    private employeecommunicationservice: EmployeecommunicationService) { }

  ngOnInit() {
    this.employeecommunication = new EmployeeCommunication();

    this.employeeCode = this.route.snapshot.params['employeeCode'];
    
    this.employeecommunicationservice.getemployeecommunication(this.employeeCode)
      .subscribe(data => {
        console.log(data)
        this.employeecommunication = data;
      }, error => console.log(error));
  }

  list(){
    this.router.navigate(['comdetails']);
  }
}
