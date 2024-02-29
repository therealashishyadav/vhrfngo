package com.News.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.News.Service.NewsService;
import com.News.entity.News;
import com.News.repo.NewsRepo;

@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	private NewsRepo newsRepo;

	@Override
	public News postNews(News news) {
		return this.newsRepo.save(news);
	}

	@Override
	public List<News> getAllNews() {

		return this.newsRepo.findAll();
	}

	@Override
	public News updateNews(String keyword, News news) {

		News local = this.newsRepo.findByKeyword(keyword);

		if (local != null) {
			local.setBody(news.getBody());
			local.setHeading(news.getHeading());
			local.setKeyword(news.getKeyword());

			return this.newsRepo.save(local);

		} else {
			return null;
		}
	}

	@Override
	public boolean deleteNews(String keyword) {

		News local = newsRepo.findByKeyword(keyword);
		
		if(local != null) {
			newsRepo.delete(local); 
			return true;
		}
		
		return false;
	}

}
