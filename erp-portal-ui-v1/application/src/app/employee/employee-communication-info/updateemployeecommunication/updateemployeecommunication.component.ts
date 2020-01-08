import { Component, OnInit } from '@angular/core'
import { EmployeecommunicationService } from '../employeecommunication.service';

import { Router, ActivatedRoute } from '@angular/router';
import { EmployeeCommunication } from '../employeecommunication';
@Component({
  selector: 'app-updateemployeecommunication',
  templateUrl: './updateemployeecommunication.component.html',
  styleUrls: ['./updateemployeecommunication.component.css']
})
export class UpdateemployeecommunicationComponent implements OnInit {

  employeeCode: number;
  employeecommunication: EmployeeCommunication;
   constructor(private route: ActivatedRoute,private router: Router,
    private employeecommunicationservice:EmployeecommunicationService) { }


  ngOnInit() {

    this.employeecommunication = new  EmployeeCommunication();

    this.employeeCode= this.route.snapshot.params['employeeCode'];
    
    this.employeecommunicationservice. getemployeecommunication(this.employeeCode)
      .subscribe(data => {
        console.log(data)
        this. employeecommunication= data;

      }, error => console.log(error));

    }
    updateEmployeecommunication() {
      this.employeecommunicationservice.updateEmployeecommunication( this.employeecommunication)
        .subscribe(data => console.log(data), error => console.log(error));
      this.employeecommunication = new EmployeeCommunication ();
      this.gotoList();
    }
  
    onSubmit() {
      this.updateEmployeecommunication ();    
    }
  
    gotoList() {
      this.router.navigate(['/comdetails/:employeeCode']);
    }








  

}
