package com.codegnan.dao;
import com.codegnan.model.*;
import com.codegnan.service.LibraryService;

import java.util.*;



public class BookDAO {
	private static  TreeSet<Book>books;
	
	
	public BookDAO(){
		books=new TreeSet<Book>(new PopularityComparator());
		
	}
	public  void addBook(Book book) {
		 books.add(book);
	 }
	  
    public TreeSet<Book>getBooks(){
    	
		return books;
	}
	 
	public  Book getBookbyisbn(String isbn) {
		for(Book book:books) {
			if(book.getisbn().equals(isbn)) {return book;}
		}
		return null;
	}
	
	public  void updatebook(String isbn,Book updatedbook) {
		Book book=getBookbyisbn(isbn);
		
		if(book!=null) {
			books.remove(book);
			books.add(updatedbook);
		}
	}
	public static Book gettopBook() {
		if(books.isEmpty()) {
			return null;
		}
		return books.first();
	}
	
	public static void addingBook(Scanner sc){
		System.out.println("Enter the Book Title:");
		sc.nextLine();
		String title=sc.nextLine();
		
		System.out.println("Enter the author name:");
		String author=sc.nextLine();
		System.out.println("Enter the Book ISBN:");
		String isbn=sc.nextLine();
		System.out.println("Enter the Book Rating");
		int rating=sc.nextInt();
		LibraryService.addBook(title,author,isbn,rating);
		System.out.println("Book Added sucessfully!");
	}
	
	public static void updateBook(Scanner sc) {
		System.out.println("Enter the Book Title:");
		sc.nextLine();
		String title=sc.nextLine();
		
		System.out.println("Enter the author name:");
		String author=sc.nextLine();
		System.out.println("Enter the Book ISBN:");
		String isbn=sc.nextLine();
		System.out.println("Enter the Book Rating");
		int rating=sc.nextInt();
		LibraryService.updatebook(title,author,isbn,rating);
		System.out.println("Book updated sucessfully!");
	}
	
	public static void Displaybooks( ) {
		for(Book book:LibraryService.getAllBooks()) {
			System.out.println(book);
		}
	}
	
	public static void Displaytop() {
	 
		System.out.println(BookDAO.gettopBook());
	}



	public static void main(String[] args) {
	
	  

	}

		
		
	}


