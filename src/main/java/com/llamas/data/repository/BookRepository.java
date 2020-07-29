package com.llamas.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.llamas.data.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	
}
