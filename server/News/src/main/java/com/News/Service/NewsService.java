package com.News.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.News.entity.News;

public interface NewsService {

	public News postNews(News news);

	public List<News> getAllNews();

	public News updateNews(String keyword, News news);

	public boolean deleteNews(String keyword);

}
