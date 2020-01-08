import { Component, OnInit } from '@angular/core';
import { Mobileinfo } from '../mobileinfo';
import { ActivatedRoute, Router } from '@angular/router';
import { MobileinfoService } from '../mobileinfo.service';

@Component({
  selector: 'app-mobileinfodetails',
  templateUrl: './mobileinfodetails.component.html',
  styleUrls: ['./mobileinfodetails.component.css']
})
export class MobileinfodetailsComponent implements OnInit {
  employeeCode: number;
  mobileinfo: Mobileinfo;



  constructor(private route: ActivatedRoute,private router: Router,
    private mobileinfoservice: MobileinfoService) { }

  ngOnInit() {
 this. mobileinfo=new Mobileinfo;
   this. employeeCode = this.route.snapshot.params['employeeCode'];

  
  this.mobileinfoservice.getMobileinfo(this.employeeCode)
      .subscribe(data => {
       // console.log(data) 
        this.mobileinfo = data;
        console.log(this. mobileinfo) 
      }, error => console.log(error));
  
    }
    list(){
      this.router.navigate(['/mobinfodetails/:employeeCode']);
    }
    deleteMobileinfo(communicationDetail: number) {
      this.mobileinfoservice.deleteMobileinfo(communicationDetail)
        .subscribe(
          data => {
            console.log(data);
            
          },
          error => console.log(error));
    }
  }