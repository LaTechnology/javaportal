import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeHistoryAddressComponent } from './employee-history-address.component';

describe('EmployeeHistoryAddressComponent', () => {
  let component: EmployeeHistoryAddressComponent;
  let fixture: ComponentFixture<EmployeeHistoryAddressComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeeHistoryAddressComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeHistoryAddressComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
