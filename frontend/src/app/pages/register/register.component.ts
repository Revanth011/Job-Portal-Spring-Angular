import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit{

  hide = true;
  constructor(private userService:UserService){}

  public user={
    uname: "",
    uaddress: "",
    umobile: "",
    uemail: "",
    username: "",
    upassword: "",
  };

  ngOnInit(): void {
   
  }
  register(){
    if(this.user.username=="" || this.user.username==null){

    }

    this.userService.insertUser(this.user).subscribe(
      (data)=>{
        console.log(data);
        Swal.fire("Success!","You are Registered!","success");
      },
      (error)=>{
        console.log(error);
        Swal.fire({
          icon: 'error',
          title: 'Oops...',
          text: 'Something went wrong!'
        });
      }
    )

  }

}

