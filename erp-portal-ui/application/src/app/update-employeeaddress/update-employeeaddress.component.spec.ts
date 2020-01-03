import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateEmployeeaddressComponent } from './update-employeeaddress.component';

describe('UpdateEmployeeaddressComponent', () => {
  let component: UpdateEmployeeaddressComponent;
  let fixture: ComponentFixture<UpdateEmployeeaddressComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateEmployeeaddressComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateEmployeeaddressComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
