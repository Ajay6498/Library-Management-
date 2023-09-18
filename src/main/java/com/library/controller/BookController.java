package com.library.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.library.entity.Book;
import com.library.service.BookServiceImpl;

@Controller
public class BookController {

	@Autowired
	private BookServiceImpl bookServiceImpl;

	@GetMapping("/library")
	public String Wellcome() {
		return "index";
	}

	@GetMapping("/add")
	public String registerStudent(Model model) {
		model.addAttribute("msg", new Book());
		return "addform";
	}

//******************************************************************************************************
	@PostMapping("/save")
	public String AddBook(Model model, Book book) {
		Boolean status = bookServiceImpl.add(book);
		if (status == true) {
			model.addAttribute("msg", "Add Succesfully");
			System.out.println("Success");
		} else {
			model.addAttribute("msg", "Operation Fail");
			System.out.println("Failed");
		}

		return "message";
	}

//******************************************************************************************************

	@GetMapping("/getll")
	public String GetAll(Model model) {
		List<Book> books = bookServiceImpl.getAll();
		model.addAttribute("books", books);
		return "show";
	}

//******************************************************************************************************

	@GetMapping("/id")
	public String Id(Model model) {
		model.addAttribute("msg", new Book());
		return "a";
	}
	
	
	@GetMapping("/findbyid")
	public String GetById(Model model, Integer bId) {
		Optional<Book> book = bookServiceImpl.getById(bId);
 		if (book.isEmpty()) {
			model.addAttribute("msg", "Book Not found");
			 
		} else {
			model.addAttribute("msg", book);
		}

		return "findbyid";
	}

//******************************************************************************************************

	@GetMapping("/up")
	public String Idd(Model model) {
		model.addAttribute("msg", new Book());
		return "update";
	}
	
	
	@PostMapping("/update")
	public String Update(Model model, Book book) {
		Boolean status = bookServiceImpl.add(book);
		if (status == true) {
			model.addAttribute("msg", "Update Succesfully");
			System.out.println("Success");
		} else {
			model.addAttribute("msg", "Operation Fail");
			System.out.println("Failed");
		}

		return "message";
	}

//******************************************************************************************************

	@DeleteMapping("/delete")
	public String Delete(Model model, Integer bId) {
		bookServiceImpl.delete(bId);
		model.addAttribute("msg", "Delete Succesfull");
		return "message";
	}

}
