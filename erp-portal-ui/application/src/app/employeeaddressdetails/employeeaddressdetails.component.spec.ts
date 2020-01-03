import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeaddressdetailsComponent } from './employeeaddressdetails.component';

describe('EmployeeaddressdetailsComponent', () => {
  let component: EmployeeaddressdetailsComponent;
  let fixture: ComponentFixture<EmployeeaddressdetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeeaddressdetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeaddressdetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
