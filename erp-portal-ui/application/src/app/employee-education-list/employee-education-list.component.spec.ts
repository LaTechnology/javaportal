import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeEducationListComponent } from './employee-education-list.component';

describe('EmployeeEducationListComponent', () => {
  let component: EmployeeEducationListComponent;
  let fixture: ComponentFixture<EmployeeEducationListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeeEducationListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeEducationListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
