import { Component } from '@angular/core';
import { UserService } from '../Services/UserService/user.service';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  constructor(private user:UserService)
  {}
  public User={
    emailID:'',
    password:'',
    name:'',
    phone_number:'',
    address:'',
    gender:'',
    age:''
  }
  formsubmit()
  {
    console.log("User details Sent!")
    this.user.createUser(this.User).subscribe(    response=>{
     alert("User is Registered!")
          },
          error=>{
            console.log(error)
          })
  }
  getAll()
  {
    console.log("Hi")
    // console.log("Email Sent!")
    // this.user.getAllusers().subscribe(    response=>{
    //  alert("Users!")
    //  console.log(this.User.emailID)
    //       },
    //       error=>{
    //         console.log("NO")
    //       })
  }
  email(event:Event)
  {
console.log((<HTMLInputElement>event.target).value);
  }

}
