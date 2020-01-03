import { TestBed } from '@angular/core/testing';

import { EmployeeaddressService } from './employeeaddress.service';

describe('EmployeeaddressService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EmployeeaddressService = TestBed.get(EmployeeaddressService);
    expect(service).toBeTruthy();
  });
});
