package pl.coderslab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.coderslab.entities.Book;
import pl.coderslab.repositories.BookRepository;

@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	BookRepository bookRepository;
	@GetMapping("")
	public String addBook(Model model) {
		model.addAttribute("book", new Book());
		
	}
	@PostMapping("")
	
}
