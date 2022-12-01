package com.colecctionsmap.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Hasmapc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap m= new HashMap();
      m.put("chranjeevi",700);
      m.put("balayya", 800);
     m.put("vekny", 200);
      m.put("nagarjuna",500);
      System.out.println(m);
      
      System.out.println(m.size());
      System.out.println(m.keySet());
      System.out.println(m.values());
      System.out.println(m.entrySet());
      
      
     
      Set s1= m.entrySet();
    Iterator itr= s1.iterator();
      while(itr.hasNext()) {
    	  Map.Entry  m1=(Map.Entry )itr.next();
    	  System.out.println(m1.getKey()+"-----"+m1.getValue());
    	  if(m1.getKey().equals("nagarjuna")) {
    		  m1.setValue(10000);
    	  }
    	  
      }
      System.out.println(m);
      
	}

}
