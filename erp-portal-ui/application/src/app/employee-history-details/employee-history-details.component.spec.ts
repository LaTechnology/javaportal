import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeHistoryDetailsComponent } from './employee-history-details.component';

describe('EmployeeHistoryDetailsComponent', () => {
  let component: EmployeeHistoryDetailsComponent;
  let fixture: ComponentFixture<EmployeeHistoryDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeeHistoryDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeHistoryDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
