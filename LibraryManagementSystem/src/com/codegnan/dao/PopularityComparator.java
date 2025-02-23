package com.codegnan.dao;

import java.util.Comparator;
import java.util.TreeSet;

import com.codegnan.model.Book;

class PopularityComparator implements Comparator{
	public  int compare(Object o1,Object o2) {
		Book b1=(Book)o1;
		Book b2=(Book)o2;
		return Integer.compare(b2.getRating(),b1.getRating());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

