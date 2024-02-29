import { Component, OnInit } from '@angular/core';
import Concern from 'src/app/Components/Entity/Concern';
import { ConcernService } from 'src/app/service/concern.service';

@Component({
  selector: 'app-concern',
  templateUrl: './concern.component.html',
  styleUrls: ['./concern.component.css']
})
export class ConcernComponent implements OnInit {


  concern : Concern = new Concern();

  submitTicket(){
    const observable = this.concernService.ticket(this.concern);

    observable.subscribe((response) =>{
      console.log("Submited");
      alert("Submitted");
    },
    
    function(error){
      console.log(error);
      alert("Something went wrong");
    }
    )}


  constructor(private concernService : ConcernService) { }

  ngOnInit(): void {
  }

}
