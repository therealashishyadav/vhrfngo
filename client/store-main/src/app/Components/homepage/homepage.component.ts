import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {
  showForm: boolean = false;

  showFormRequest: boolean = false;

  toggleForm() {
    this.showForm = !this.showForm;
    if (this.showForm) {
      this.showFormRequest = false;
    }
  }

  toggleForm1() {
    this.showFormRequest = !this.showFormRequest;
    if (this.showFormRequest) {
      this.showForm = false;
    }
  }
  constructor() { }

  ngOnInit(): void {

  }


}
