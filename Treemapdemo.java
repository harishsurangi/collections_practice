package com.colecctions.practice;

import java.sql.DriverManager;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemapdemo {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeMap<Integer,String>  t= new TreeMap();
      t.put(45, "harish");
      t.put(23, "hari");
      t.put(2, "anil");
      t.put(4, "inakollu");
      t.put(67, "surangi");
     Set s1= t.entrySet();
     System.out.println(s1);
     
     
     
   
     
     
     
    /* //iterator
     java.util.Iterator itr= s1.iterator();
     while(itr.hasNext()) {
    	 Map.Entry<Integer, String> m1=(Map.Entry<Integer, String>)itr.next();
    	 System.out.println(m1.getKey()+""+m1.getValue());
     }*/
	}

}
