package com.te.factorymethod;

public class MainClass {
private static Dialog dialog;	
public static void main(String[] args)
{
	configure();
	runBusinessLogic();
}
 static void configure()

{
   System.out.println(System.getProperty("os.name"));
	 if(System.getProperty("os.name").equals("Windows 10"))
	 {
		 dialog=new WindowDialog();
	 }
	 else
	 {
		 dialog=new HtmlDialog();
	 }
}
// abstraction happening
public static void runBusinessLogic()
{
	dialog.renderWindow();
}
}

