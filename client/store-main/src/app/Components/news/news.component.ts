import { Component, OnInit } from '@angular/core';
import { NewsService } from 'src/app/service/news.service';
import News from '../Entity/News';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {

  news: News = new News();

  newsList: News[] = [];

  submit() {
    const observable = this.newsService.postNews(this.news);

    observable.subscribe((response) => {

      console.log("Success");
      alert("Success");

    },
      function (error) {
        console.log(error);
        alert("Something went wrong");
      }
    );
  }

  getNews() {
    this.newsService.getNews().subscribe(
      (data: News[]) => {
        this.newsList = data;
      },
      (error) => {
        console.error('Error fetching news:', error);
      }
    );

  }

  constructor(private newsService: NewsService) { }

  ngOnInit(): void {
    this.getNews();
  }

}
