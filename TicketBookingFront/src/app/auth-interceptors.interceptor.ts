import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor,
  HTTP_INTERCEPTORS
} from '@angular/common/http';
import { Observable } from 'rxjs';
import { LoginService } from './Services/loginSrvices/login.service';

@Injectable()
export class AuthInterceptorsInterceptor implements HttpInterceptor {

  constructor(private login:LoginService) {}

  intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {
     const jwtToken = this.login.getToken();

    //  let authReq = request.clone() // here i was using clong thats why the authroization was not happening
    console.log('Inside Interceptor'+jwtToken)
            if (jwtToken != null) {
                console.log("Inside")
                request = request.clone({
                   
                    setHeaders: {
                        Authorization: `Bearer ${jwtToken}` // Use tokenHeader as the header name
                    },
                   
                });
            }
            // console.log()
    
    
            return next.handle(request);
  }
}

export const authInterceptorProviders = [
  {
       provide: HTTP_INTERCEPTORS,
       useClass: AuthInterceptorsInterceptor,
       multi: true,
  
  }
 
 ];
