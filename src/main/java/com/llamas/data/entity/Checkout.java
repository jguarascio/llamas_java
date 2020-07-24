package com.llamas.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CHECKOUT")
public class Checkout {
	
	@Id
	@Column(name="CHECKOUT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long checkoutId;

	@Column(name="BOOK_ID")
	private long bookId;
	
	@Column(name="GUEST_ID")
	private long guestId;
	
	@Column(name="CHECKOUT_DATE")
	private Date checkoutDate;
	
	@Column(name="DUE_DATE")
	private Date dueDate;
	
	@Column(name="RETURN_DATE")
	private Date returnDate;

	public long getCheckoutId() {
		return checkoutId;
	}

	public void setCheckoutId(long checkoutId) {
		this.checkoutId = checkoutId;
	}

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

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}	
	
}
