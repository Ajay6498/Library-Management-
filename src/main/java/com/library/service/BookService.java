package com.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.library.entity.Book;

@Service
public interface BookService {
	
	public Boolean add(Book book);
	public List<Book> getAll();
	public Optional<Book> getById(Integer bId);
	public void delete(Integer bId);
	public Boolean update(Integer bId, Book book);
	public Book search(Integer bId);
	
}
