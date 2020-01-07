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
  code: number;
  mobileinfo: Mobileinfo;



  constructor(private route: ActivatedRoute,private router: Router,
    private mobileinfoservice: MobileinfoService) { }

  ngOnInit() {
   this. mobileinfo=new Mobileinfo;
   this.code = this.route.snapshot.params['code'];

  
  this.mobileinfoservice.getMobileinfo(this.code)
      .subscribe(data => {
        console.log(data) 
        this.mobileinfo = data;
      }, error => console.log(error));
  
    }
    list(){
      this.router.navigate(['/mobile_details/:code']);
    }
  }