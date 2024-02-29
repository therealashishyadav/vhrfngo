import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import Request from '../Components/Entity/Request';

const Request_Link = "http://localhost:8080/volenteer"

@Injectable({
  providedIn: 'root'
})
export class RequestService {

  sendRequest(request : Request)
  {
    return this.http.post(Request_Link, request);
  }

  constructor( private http : HttpClient) { }
}
