import { Component, OnInit } from '@angular/core';
import{ MobileinfoService} from'../mobileinfo.service';
import{Mobileinfo}from '../mobileinfo';
import { Router } from '@angular/router';
@Component({
  selector: 'app-createmobiledetails',
  templateUrl: './createmobiledetails.component.html',
  styleUrls: ['./createmobiledetails.component.css']
})
export class CreatemobiledetailsComponent implements OnInit {
 
    mobileinfo:Mobileinfo=new Mobileinfo();
    submitted=false;
  

    constructor(private mobileinfoservice: MobileinfoService,
      private router: Router) { }
  
    ngOnInit() {
    }
  
    newMobileinfo(): void {
      this.submitted = false;
      this.mobileinfo = new Mobileinfo();
    }
  
    save() {
      this.mobileinfoservice.  createMobileinfo(this.mobileinfo)
        .subscribe(data => console.log(data), error => console.log(error));
      this.mobileinfo = new Mobileinfo();
      this.gotoList();
    }
  
    onSubmit() {
      this.submitted = true;
      this.save();    
    }
  
    gotoList() {
      this.router.navigate(['/mobile_details/:code']);
    }
  }
  
  
