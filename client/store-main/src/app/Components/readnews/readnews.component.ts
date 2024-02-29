import { Component, OnInit } from '@angular/core';
import News from '../Entity/News';
import { NewsService } from 'src/app/service/news.service';

@Component({
  selector: 'app-readnews',
  templateUrl: './readnews.component.html',
  styleUrls: ['./readnews.component.css']
})
export class ReadnewsComponent implements OnInit {

  newsList: News[] = [];

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
