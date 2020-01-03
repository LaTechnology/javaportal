import { TestBed } from '@angular/core/testing';

import { EmployeecommunicationService } from './employeecommunication.service';

describe('EmployeecommunicationService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EmployeecommunicationService = TestBed.get(EmployeecommunicationService);
    expect(service).toBeTruthy();
  });
});