import { Component, OnInit } from '@angular/core';
import User from '../Entity/User';
import { UserService } from 'src/app/service/user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  user: User = new User();

  users: User[] = [];

  saveUser(){

    const observable = this.userService.createUser(this.user);

    observable.subscribe((response) => {

      console.log(true);
      alert("User Created");

      window.location.href = "/signin";

    },
    function (error){
      console.log(error);
      alert("Error")
    }
    );
  }


  constructor(private userService: UserService) { }

  ngOnInit(): void {
  }

}
