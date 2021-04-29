package com.te.factorymethod;

public class HtmlButton  implements Button{

	@Override
	public void rendering() {
		System.out.println("<Button> button </Button>");
		clicking();
	}

	@Override
	public void clicking() {
		System.out.println("Button Clicked");
		
	}

}
