import { Component, OnInit } from '@angular/core';
import { EmployeecommunicationService } from '../employeecommunication.service';

import { Router } from '@angular/router';
import { EmployeeCommunication } from '../employeecommunication';
@Component({
  selector: 'app-create-employeecommunication',
  templateUrl: './create-employeecommunication.component.html',
  styleUrls: ['./create-employeecommunication.component.css']
})
export class CreateEmployeecommunicationComponent implements OnInit {

  employeecommunication: EmployeeCommunication = new EmployeeCommunication();
  submitted = false;
 

  constructor(private employeecommunicationService: EmployeecommunicationService,
    private router: Router) { }

  ngOnInit() {
  }

  newEmployeeCommunication(): void {
    this.submitted = false;
    this.employeecommunication = new EmployeeCommunication();
  }

  save() {
    this.employeecommunicationService.createEmployeecommunication(this.employeecommunication)
      .subscribe(data => console.log(data), error => console.log(error));
    this.employeecommunication = new EmployeeCommunication();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();    
  }

  gotoList() {
    this.router.navigate(['/cominfolist']);
  }
}

