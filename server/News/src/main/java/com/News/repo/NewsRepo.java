package com.News.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.News.entity.News;

public interface NewsRepo extends JpaRepository<News, Long> {
	public News findByKeyword(String keyword);
}
