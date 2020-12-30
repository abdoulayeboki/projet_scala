import { TestBed } from '@angular/core/testing';

import { ProfesseurService } from './professeur.service';

describe('ProfesseurService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ProfesseurService = TestBed.get(ProfesseurService);
    expect(service).toBeTruthy();
  });
});
