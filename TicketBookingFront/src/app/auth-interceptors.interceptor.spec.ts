import { TestBed } from '@angular/core/testing';

import { AuthInterceptorsInterceptor } from './auth-interceptors.interceptor';

describe('AuthInterceptorsInterceptor', () => {
  beforeEach(() => TestBed.configureTestingModule({
    providers: [
      AuthInterceptorsInterceptor
      ]
  }));

  it('should be created', () => {
    const interceptor: AuthInterceptorsInterceptor = TestBed.inject(AuthInterceptorsInterceptor);
    expect(interceptor).toBeTruthy();
  });
});
