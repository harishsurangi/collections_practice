package com.colecctions.practice;

import java.util.ArrayList;

public class Iterator {
  
	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		for(int i=1;i<=10;i++) {
	    	 a.add(i);
	     }
		  System.out.println(a);
		 java.util.Iterator i= a.iterator();
		 while(i.hasNext()) {
			 Integer k= (Integer)i.next();
			 if(k%2==0) {
				 System.out.println(k); 
			 }
			 else {
				 i.remove();
			 }
		 }
		 System.out.println(a);
	}
}

