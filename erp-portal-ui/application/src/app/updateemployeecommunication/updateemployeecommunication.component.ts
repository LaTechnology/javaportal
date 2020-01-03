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

  id: number;
  employeecommunication: EmployeeCommunication;
   constructor(private route: ActivatedRoute,private router: Router,
    private employeecommunicationservice:EmployeecommunicationService) { }


  ngOnInit() {

    this.employeecommunication = new  EmployeeCommunication();

    this.id= this.route.snapshot.params['id'];
    
    this.employeecommunicationservice. getemployeecommunication(this.id)
      .subscribe(data => {
        console.log(data)
        this. employeecommunication= data;

      }, error => console.log(error));

    }
    updatecommunication() {
      this.employeecommunicationservice.updatecommunication(this.id, this.employeecommunication)
        .subscribe(data => console.log(data), error => console.log(error));
      this.employeecommunication = new EmployeeCommunication ();
      this.gotoList();
    }
  
    onSubmit() {
      this.updatecommunication ();    
    }
  
    gotoList() {
      this.router.navigate(['/cominfolist']);
    }








  

}
