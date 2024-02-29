import { Component, OnInit } from '@angular/core';
import Request from 'src/app/Components/Entity/Request';
import { RequestService } from 'src/app/service/request.service';

@Component({
  selector: 'app-request',
  templateUrl: './request.component.html',
  styleUrls: ['./request.component.css']
})
export class RequestComponent implements OnInit {

  request: Request = new Request();

  volenteerRequest(){
    const observable = this.requestService.sendRequest(this.request);

    observable.subscribe((response) =>{

      console.log("Send Successfully");
      alert("Send Successfully");

    },
        function(error){
          console.log(error);
          alert("Something went Wrong");
        }
    );

  }



  constructor(private requestService : RequestService) { }

  ngOnInit(): void {
  }

}
