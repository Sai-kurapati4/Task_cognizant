package com.library.service;
import com.library.repository.BookRepository;
public class BookService {
		    private BookRepository book;

		    public void setBook(BookRepository book) {
		        this.book = book;
		    }
		    public void display() {
		    	book.saveBook();
		    }
	}
