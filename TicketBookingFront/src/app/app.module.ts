import { NgModule } from '@angular/core';
import { BrowserModule, bootstrapApplication } from '@angular/platform-browser';
import { HTTP_INTERCEPTORS, HttpEvent, HttpHandler, HttpInterceptor, HttpRequest } from "@angular/common/http";
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { NavbarComponent } from './navbar/navbar.component';
// import { UserComponent } from './user/user.component';
import { LoginComponent } from './login/login.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import {HttpClientModule} from '@angular/common/http'
import { FormsModule } from '@angular/forms';
// import { AuthInterceptor, authInterceptorProviders } from './Services/AuthInterceptor';
// import { AuthInterceptor } from './Services/LoginServce';
import { AdminComponent } from './UsersPage/ADMIN/admin/admin.component';
import { UsersPageComponent } from './UsersPage/UserNormal/users-page/users-page.component';
import { FlightsearchComponent } from './flightsearch/flightsearch.component';
import { authInterceptorProviders } from './auth-interceptors.interceptor';
// import { DashboardComponent } from './dashboard/dashboard.component';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    NavbarComponent,
    // UserComponent,
    LoginComponent,
    AdminComponent,
    UsersPageComponent,
    // FormsModule,
    FlightsearchComponent,
    // DashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
     HttpClientModule
  ],
  providers: [authInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
