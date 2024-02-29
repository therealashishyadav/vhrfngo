import { Injectable } from '@angular/core';
import User from '../Components/Entity/User';
import { HttpClient } from '@angular/common/http';

const BASE_URL_FOR_REGISTER = "http://localhost:8084/user"
const BASE_URL_FOR_Login = "http://localhost:8084/user/login/"
const BASE_URL_FOR_GETTINGALL ="http://localhost:8084/user/";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  createUser(user: User) {
    return this.http.post(BASE_URL_FOR_REGISTER, user);
  }

  login(userName, password) {
    return this.http.get(BASE_URL_FOR_Login + userName + "/" + password);
  }

  getAllUser(){
    return this.http.get<User[]>(BASE_URL_FOR_GETTINGALL);
  }

  constructor(private http: HttpClient) { }
}
