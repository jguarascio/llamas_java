package com.llamas.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.llamas.data.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
	
}
