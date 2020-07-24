package com.llamas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.llamas.data.entity.Book;
import com.llamas.data.repository.BookRepository;

@SpringBootApplication
public class LLaMaSApplication {

	public static void main(String[] args) {
		SpringApplication.run(LLaMaSApplication.class, args);
	}
	
	@RestController
	@RequestMapping("/books")
	public class BookController {
		
		@Autowired
		private BookRepository bookRepository;
		
		@GetMapping
		public Iterable<Book> getBooks() {
			return this.bookRepository.findAll();
		}
	}

}
