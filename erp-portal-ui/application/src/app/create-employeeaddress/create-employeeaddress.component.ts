import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EmployeeaddressService } from '../employeeaddress.service';
import { Employeeaddress } from '../employeeaddress';

@Component({
  selector: 'app-create-employeeaddress',
  templateUrl: './create-employeeaddress.component.html',
  styleUrls: ['./create-employeeaddress.component.css']
})
export class CreateEmployeeaddressComponent implements OnInit {

  employeeaddress: Employeeaddress = new Employeeaddress();
  submitted = false;
  
  constructor(private employeeaddressService: EmployeeaddressService,
    private router: Router) { }

  ngOnInit() {

  }


    newEmployeeAddress(): void {
      this.submitted = false;
      this.employeeaddress = new Employeeaddress();
}
save() {
  this.employeeaddressService.createEmployeeAddress(this.employeeaddress)
    .subscribe(data => console.log(data), error => console.log(error));
  this.employeeaddress = new Employeeaddress();
  this.gotoList();
}

onSubmit() {
  this.submitted = true;
  this.save();    
}

gotoList() {
  this.router.navigate(['/employeesaddress']);
}
}
