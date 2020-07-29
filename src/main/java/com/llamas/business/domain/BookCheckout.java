package com.llamas.business.domain;

import java.util.Date;

public class BookCheckout {
	private long bookId;
	private long guestId;
	private String bookTitle;
	private String bookBarCode;
	private String firstName;
	private String lastName;
	private Date date;
	
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public long getGuestId() {
		return guestId;
	}
	public void setGuestId(long guestId) {
		this.guestId = guestId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookBarCode() {
		return bookBarCode;
	}
	public void setBookBarCode(String bookBarCode) {
		this.bookBarCode = bookBarCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
