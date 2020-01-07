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
    this.communication_details = this.employeecommunicationService.getcommunicationinfodetailsList();
  }
  employeeDetails(code: number){
    this.router.navigate(['comdetails', code]);
  }

  updatecommunication(code: number){
    this.router.navigate(['update', code]);
  }
  deleteEmployeecommunication(code: number) {
    this.employeecommunicationService. deleteEmployeecommunication(code)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }
  
  
}

