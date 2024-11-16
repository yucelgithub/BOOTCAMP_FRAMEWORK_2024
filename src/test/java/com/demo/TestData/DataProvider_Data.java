package com.demo.TestData;

import org.testng.annotations.DataProvider;

public class DataProvider_Data {
	
	@DataProvider(name="TNLogin")
	public Object[][] getLoginData(){
		Object[][] getData = { {"seleniumyucel",  "selenium123"},
				               {"seleniumyucel",  "selenium1234"},
		                       {"aseleniumyucel", "selenium1234"},
		                       {"bseleniumyucel", "selenium123"},
		                       {"cseleniumyucel", "selenium1234"}};
		                       
		
			return getData;
		}
	@DataProvider(name ="TNRegister")
	public Object[][] getRegisterData(){
		
	       Object[][] getData ={{"seleniumyucel","selenium123"}};

	return getData;
		
		}
				        
	}
		  
	
		
		
		
	
	
	


