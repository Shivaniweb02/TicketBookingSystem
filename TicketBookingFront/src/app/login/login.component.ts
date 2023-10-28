import { Component } from '@angular/core';
import { LoginService } from '../Services/loginSrvices/login.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  constructor(private login:LoginService,private router:Router){}
 
loginData={
  email:'',
  password:''
}
// jwtToken=''
formSubmit(){
 
this.login.generateToken(this.loginData).subscribe(    
  (data:any)=>{
    //  this.jwtToken=data.jwtToken
     this.login.loginUser(data.jwtToken)
     console.log(data)
  console.log("User is Loggen In!")
  this.login.getCurrentUser().subscribe((user:any)=>{
    this.login.setUser(user);
    console.log(user)
  })
  // console.log("Hello there")
  // window.location.href='/admin'
  // console.log(data.jwtToken)

  // this.login.getCurrentUser().subscribe((user:any)=>{

  //   console.log(user)
    // if(this.login.getUserRole()=='ADMIN')
    // {
    //   this.router.navigate(['/admin']);
    // }
    // else{
      

      
    //   this.router.navigate(['/normal-user']);
    // }
    
  // });
       },
       error=>{
         console.log(error)
       }
       )
       
      }
    }
// }

//Login user



// public LoggeIDin()
// {
//   let token=localStorage.getItem("token")
//   return true;
// }



