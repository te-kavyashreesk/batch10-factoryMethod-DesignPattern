package com.te.factorymethod.rate;

public  abstract class Plan {
	
  double rate;
 abstract void getRate();
 
 public void calculateBill(float units)
 {
	 System.out.println(rate*units);
 }
}
