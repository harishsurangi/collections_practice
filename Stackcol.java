package com.colecctions.practice;

import java.util.Stack;

public class Stackcol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stack s= new Stack();
      s.push("harish");
      s.push("ha");
      s.push("ri");
      s.push("sh");
      s.push("hash");
      System.out.println(s);
      s.pop();
      System.out.println(s.peek());
      System.out.println(s.empty());
      System.out.println(s.search("ri"));
      System.out.println(s.search("gh"));
      System.out.println(s);
	}

}
