import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeaddresslistComponent } from './employeeaddresslist.component';

describe('EmployeeaddresslistComponent', () => {
  let component: EmployeeaddresslistComponent;
  let fixture: ComponentFixture<EmployeeaddresslistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeeaddresslistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeaddresslistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
