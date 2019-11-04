package com.sixdee.test;

public class EagerLoadingTest {

	public static void main(String[] args) {
  
		EagerServiceLocator locator1=EagerServiceLocator.getInstaLocator();
		EagerServiceLocator locator2=EagerServiceLocator.getInstaLocator();
		
		System.out.println(locator1);
		System.out.println(locator2);
		
		if(locator1.equals(locator2)) {
			System.out.println("The class is Singleton class");
		}
		else{
			System.out.println("The class is not a singleton class");
		}
		

	}

}
