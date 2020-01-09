import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateEmployeeComponent } from './employee/employee-info/create-employee/create-employee.component';
import { EmployeeDetailsComponent } from './employee/employee-info/employee-details/employee-details.component';
import { EmployeeListComponent } from './employee/employee-info/employee-list/employee-list.component';
import { UpdateEmployeeComponent } from './employee/employee-info/update-employee/update-employee.component';
import { HttpClientModule } from '@angular/common/http';
import { EmployeeEducationCreateComponent } from './employee/employee-education/employee-education-create/employee-education-create.component';
import { EmployeeEducationListComponent } from './employee/employee-education/employee-education-list/employee-education-list.component';
import { EmployeeEducationDetailsComponent } from './employee/employee-education/employee-education-details/employee-education-details.component';
import { EmployeeEducationUpdateComponent } from './employee/employee-education/employee-education-update/employee-education-update.component';
import { CreateEmployeecommunicationComponent } from './employee/employee-communication-info/create-employeecommunication/create-employeecommunication.component';
import { EmployeecommunicationinformationdetailsComponent } from './employee/employee-communication-info/employeecommunicationinformationdetails/employeecommunicationinformationdetails.component';
import { CreatemobiledetailsComponent } from './employee/employee-mobile-info/createmobiledetails/createmobiledetails.component';
import { MobiledetailsinfolistComponent } from './employee/employee-mobile-info/mobiledetailsinfolist/mobiledetailsinfolist.component';
import { UpdatemobiledetailsComponent } from './employee/employee-mobile-info/updatemobiledetails/updatemobiledetails.component';
import { MobileinfodetailsComponent } from './employee/employee-mobile-info/mobileinfodetails/mobileinfodetails.component';
import { EmployeecommunicationinfolistComponent } from './employee/employee-communication-info/employeecommunicationinfolist/employeecommunicationinfolist.component';
import { UpdateemployeecommunicationComponent } from './employee/employee-communication-info/updateemployeecommunication/updateemployeecommunication.component';



@NgModule({
  declarations: [
    AppComponent,
    CreateEmployeeComponent,
    EmployeeDetailsComponent,
    EmployeeListComponent,
    UpdateEmployeeComponent,

    EmployeeEducationCreateComponent,
    EmployeeEducationDetailsComponent,
    EmployeeEducationListComponent,
    EmployeeEducationUpdateComponent,
    CreateEmployeecommunicationComponent,
    EmployeecommunicationinformationdetailsComponent,
    CreatemobiledetailsComponent,
    MobiledetailsinfolistComponent,
    MobileinfodetailsComponent,
    UpdatemobiledetailsComponent,
    EmployeecommunicationinfolistComponent,
    UpdateemployeecommunicationComponent
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
