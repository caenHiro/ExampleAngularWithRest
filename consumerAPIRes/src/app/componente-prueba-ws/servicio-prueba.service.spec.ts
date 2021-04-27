import { TestBed } from '@angular/core/testing';

import { ServisioPruebaService } from './servisio-prueba.service';

describe('ServisioPruebaService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServisioPruebaService = TestBed.get(ServisioPruebaService);
    expect(service).toBeTruthy();
  });
});
