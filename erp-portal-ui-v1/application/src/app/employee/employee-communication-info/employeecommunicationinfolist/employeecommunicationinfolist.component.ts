import { Component, OnInit } from '@angular/core';
import { EmployeecommunicationService } from '../employeecommunication.service';

import { Router, ActivatedRoute } from '@angular/router';
import { EmployeeCommunication } from '../employeecommunication';
import { Observable } from 'rxjs';
@Component({
  selector: 'app-employeecommunicationinfolist',
  templateUrl: './employeecommunicationinfolist.component.html',
  styleUrls: ['./employeecommunicationinfolist.component.css']
})
export class EmployeecommunicationinfolistComponent implements OnInit {
communication_details:Observable<EmployeeCommunication[]>
  constructor(private employeecommunicationService :EmployeecommunicationService ,
    private router: Router   ) { }

  ngOnInit()   {

    this.reloadData();
  }
  reloadData() {
   // this.communication_details = this.employeecommunicationService.getcommunicationinfodetailsList();
  }
  employeeDetails( employeeCode: number){
    this.router.navigate(['comdetails',  employeeCode]);
  }

  updateEmployeecommunication( employeeCode: number){
    this.router.navigate(['update',  employeeCode]);
  }
 //deleteEmployeecommunication( employeeCode: number) {
  // this.employeecommunicationService. deleteEmployeecommunication( employeeCode)
//.subscribe(
      //  data => {
          //console.log(data);
         // this.reloadData();
       // },
      // error => console.log(error));
  }
  
  


