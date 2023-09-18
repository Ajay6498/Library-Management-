package com.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entity.Book;
import com.library.repo.BookRepo;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepo bookRepo;

	@Override
	public Boolean add(Book book) {
		Book add = bookRepo.save(book);
		if (add.getbId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Book> getAll() {
		List<Book> book = bookRepo.findAll();
		return book;
	}

	@Override
	public Optional<Book> getById(Integer bId) {
		return bookRepo.findById(bId);
	}

	@Override
	public void delete(Integer bId) {
		bookRepo.deleteById(bId);

	}

	@Override
	public Boolean update(Integer bId, Book book) {
		Optional<Book> b = bookRepo.findById(bId);
		if (b.get() != null) {
			Book add = bookRepo.save(book);
			return true;
		}
		return false;
	}

	@Override
	public Book search(Integer bId) {
		// TODO Auto-generated method stub
		return null;
	}

}
