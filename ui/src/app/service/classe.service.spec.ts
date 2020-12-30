import { TestBed } from '@angular/core/testing';

import { ClasseService } from './classe.service';

describe('ClasseService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ClasseService = TestBed.get(ClasseService);
    expect(service).toBeTruthy();
  });
});
