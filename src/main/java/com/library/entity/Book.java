package com.library.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book{
	@Id
	private Integer bId;
	private String bName;
	private String bAuthor;
	private Double bPrice;
	public Integer getbId() {
		return bId;
	}
	public void setbId(Integer bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbAuthor() {
		return bAuthor;
	}
	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}
	public Double getbPrice() {
		return bPrice;
	}
	public void setbPrice(Double bPrice) {
		this.bPrice = bPrice;
	}
	public Book(Integer bId, String bName, String bAuthor, Double bPrice) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bAuthor = bAuthor;
		this.bPrice = bPrice;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", bAuthor=" + bAuthor + ", bPrice=" + bPrice + "]";
	}
	 
	

}
