import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/service/user.service';
import User from '../Entity/User';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  user: User = new User();

  userList: User[] = [];

  showUsers: boolean = true;

  toggleUser() {
    this.showUsers = true;
  }

  getAllUser() {
    this.userSerivce.getAllUser().subscribe(
      (data: User[]) => {
      this.userList = data;
    },
      (error) => {
        console.error('Error :', error);
      });
  }

  constructor(private userSerivce: UserService) { }

  ngOnInit(): void {
    this.getAllUser();
  }

}
