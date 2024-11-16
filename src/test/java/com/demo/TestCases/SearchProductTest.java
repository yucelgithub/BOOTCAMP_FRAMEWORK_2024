package com.demo.TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demo.Listeners.MyListeners;
import com.demo.TestBase.TestBase;



 @Listeners({MyListeners.class})  
 

public class SearchProductTest extends TestBase{
	

	public SearchProductTest() throws Exception {
		super();	
		}

	WebDriver driver;
	
	@BeforeMethod
	public void loginSetup() {
		driver= initializeBrowserOpenApplication(prop.getProperty("browser"));

	}
	@Test
	public void NavigateDifferentPage() throws Exception  {
		driver.findElement(By.linkText("Samsung galaxy s6")).sendKeys("Samsung galaxy s6");
		Assert.assertTrue(driver.findElement(By.linkText("Samsung galaxy s6")).isDisplayed());
		
				 
}

@AfterMethod
public void TearDown() {
	driver.quit();
}
}		

	
	
	

