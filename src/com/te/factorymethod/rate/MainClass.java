package com.te.factorymethod.rate;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		 GetPlan plan=new GetPlan();
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the plan");
	     String planType=sc.nextLine();
	     System.out.println("Enter the units");
	     float units=sc.nextInt();

		Plan p=plan.getPlan(planType);
		System.out.println(planType+"amount is" + units);
		p.getRate();
		p.calculateBill(units);
			
				
	
	
	}

}
