import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeEducationCreateComponent } from './employee-education-create.component';

describe('EmployeeEducationCreateComponent', () => {
  let component: EmployeeEducationCreateComponent;
  let fixture: ComponentFixture<EmployeeEducationCreateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeeEducationCreateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeEducationCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
