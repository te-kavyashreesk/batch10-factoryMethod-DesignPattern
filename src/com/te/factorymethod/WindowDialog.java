package com.te.factorymethod;

public class WindowDialog  extends Dialog{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WindowButton();
	}

	
}
