import { Component, OnInit } from '@angular/core';
import { EmployeeaddressService } from '../employeeaddress.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Employeeaddress } from '../employeeaddress';


@Component({
  selector: 'app-employeeaddressdetails',
  templateUrl: './employeeaddressdetails.component.html',
  styleUrls: ['./employeeaddressdetails.component.css']
})
export class EmployeeaddressdetailsComponent implements OnInit {

  empid: number;

  employeeaddress: Employeeaddress;

  constructor(private route: ActivatedRoute,private router: Router,
    private employeeaddressService: EmployeeaddressService) { }

  ngOnInit() {

    this.employeeaddress = new Employeeaddress();

    this.empid = this.route.snapshot.params['empid'];
    
    this.employeeaddressService.getEmployeeAddress(this.empid)
      .subscribe(data => {
        console.log(data)
        this.empid = data;
      }, error => console.log(error));
  }

  list(){
    this.router.navigate(['/employeesaddress']);
  }
}
