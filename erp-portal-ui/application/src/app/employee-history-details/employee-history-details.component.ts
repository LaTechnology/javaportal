import { Component, OnInit } from '@angular/core';
import { EmployeeHistory } from '../employee-history';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeHistoryService } from '../employee-history.service';


@Component({
  selector: 'app-employee-history-details',
  templateUrl: './employee-history-details.component.html',
  styleUrls: ['./employee-history-details.component.css']
})
export class EmployeeHistoryDetailsComponent implements OnInit {
  id: number;
  employeeHistory: EmployeeHistory;

  constructor(private route: ActivatedRoute,private router: Router,
    private employeeService: EmployeeHistoryService) { }
    
    
  ngOnInit() {
    this.employeeHistory= new EmployeeHistory();
   
    this.id = this.route.snapshot.params['id'];
    
    this.employeeService.getEmployeeHistory(this.id)
      .subscribe(data => {
        console.log(data)
        this.employeeHistory= data;
      }, error => console.log(error));
  }
 
  list(){
    this.router.navigate(['/historylist']);
  }
}
  

