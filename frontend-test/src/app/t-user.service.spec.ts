import { TestBed } from '@angular/core/testing';

import { TUserService } from './t-user.service';

describe('TUserService', () => {
  let service: TUserService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TUserService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
