import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeecommunicationinfolistComponent } from './employeecommunicationinfolist.component';

describe('EmployeecommunicationinfolistComponent', () => {
  let component: EmployeecommunicationinfolistComponent;
  let fixture: ComponentFixture<EmployeecommunicationinfolistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeecommunicationinfolistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeecommunicationinfolistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
