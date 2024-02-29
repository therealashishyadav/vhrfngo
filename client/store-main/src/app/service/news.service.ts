import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import News from '../Components/Entity/News';

const News_posting_link = "http://localhost:8085/news";
const News_getting_link = "http://localhost:8085/news";

@Injectable({
  providedIn: 'root'
})
export class NewsService {

  postNews(news : News){
    return this.http.post(News_posting_link,news);
  }

  getNews(){
    return this.http.get<News[]>(News_getting_link);
  }

  constructor(private http : HttpClient) { }
}
