import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EmployeeHistory } from '../employee-history';
import { EmployeeHistoryService } from '../employee-history.service';
import { EmployeeHistoryAddress } from '../employee-history-address';
import { EmployeeHistoryDesignation } from '../employee-history-designation';

@Component({
  selector: 'app-employee-history-create',
  templateUrl: './employee-history-create.component.html',
  styleUrls: ['./employee-history-create.component.css']
})
export class EmployeeHistoryCreateComponent implements OnInit {



  employeeHistory: EmployeeHistory = new EmployeeHistory();
  employeeHistoryAddress:EmployeeHistoryAddress=new EmployeeHistoryAddress();
  employeeHistoryDesignation:EmployeeHistoryDesignation=new EmployeeHistoryDesignation();
  submitted = false;
  constructor(private employeeHistoryService: EmployeeHistoryService,
    private router: Router) { }

  ngOnInit() {
  }

  onSubmit() {
    this.submitted = true;
    this.save();    
  }
  save() {
    this.employeeHistoryService.createEmployeeHistory(this.employeeHistory)
      .subscribe(data => console.log(data), error => console.log(error));
    this.employeeHistory= new EmployeeHistory();
    this.gotoList();
  }
  gotoList() {
    this.router.navigate(['/historylist']);
  }

}
