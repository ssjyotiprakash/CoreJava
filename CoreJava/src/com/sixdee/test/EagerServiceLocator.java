package com.sixdee.test;

public class EagerServiceLocator {
	private static final EagerServiceLocator locator=new EagerServiceLocator();
	
	private EagerServiceLocator() {
		
	}
	
	public static EagerServiceLocator getInstaLocator() {
		return locator;
	}
	

}
