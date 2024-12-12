package com.demo.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.TestBase.TestBase;
import com.demo.TestData.DataProvider_Data;


public class LoginTest extends TestBase {
	
	public LoginTest() throws Exception{
		super();
	}
	   

	
	  public  WebDriver driver;
	  @BeforeMethod
		public void loginSetup() {
			driver= initializeBrowserOpenApplication(prop.getProperty("browser"));
			driver.findElement(By.id("login2")).click();
			
		}
		
		
		@Test(priority=1,dataProvider ="TNLogin",dataProviderClass = DataProvider_Data.class)
		public void LoginWithValidCredentials(String username, String password) {
			
			driver.findElement(By.id("loginusername")).sendKeys(username);
			driver.findElement(By.id("loginpassword")).sendKeys(password);
			driver.findElement(By.xpath("//button[@class='btn btn-primary' and @onclick='logIn()']")).click();
		}	
		@Test(priority=2)
		public void LoginwithValidUsernameInvalidPassword() {
			driver.findElement(By.id("loginusername")).sendKeys("seleniumyucel");
			driver.findElement(By.id("loginpassword")).sendKeys("selenium1234");
			driver.findElement(By.xpath("//button[@class='btn btn-primary' and @onclick='logIn()']")).click();
			
			
		}
		@Test(priority=3)
		public void LoginWitInvalidUsernameValidPassword() {
			driver.findElement(By.id("loginusername")).sendKeys("aseleniumyucel");
			driver.findElement(By.id("loginpassword")).sendKeys("selenium123");
			driver.findElement(By.xpath("//button[@class='btn btn-primary' and @onclick='logIn()']")).click();
			
			
		}
		@Test(priority=4)
		public void LoginWitInvalidUsernameInValidPassword() {
			driver.findElement(By.id("loginusername")).sendKeys("cseleniumyucel");
			driver.findElement(By.id("loginpassword")).sendKeys("selenium1234");
			driver.findElement(By.xpath("//button[@class='btn btn-primary' and @onclick='logIn()']")).click();
		}
		@Test(priority=5)
		public void LoginWitNoCredentials() {
			driver.findElement(By.xpath("//button[@class='btn btn-primary' and @onclick='logIn()']")).click();
		}
			
		@AfterMethod
	    public void TearDown() {
			driver.quit();
			
		   }
       }
      

			
			

			

		
	

