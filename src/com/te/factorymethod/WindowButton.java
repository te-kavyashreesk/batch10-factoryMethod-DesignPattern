package com.te.factorymethod;

public class WindowButton implements Button {

	@Override
	public void rendering() {
		
	System.out.println("button created");
	clicking();
	
	}

	@Override
	public void clicking() {
		System.out.println("window Button Clicked");
		System.out.println("exit");		
	}

}
