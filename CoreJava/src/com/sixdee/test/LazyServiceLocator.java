package com.sixdee.test;

public class LazyServiceLocator {
	
	private static  LazyServiceLocator locator;
	
	private LazyServiceLocator() {
		
	}
	
	public static LazyServiceLocator getInstance() {
		if(locator==null) {
		locator=new LazyServiceLocator();
		return locator;
		}
		else {
		return locator;
		}
	}
	

}
