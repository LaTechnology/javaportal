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
  code: number;
  mobileinfo=new Mobileinfo();
   constructor(private route: ActivatedRoute,private router: Router,
    private mobileinfoservice: MobileinfoService) { }


  ngOnInit() {

    this. mobileinfo= new Mobileinfo();

    this.code= this.route.snapshot.params['code'];
    
    this.mobileinfoservice. getMobileinfo(this.code)
      .subscribe(data => {
        console.log(data)
        this.mobileinfo = data;

      }, error => console.log(error));

    }
    updateMobileinfo() {
      this.mobileinfoservice.updateMobileinfo(this.code, this.mobileinfo)
        .subscribe(data => console.log(data), error => console.log(error));
      this.mobileinfo = new Mobileinfo();
      this.gotoList();
    }
  
    onSubmit() {
      this. updateMobileinfo();    
    }
  
    gotoList() {
      this.router.navigate(['/mobile_details']);
    }








  

}
