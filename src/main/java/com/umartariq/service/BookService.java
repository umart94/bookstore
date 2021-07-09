package com.umartariq.service;

import java.util.List;

import com.umartariq.domain.security.Book;

public interface BookService {

	List<Book> findAll();
	
	Book findOne(Long id);
	
	List<Book> findByCategory(String category);
	
	List<Book> blurrySearch(String title);
	
}
