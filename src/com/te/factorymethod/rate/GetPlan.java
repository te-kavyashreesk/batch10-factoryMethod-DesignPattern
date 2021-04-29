package com.te.factorymethod.rate;

public class GetPlan {
	
	public Plan getPlan(String planType)
	{
				if(planType.equalsIgnoreCase("Domestic"))
		        {
			return new Domestic();
		         }
		
				if(planType.equalsIgnoreCase("Commerical"))
				{
					return new Commerical();
				}
				if(planType.equalsIgnoreCase("Institution"))
				{
					return new Institution();
				}
				
				return null;
				
	}

}
