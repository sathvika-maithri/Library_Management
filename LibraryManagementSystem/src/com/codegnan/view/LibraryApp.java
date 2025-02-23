package com.codegnan.view;
import java.util.Scanner;

import com.codegnan.dao.BookDAO;
import com.codegnan.model.Book;
import com.codegnan.service.LibraryService;

public class LibraryApp {
	
	public static void main(String[] args)  {
		LibraryService lib=new LibraryService();
		Scanner sc=new Scanner(System.in);
		 System.out.println("***Welcome To The Library Management***");
		 boolean Exit=false;
		 while(!Exit) {
	     System.out.println("Enter your choice");
		 System.out.println("1. Add new Book");
		 System.out.println("2. Update Book Rating");
		 System.out.println("3. Display All Books");
		 System.out.println("4. Display Top-Rated Book");
		 System.out.println("5. Exit");
		 int op=sc.nextInt();
		 switch(op){
			 case 1:BookDAO.addingBook(sc);break;
			 case 2:BookDAO.updateBook(sc);break;
			 case 3:BookDAO.Displaybooks();break;
			 case 4:BookDAO.Displaytop();break;
			 case 5:Exit=true;System.out.println("you are exited!!"); break;
			 default:System.out.println("Invalid Option please select other option.");
		 }

	}
	}
}


