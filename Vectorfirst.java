package com.colecctions.practice;

import java.util.Vector;

public class Vectorfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Vector v= new Vector();
     v.addElement("harish");
     v.add(null);
     v.add("surangi");
     v.add(123);
    
     System.out.println(v);
     v.set(1, "null0");
     System.out.println(v.indexOf("surangi"));
     System.out.println(v);
     System.out.println(v.capacity());
     System.out.println(v.size());
	}

}
