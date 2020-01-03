import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeHistoryListComponent } from './employee-history-list.component';

describe('EmployeeHistoryListComponent', () => {
  let component: EmployeeHistoryListComponent;
  let fixture: ComponentFixture<EmployeeHistoryListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeeHistoryListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeHistoryListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
