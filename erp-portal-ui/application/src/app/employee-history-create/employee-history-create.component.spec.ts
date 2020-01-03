import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeHistoryCreateComponent } from './employee-history-create.component';

describe('EmployeeHistoryCreateComponent', () => {
  let component: EmployeeHistoryCreateComponent;
  let fixture: ComponentFixture<EmployeeHistoryCreateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeeHistoryCreateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeHistoryCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
