package com.llamas.business.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llamas.business.domain.BookCheckout;
import com.llamas.data.entity.Book;
import com.llamas.data.entity.Checkout;
import com.llamas.data.entity.Guest;
import com.llamas.data.repository.BookRepository;
import com.llamas.data.repository.CheckoutRepository;
import com.llamas.data.repository.GuestRepository;

@Service
public class CheckoutService {
	private final BookRepository bookRepository;
	private final GuestRepository guestRepository;
	private final CheckoutRepository checkoutRepository;
	
	@Autowired
	public CheckoutService(BookRepository bookRepository, GuestRepository guestRepository,
			CheckoutRepository checkoutRepository) {
		super();
		this.bookRepository = bookRepository;
		this.guestRepository = guestRepository;
		this.checkoutRepository = checkoutRepository;
	}

	public List<BookCheckout> getCheckoutsForGuest(long guestId) {
		Iterable<Book> books = this.bookRepository.findAll();
		Map<Long, BookCheckout> bookCheckoutMap = new HashMap<>();
		books.forEach(book -> {
			BookCheckout bookCheckout = new BookCheckout();
			bookCheckout.setBookId(book.getBookId());
			bookCheckout.setBookTitle(book.getTitle());
			bookCheckout.setBookBarCode(book.getBarCode());
			bookCheckoutMap.put(book.getBookId(), bookCheckout);
			
		});
		
		Iterable<Checkout> checkouts = this.checkoutRepository.findCheckoutByGuest(guestId);
		checkouts.forEach(checkout -> {
			BookCheckout bookCheckout = bookCheckoutMap.get(checkout.getBookId());
			bookCheckout.setGuestId(guestId);
			Guest guest = this.guestRepository.findById(checkout.getGuestId()).get();
			bookCheckout.setFirstName(guest.getFirstName());
			bookCheckout.setLastName(guest.getLastName());
			bookCheckout.setGuestId(guest.getGuestId());
		});
		
		List<BookCheckout> bookCheckouts = new ArrayList<>();
		for(Long id: bookCheckoutMap.keySet()) {
			bookCheckouts.add(bookCheckoutMap.get(id));
		}
		
		return bookCheckouts;
	}

}
