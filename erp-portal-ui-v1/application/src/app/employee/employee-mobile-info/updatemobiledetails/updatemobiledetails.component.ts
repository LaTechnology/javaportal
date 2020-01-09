import { Component, OnInit } from '@angular/core';
import { Mobileinfo } from '../mobileinfo';
import { ActivatedRoute, Router } from '@angular/router';
import { MobileinfoService } from '../mobileinfo.service';

@Component({
  selector: 'app-updatemobiledetails',
  templateUrl: './updatemobiledetails.component.html',
  styleUrls: ['./updatemobiledetails.component.css']
})
export class UpdatemobiledetailsComponent implements OnInit {
  employeeCode: number;
  mobileinfo=new Mobileinfo();
   constructor(private route: ActivatedRoute,private router: Router,
    private mobileinfoservice: MobileinfoService) { }


  ngOnInit() {

    this. mobileinfo= new Mobileinfo();

    this.employeeCode= this.route.snapshot.params['employeeCode'];
    
    this.mobileinfoservice. getMobileinfo(this.employeeCode)
      .subscribe(data => {
        console.log(data)
        this.mobileinfo = data;

      }, error => console.log(error));

    }
    updateMobileinfo() {
      this.mobileinfoservice.updateMobileinfo(this.mobileinfo)
        .subscribe(data => console.log(data), error => console.log(error));
      this.mobileinfo = new Mobileinfo();
      this.gotoList();
    }
  
    onSubmit() {
      this. updateMobileinfo();    
    }
  
    gotoList() {
      this.router.navigate(['mobinfodetails/:code']);
    }








  

}
