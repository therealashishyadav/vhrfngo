package com.News.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.News.Service.NewsService;
import com.News.entity.News;

@RestController
@RequestMapping("/news")
@CrossOrigin(origins = "http://localhost:4200")
public class NewsController {

	@Autowired
	private NewsService newService;

	@PostMapping
	public News postNews(@RequestBody News news) {
		return this.newService.postNews(news);
	}

	@GetMapping
	public List<News> getAllNews() {
		return this.newService.getAllNews();
	}

	@PutMapping("/{keyword}")
	public News updateNews(@PathVariable String keyword, @RequestBody News news) {
		return this.newService.updateNews(keyword, news);
	}

	@DeleteMapping("/{keyword}")
	public ResponseEntity<Void> deleteNews(@PathVariable String keyword){
		boolean local = newService.deleteNews(keyword);
		if(local) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	
}
