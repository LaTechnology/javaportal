import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeEducationUpdateComponent } from './employee-education-update.component';

describe('EmployeeEducationUpdateComponent', () => {
  let component: EmployeeEducationUpdateComponent;
  let fixture: ComponentFixture<EmployeeEducationUpdateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeeEducationUpdateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeEducationUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
