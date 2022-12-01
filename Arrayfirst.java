package com.colecctions.practice;

import java.util.Arrays;

public class Arrayfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Studentarray[] s= new Studentarray[10];
      s[0]= new Studentarray(1000, "harish");
      s[1]= new Studentarray(1023, "harish234");
      s[2]=new Studentarray(1058,"haybw");
      
      
      for(int i =0;i<s.length;i++) {
      
     System.out.println(s[i]);
      }
	}

}
