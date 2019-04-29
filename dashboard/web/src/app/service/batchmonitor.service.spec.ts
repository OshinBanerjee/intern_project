import { TestBed } from '@angular/core/testing';

import { BatchmonitorService } from './batchmonitor.service';

describe('BatchmonitorService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BatchmonitorService = TestBed.get(BatchmonitorService);
    expect(service).toBeTruthy();
  });
});
