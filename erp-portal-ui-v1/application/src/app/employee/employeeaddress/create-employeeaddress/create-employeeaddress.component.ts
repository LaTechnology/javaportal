import { Component, OnInit } from '@angular/core';
import { EmployeeAddressVO } from '../employee-address-vo';
import { Router } from '@angular/router';
import { EmployeeaddressService } from '../employeeaddress.service';

@Component({
  selector: 'app-create-employeeaddress',
  templateUrl: './create-employeeaddress.component.html',
  styleUrls: ['./create-employeeaddress.component.css']
})
export class CreateEmployeeaddressComponent implements OnInit {

employeeaddressvo: EmployeeAddressVO = new EmployeeAddressVO();
submitted = false;

constructor(private employeeaddressService: EmployeeaddressService,
  private router: Router) { }

ngOnInit() {

}


  newEmployeeaddressVO(): void {
    this.submitted = false;
    this.employeeaddressvo = new EmployeeAddressVO();
}
save() {
this.employeeaddressService.createEmployeeAddressVO(this.employeeaddressvo)
  .subscribe(data => console.log(data), error => console.log(error));
this.employeeaddressvo = new EmployeeAddressVO();
this.gotoList();
}

onSubmit() {
this.submitted = true;
this.save();    
}

gotoList() {
this.router.navigate(['/detailsaddress/:employeeCode']);
}
}

