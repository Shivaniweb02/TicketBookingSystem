import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private baseURL: string='http://localhost:8081';

  constructor(private http:HttpClient) {

   }
   
   generateToken(loginData:any){
    const url=`${this.baseURL}/auth/login`;
    return this.http.post(url,loginData);
  }
public getCurrentUser()
{
  const url =`${this.baseURL}/auth/currentUser`;
  return this.http.get(url)
}
  public loginUser(jwtToken:any)
  {
    localStorage.setItem('jwtToken',jwtToken)
    return true;
  }


  //check loggedin or not

  public isLoggedIn()
  {
    let tokenStr=localStorage.getItem('jwtToken')
    if(tokenStr==undefined || tokenStr=='' || tokenStr==null)
    return false;
  else
    return true;
  }
  public logout(){
    localStorage.removeItem('jwtToken')
    return true;
  }

//gettoken
public getToken(){
    const jwtToken = localStorage.getItem('jwtToken');
    console.log('JWT Token:', jwtToken);
    return jwtToken;
  }
  


public setUser(user:any){
  localStorage.setItem('user',JSON.stringify(user))
}

public getUser(){
 let userStr= localStorage.getItem('user');
 if(userStr!=null)
 {
  return JSON.parse(userStr)
 }
 else{
  this.logout();
  return null;
 }
}
public getUserRole() {
  const user = this.getUser();
     return user.authorities[0].authority;
  // return null; // Handle cases where the user or role is not present
}



  }
