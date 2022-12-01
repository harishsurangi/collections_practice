package com.colecctions.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Colvsarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> al= new ArrayList();
      al.add(10000);
      al.add(1598);
      al.add(1);
      al.add(125894);
      al.add(78);
      System.out.println(al);
   
    
      Object[] a= al.toArray();
      
      for(int i =0;i<a.length;i++) {
          
    	     System.out.println(a[i]);
    	      }
	}
      
	}

