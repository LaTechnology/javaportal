import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateEmployeeaddressComponent } from './create-employeeaddress.component';

describe('CreateEmployeeaddressComponent', () => {
  let component: CreateEmployeeaddressComponent;
  let fixture: ComponentFixture<CreateEmployeeaddressComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateEmployeeaddressComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateEmployeeaddressComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
