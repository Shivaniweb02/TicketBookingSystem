import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AdminComponent } from './UsersPage/ADMIN/admin/admin.component';
import { UsersPageComponent } from './UsersPage/UserNormal/users-page/users-page.component';

const routes: Routes = [{
  path:'register',
  component:RegisterComponent,
  pathMatch:'full'
},
{
  path:'admin',
  component:AdminComponent,
  pathMatch:'full'
},

{
  path:'normal-user',
  component:UsersPageComponent,
  pathMatch:'full'
},
{
  path:'login',
  component:LoginComponent,
  pathMatch:'full'
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
