import { Injectable } from '@angular/core';
import Concern from '../Components/Entity/Concern';
import { HttpClient } from '@angular/common/http';

const concern_link = "http://localhost:8081/ticket";

@Injectable({
  providedIn: 'root'
})
export class ConcernService {

  ticket(concern : Concern){
    return this.http.post(concern_link, concern);
  }

  constructor(private http : HttpClient) { }
}
