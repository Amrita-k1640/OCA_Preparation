package com.oca.day1;

public class Example3 {
	 
	    public static void main(String args[]) { 
	            StringBuilder s = new StringBuilder(10 + 2 + "ABC" + 4 + 5); 
	            s.append(s.delete(3, 6)); 
	            System.out.println(s); 
	    } 
	} 


