import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeHistoryUpdateComponent } from './employee-history-update.component';

describe('EmployeeHistoryUpdateComponent', () => {
  let component: EmployeeHistoryUpdateComponent;
  let fixture: ComponentFixture<EmployeeHistoryUpdateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeeHistoryUpdateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeHistoryUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
