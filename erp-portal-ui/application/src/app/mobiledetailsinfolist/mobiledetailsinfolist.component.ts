import { Component, OnInit } from '@angular/core';
import{ MobileinfoService} from'../mobileinfo.service';
import{Mobileinfo}from '../mobileinfo';
import { Router, ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';
@Component({
  selector: 'app-mobiledetailsinfolist',
  templateUrl: './mobiledetailsinfolist.component.html',
  styleUrls: ['./mobiledetailsinfolist.component.css']
})
export class MobiledetailsinfolistComponent implements OnInit {
  
  
mobile_details:Observable<Mobileinfo[]>
  

constructor(private mobileinfoservice: MobileinfoService,
  private router: Router) { }


  ngOnInit(): void {
    this.reloadData();
  }
  reloadData() {
    this.mobile_details = this.mobileinfoservice.getmobinfodetailsList();
  }
  updateMobileinfo(code: number){
    this.router.navigate(['update', code]);
  }
  
  getmobinfodetailsList(code: number){
    this.router.navigate(['/mobinfodetails', code]);
  }
  deleteMobileinfo(code: number) {
    this.mobileinfoservice.deleteMobileinfo(code)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }
  employeeDetails(code: number){
    this.router.navigate(['mobinfodetails', code]);
  }

}