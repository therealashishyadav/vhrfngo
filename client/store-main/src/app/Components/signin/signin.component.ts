import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/service/user.service';
import User from '../Entity/User';

@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent implements OnInit {


  user: User = new User();

  userlog: User = new User();
  userId: any;

  userName: string;
  password: string;
  uId: number;

  signin(userName, password) {

    if (this.userName != null && this.password != null) {


      const observable = this.userService.login(this.userName, this.password);
      console.log(observable);

      observable.subscribe((repsonse) => {

        if (repsonse[0] == null) {
          alert("Something went Wrong");
        } else {
          console.log(repsonse + " hello");
          this.userlog = repsonse[0] as User;
          
          this.userId = this.userlog.uId;

          console.log(this.userId);
          window.location.href = "/homepage";
        }

      },
        function (error) {
          console.log(error);
          alert("Something went Wrong");
        }

      );

    }
    else {
      alert("Please Enter Valid credentials");
    }
  }

  constructor(private userService: UserService) { }

  ngOnInit(): void {
  }

}
