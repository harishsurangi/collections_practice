package com.colecctionsmap.practice;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Objects;

public class Hashtabletest {
	int i;
	

	public Hashtabletest(int i) {
		super();
		this.i = i;
	}
	
	@Override
	public String toString() {
		return  i+"";
	}
	
	@Override
	public int hashCode() {
		return i;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap h= new HashMap(16);
     
		h.put(new Hashtabletest(5), "A");
		h.put(new Hashtabletest(2), "B");
		h.put(new Hashtabletest(6), "C");
		h.put(new Hashtabletest(15), "D");
		h.put(new Hashtabletest(23), "E");
		h.put(new Hashtabletest(16), "F");
		System.out.println(h);
	}

	
}
