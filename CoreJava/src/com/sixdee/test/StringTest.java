package com.sixdee.test;

public class StringTest {

	public static void main(String[] args) {

        String s1=new String("vicky");
		//String input=new String("vicky");
		String input = "vicky";
		System.out.println(s1.equals(input));
		
		System.out.println(s1==input);
		
		System.out.println(s1.hashCode());
		System.out.println(input.hashCode());

	}

}
