import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeaddressService } from '../employeeaddress.service';
import { Employeeaddress } from '../employeeaddress';



@Component({
  selector: 'app-update-employeeaddress',
  templateUrl: './update-employeeaddress.component.html',
  styleUrls: ['./update-employeeaddress.component.css']
})
export class UpdateEmployeeaddressComponent implements OnInit {
  empid: number;

  employeeaddress: Employeeaddress = new Employeeaddress();

  constructor(private route: ActivatedRoute,private router: Router,
    private employeeaddressService: EmployeeaddressService) { }

  ngOnInit(){
    this.employeeaddress = new Employeeaddress();

    this.empid = this.route.snapshot.params['empid'];
    
    this.employeeaddressService.getEmployeeAddress(this.empid)
      .subscribe(data => {
        console.log(data)
        this.employeeaddress = data;
      }, error => console.log(error));
  }

  updateEmployeeAddress() {
    this.employeeaddressService.updateEmployeeAddress(this.empid, this.employeeaddress)
      .subscribe(data => console.log(data), error => console.log(error));
    this.employeeaddress = new Employeeaddress();
    this.gotoList();
  }

  onSubmit() {
    this.updateEmployeeAddress();    
  }

  gotoList() {
    this.router.navigate(['/employeesaddress']);
  }
}