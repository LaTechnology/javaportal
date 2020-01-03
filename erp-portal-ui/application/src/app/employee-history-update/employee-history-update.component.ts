import { Component, OnInit } from '@angular/core';
import { EmployeeHistory } from '../employee-history';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeHistoryService } from '../employee-history.service';

@Component({
  selector: 'app-employee-history-update',
  templateUrl: './employee-history-update.component.html',
  styleUrls: ['./employee-history-update.component.css']
})
export class EmployeeHistoryUpdateComponent implements OnInit {

  id: number;
  employeeHistory: EmployeeHistory;

  constructor(private route: ActivatedRoute,private router: Router,
    private employeeHistoryService: EmployeeHistoryService) { }

  ngOnInit(){
    this.employeeHistory= new EmployeeHistory();

    this.id = this.route.snapshot.params['id'];
    
    this.employeeHistoryService.getEmployeeHistory(this.id)
      .subscribe(data => {
        console.log(data)
        this.employeeHistory= data;
      }, 
      error => console.log(error));
  }

  updateEmployeeHistory() {
    this.employeeHistoryService.updateEmployeeHistory(this.id, this.employeeHistory)
      .subscribe(data => console.log(data), error => console.log(error));
    this.employeeHistory= new EmployeeHistory();
    this.gotoList();
  }

  onSubmit() {
    this.updateEmployeeHistory();    
  }

  gotoList() {
    this.router.navigate(['/historylist']);
  }


}
