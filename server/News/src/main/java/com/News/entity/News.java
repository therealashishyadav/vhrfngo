package com.News.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class News {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long nId;
	private String heading;
	private String keyword;
	private Date date;
	
	@Column(length = 1000)
	private String body;

	public News() {
		super();
		// TODO Auto-generated constructor stub
	}

	public News(long nId,Date date, String heading, String keyword, String body) {
		super();
		this.date = date;
		this.nId = nId;
		this.heading = heading;
		this.keyword = keyword;
		this.body = body;
	}

	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getnId() {
		return nId;
	}

	public void setnId(long nId) {
		this.nId = nId;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "News [nId=" + nId + ", heading=" + heading + ", keyword=" + keyword + ", date=" + date + ", body="
				+ body + "]";
	}

}
