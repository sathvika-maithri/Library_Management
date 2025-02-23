package com.codegnan.model;
import java.util.*;
 
public class  Book{
	String title;
	String author;
	String isbn;
	int rating;
	public Book(String title, String author, String isbn, int rating) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.rating = rating;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getisbn() {
		return isbn;
	}
	public void setisbn(String isbn) {
		this.isbn = isbn;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", rating=" + rating + "]";
	}
	
	
	public static void main(String[] args) {
	        

	}

}


