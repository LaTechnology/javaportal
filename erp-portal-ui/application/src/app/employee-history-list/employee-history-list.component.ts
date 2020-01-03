import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { EmployeeHistory } from '../employee-history';
import { EmployeeHistoryService } from '../employee-history.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employee-history-list',
  templateUrl: './employee-history-list.component.html',
  styleUrls: ['./employee-history-list.component.css']
})
export class EmployeeHistoryListComponent implements OnInit {

  employeesHistory: Observable<EmployeeHistory[]>;
  employeeHistoryService: any;


  constructor(private employeeService: EmployeeHistoryService,
    private router: Router) { }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.employeesHistory = this.employeeService.getEmployeesHistoryList();
  }

  deleteEmployee(id: number) {
    this.employeeHistoryService.deleteEmployeeHistory(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  employeeHistoryDetails(id: number){
    this.router.navigate(['history', id]);
  }

  updateEmployeeHistory(id: number){
    this.router.navigate(['historyupdate', id]);
  } 
 
}



