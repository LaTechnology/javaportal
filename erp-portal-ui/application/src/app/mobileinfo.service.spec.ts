import { TestBed } from '@angular/core/testing';

import { MobileinfoService } from './mobileinfo.service';

describe('MobileinfoService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MobileinfoService = TestBed.get(MobileinfoService);
    expect(service).toBeTruthy();
  });
});
