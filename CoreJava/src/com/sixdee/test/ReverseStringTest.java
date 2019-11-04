package com.sixdee.test;

public class ReverseStringTest {

	public static void main(String[] args) {
		
		String input="vicky";
		String output="";
		int length=input.length();
		
		for(int i=length-1;i>=0;i--) {
			output=output+input.charAt(i);
		}
		System.out.println(output);
		

	}

}
