package com.te.factorymethod;

public abstract class Dialog {
	 public  void renderWindow()
	 {
		Button okButton= createButton();
		okButton.rendering();
	 }
	 public abstract Button createButton();

}
