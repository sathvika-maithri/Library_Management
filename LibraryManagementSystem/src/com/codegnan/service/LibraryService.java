package com.codegnan.service;
import com.codegnan.dao.*;
import com.codegnan.model.Book;

import java.util.*;

public class LibraryService {
	private static BookDAO bookDAO;
	
	public LibraryService() {
		this.bookDAO=new BookDAO();
		
	}
	public static  void addBook(String title, String author, String isbn, int rating) {
		Book book=new Book(title,author,isbn,rating);
		bookDAO.addBook(book);
	}
    public Book getBook(String isbn) {
    	return bookDAO.getBookbyisbn(isbn);
    }
	
    public static   void updatebook(String  title,String author,String isbn,int rating) {
    	Book updatedbook=new Book(title,author,isbn,rating);
		bookDAO.updatebook(isbn,updatedbook);
    	}
    
  
    
     public static  TreeSet<Book>getAllBooks(){
    	return bookDAO.getBooks();
    }
    
      public static Book gettopBook() {
	    return bookDAO.gettopBook();
     }

	public static void main(String[] args) {
		
	
		 }

	
	

}
