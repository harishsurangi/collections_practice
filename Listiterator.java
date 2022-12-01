package com.colecctions.practice;

import java.util.LinkedList;
import java.util.ListIterator;

public class Listiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList l= new LinkedList();
      l.add("harish");
      l.add("venky");
      l.add("jalas");
      l.add("liger");
      l.add("man");
      System.out.println(l);
      ListIterator itr= l.listIterator();
      while(itr.hasNext()) {
    	  String s= (String)itr.next();
    	  if(s.equals("venky")) {
    		  itr.set("dog");
    	  }
    	  else if(s.equals("jalas")) {
    		  itr.remove();
    	  }
    	  else {
    		  itr.add("legend");
    	  }
      }
      System.out.println(l);
      
	}

}
