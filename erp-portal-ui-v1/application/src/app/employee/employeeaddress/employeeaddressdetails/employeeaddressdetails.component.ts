import { Component, OnInit } from '@angular/core';
import { EmployeeAddressVO } from '../employee-address-vo';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeaddressService } from '../employeeaddress.service';

@Component({
  selector: 'app-employeeaddressdetails',
  templateUrl: './employeeaddressdetails.component.html',
  styleUrls: ['./employeeaddressdetails.component.css']
})
export class EmployeeaddressdetailsComponent implements OnInit {
  employeeCode: number;

  employeeaddressvo: EmployeeAddressVO;

  constructor(private route: ActivatedRoute,private router: Router,
    private employeeaddressService: EmployeeaddressService) { }

  ngOnInit() {

    this.employeeaddressvo = new EmployeeAddressVO();

    this.employeeCode = this.route.snapshot.params['employeeCode'];
    
    this.employeeaddressService.getEmployeeAddressVO(this.employeeCode)
      .subscribe(data => {
        console.log(data)
        this.employeeaddressvo = data; 

      }, error => console.log(error));
  }

  deleteEmployeeAddressVO(employeeCode: number) {
    this.employeeaddressService.deleteEmployeeAddressVO(employeeCode)
      .subscribe(
        data => {
          console.log(data);
        },
        error => console.log(error));
  }

  list(){
    this.router.navigate(['/employee_address']);
  }
}

