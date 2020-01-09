import { Component, OnInit } from '@angular/core';
import { EmployeeAddressVO } from '../employee-address-vo';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeaddressService } from '../employeeaddress.service';

@Component({
  selector: 'app-updateemployeeaddress',
  templateUrl: './updateemployeeaddress.component.html',
  styleUrls: ['./updateemployeeaddress.component.css']
})
export class UpdateemployeeaddressComponent implements OnInit {
  employeeCode: number;
  employeeaddressvo: EmployeeAddressVO[];
  employeeAddressVos:EmployeeAddressVO;


  constructor(private route: ActivatedRoute,private router: Router,
    private employeeaddressService: EmployeeaddressService) { }

  ngOnInit(){
   //this. employeeAddressVos = new EmployeeAddressVO();

    this.employeeCode = this.route.snapshot.params['employeeCode'];
    
    this.employeeaddressService.getEmployeeAddressVO(this.employeeCode)
      .subscribe(data => {
        console.log(data)
        this.employeeaddressvo = data;
      }, error => console.log(error));
      
  }

  updateEmployeeAddressVO() {
    this.employeeAddressVos=new EmployeeAddressVO();
    this.employeeAddressVos=this.employeeaddressvo[0];
    this.employeeaddressService.updateEmployeeAddressVO(this.employeeAddressVos)
      .subscribe(data => console.log(data), error => console.log(error));
   // this.employeeaddressvo = new EmployeeAddressVO();
   console.log(this.employeeaddressvo);
    this.gotoList();
  }

  onSubmit() {
    this.updateEmployeeAddressVO();    
  }

  gotoList() {
    this.router.navigate(['/employee_address']);
  }
}
