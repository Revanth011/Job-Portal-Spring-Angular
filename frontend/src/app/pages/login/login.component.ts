import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  hide = true;
  loginData={
    u_name: "",
    password: "",
  };

  constructor(private snack: MatSnackBar,private login:LoginService,private router:Router){
    
  }

  ngOnInit(): void {
    
    
  }

  loginForm(formdata:any){
    console.log("Login btn clicked");
    if(this.loginData.u_name.trim()=="" || this.loginData.u_name==null){
      this.snack.open("Username is required !! ","",{duration: 3000,});
      return;
    }

    else if(this.loginData.password.trim()=="" || this.loginData.password==null){
      this.snack.open("Password is required !! ","",{duration: 3000,});
      return;
    }
    
    else if(formdata.u_name == "admin" && formdata.password == "admin"){
      this.router.navigateByUrl("admin");
    }
    else if(formdata.u_name != "admin" && formdata.password != "admin"){
      this.router.navigateByUrl("user");
    }
    
    else{
      alert("error");
    }
    
  }
  
}
