import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeecommunicationinformationdetailsComponent } from './employeecommunicationinformationdetails.component';

describe('EmployeecommunicationinformationdetailsComponent', () => {
  let component: EmployeecommunicationinformationdetailsComponent;
  let fixture: ComponentFixture<EmployeecommunicationinformationdetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeecommunicationinformationdetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeecommunicationinformationdetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
