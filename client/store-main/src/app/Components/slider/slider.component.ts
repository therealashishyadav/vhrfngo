import { animate, style, transition, trigger } from '@angular/animations';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-slider',
  templateUrl: './slider.component.html',
  styleUrls: ['./slider.component.css'],
  
  animations: [
    trigger('slideAnimation', [
      transition(':enter', [
        style({ transform: 'translateX(-100%)' }),
        animate('500ms ease-in', style({ transform: 'translateX(0)' }))
      ]),
      transition(':leave', [
        animate('500ms ease-out', style({ transform: 'translateX(100%)' }))
      ])
    ])
  ]
})
export class SliderComponent implements OnInit {

  images: string[] = [
    'assets/image/pexels-katrin-bolovtsova-6077326 (1).jpg',
    'assets/image/pexels-kuntal-biswas-13897200.jpg',
    'assets/image/pexels-tapas-das-15362909.jpg',
    'assets/image/pexels-yash-sharma-10742870.jpg',
    
    

  ];
  currentIndex = 0;
  slideInterval: any;

  ngOnInit() {
    this.startSlide();
  }

  startSlide() {
    this.slideInterval = setInterval(() => {
      this.nextSlide();
    }, 3000); // Adjust the interval duration (in milliseconds) as needed
  }

  stopSlide() {
    clearInterval(this.slideInterval);
  }

  prevSlide() {
    this.currentIndex = (this.currentIndex - 1 + this.images.length) % this.images.length;
  }

  nextSlide() {
    this.currentIndex = (this.currentIndex + 1) % this.images.length;
  }

  onHover() {
    this.stopSlide();
  }

  onLeave() {
    this.startSlide();
  }

  constructor() { }

}
