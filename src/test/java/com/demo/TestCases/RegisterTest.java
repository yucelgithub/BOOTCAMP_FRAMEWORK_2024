package com.demo.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.TestBase.TestBase;
import com.demo.TestData.DataProvider_Data;

public class RegisterTest extends TestBase {
	

	
  public RegisterTest() throws Exception {
		super();
		
	}

public WebDriver driver;
	
	@BeforeMethod
	public void loginSetup() {
		driver= initializeBrowserOpenApplication(prop.getProperty("browser"));
		driver.findElement(By.id("signin2")).click();
		
	}
	
	@Test(priority=1, dataProvider="TNRegister",dataProviderClass=DataProvider_Data.class)
	public void RegisterWithValidUsernameValidPassword(String username,String password) {
		
		driver.findElement(By.id("sign-username")).sendKeys(username);
		driver.findElement(By.id("sign-password")).sendKeys(password);
		//div[@id='exampleModal']/following::button[2]
		driver.findElement(By.xpath("//div[@id='exampleModal']/following::button[2]")).click();
		
	}
	@Test(priority=2)
	public void RegisterWithValidUsernameInvalidPassword() {
	
		driver.findElement(By.id("sign-username")).sendKeys("seleniumyucel");
		driver.findElement(By.id("sign-password")).sendKeys("selenium1234");
		driver.findElement(By.xpath("//div[@id='exampleModal']/following::button[2]")).click();
	
    }
	@Test(priority=3)
	public void RegisterWithInValidUsernameValidPassword() {
		
		driver.findElement(By.id("sign-username")).sendKeys("aseleniumyucel");
		driver.findElement(By.id("sign-password")).sendKeys("selenium123");
		driver.findElement(By.xpath("//div[@id='exampleModal']/following::button[2]")).click();
    }
	
	@Test(priority=4)
	public void RegisterWithNoCredentials() {
		driver.findElement(By.xpath("//div[@id='exampleModal']/following::button[2]")).click();	
		
    }
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}

