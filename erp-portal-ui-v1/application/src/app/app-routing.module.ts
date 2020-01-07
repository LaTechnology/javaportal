import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


import { EmployeeEducationCreateComponent } from './employee/employee-education/employee-education-create/employee-education-create.component';
import { EmployeeEducationDetailsComponent } from './employee/employee-education/employee-education-details/employee-education-details.component';

import { EmployeeEducationUpdateComponent } from './employee/employee-education/employee-education-update/employee-education-update.component';
import { EmployeeEducationListComponent } from './employee/employee-education/employee-education-list/employee-education-list.component';
import { EmployeeListComponent } from './employee/employee-info/employee-list/employee-list.component';
import { CreateEmployeeComponent } from './employee/employee-info/create-employee/create-employee.component';
import { UpdateEmployeeComponent } from './employee/employee-info/update-employee/update-employee.component';
import { EmployeeDetailsComponent } from './employee/employee-info/employee-details/employee-details.component';
import { CreateEmployeecommunicationComponent } from './employee/employee-communication-info/create-employeecommunication/create-employeecommunication.component';
import { EmployeecommunicationinformationdetailsComponent } from './employee/employee-communication-info/employeecommunicationinformationdetails/employeecommunicationinformationdetails.component';
import { CreatemobiledetailsComponent } from './employee/employee-mobile-info/createmobiledetails/createmobiledetails.component';
import { MobiledetailsinfolistComponent } from './employee/employee-mobile-info/mobiledetailsinfolist/mobiledetailsinfolist.component';
import { UpdatemobiledetailsComponent } from './employee/employee-mobile-info/updatemobiledetails/updatemobiledetails.component';
import { MobileinfodetailsComponent } from './employee/employee-mobile-info/mobileinfodetails/mobileinfodetails.component';
import { UpdateemployeecommunicationComponent } from './employee/employee-communication-info/updateemployeecommunication/updateemployeecommunication.component';
import { EmployeecommunicationinfolistComponent } from './employee/employee-communication-info/employeecommunicationinfolist/employeecommunicationinfolist.component';




const routes: Routes = [{ path: '', redirectTo: 'employee', pathMatch: 'full' },
{ path: 'employees', component: EmployeeListComponent },
{ path: 'add', component: CreateEmployeeComponent },
{ path: 'update/:id', component: UpdateEmployeeComponent },
{ path: 'details/:id', component: EmployeeDetailsComponent },

{ path: 'eduadd', component: EmployeeEducationCreateComponent},
{ path: 'edudetails/:id', component: EmployeeEducationDetailsComponent},
{ path: 'edulist', component: EmployeeEducationListComponent},
{ path: 'eduupdate/:id', component: EmployeeEducationUpdateComponent},
{ path:  'com',component:CreateEmployeecommunicationComponent},
{ path:'comdetails/:employeeCode',component:EmployeecommunicationinformationdetailsComponent},
{ path:'mob' ,component:CreatemobiledetailsComponent },
{ path:'mobile_details',component:MobiledetailsinfolistComponent},
{ path:'mobinfodetails/:employeeCode',component:MobileinfodetailsComponent} , 
{ path:'updatemob/:employeeCode',component:UpdatemobiledetailsComponent}  ,
{ path:'cominfolist' ,component:EmployeecommunicationinfolistComponent}  ,
{ path:'updatecom/:employeeCode',component:UpdateemployeecommunicationComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
