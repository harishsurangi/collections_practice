package com.colecctions.practice;

import java.util.LinkedList;
import java.util.List;

public class Linkedlistfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList ll= new LinkedList();
           
     ll.add("harish");
     ll.add(123);
     ll.add(null);
     ll.add("harish");
     ll.set(0, "software");
     ll.add(0, "surangi");
     System.out.println(ll.indexOf(null));
     ll.addFirst("cccc");
     ll.addLast("jshdjd");
     System.out.println(ll.indexOf(null));
     
     System.out.println(ll);
     
	}

}
