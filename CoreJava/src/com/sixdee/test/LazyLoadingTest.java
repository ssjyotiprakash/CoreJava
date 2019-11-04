package com.sixdee.test;

public class LazyLoadingTest {

	public static void main(String[] args) {

     LazyServiceLocator locator1=LazyServiceLocator.getInstance();
     LazyServiceLocator locator2=LazyServiceLocator.getInstance();
     
     if(locator1==locator2) {
    	 System.out.println("The above class is a singleton class");
     }
     else {
    	 System.out.println("The above class is not a singleton class");
     }
	}

}
