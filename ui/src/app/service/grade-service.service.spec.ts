import { TestBed } from '@angular/core/testing';

import { GradeServiceService } from './grade-service.service';

describe('GradeServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: GradeServiceService = TestBed.get(GradeServiceService);
    expect(service).toBeTruthy();
  });
});
