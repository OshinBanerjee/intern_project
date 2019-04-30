import { TestBed } from '@angular/core/testing';

import { SchedulemonitorService } from './schedulemonitor.service';

describe('SchedulemonitorService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SchedulemonitorService = TestBed.get(SchedulemonitorService);
    expect(service).toBeTruthy();
  });
});
