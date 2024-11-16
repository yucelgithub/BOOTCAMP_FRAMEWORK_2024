package com.demoBlaze1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	

	WebDriver driver;
	
	@BeforeMethod
	public void loginSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(3000));
		driver.get("https://Demoblaze.com");
		driver.findElement(By.id("login2")).click();
		
	}
	
	@Test(priority=1)
	public void LoginWithValidCredentials() {
		
		driver.findElement(By.id("loginusername")).sendKeys("seleniumyucel");
		driver.findElement(By.id("loginpassword")).sendKeys("selenium123");
		driver.findElement(By.xpath("//html/body/div[3]/div/div/div[3]/button[2]")).click();
		
	}	
	@Test(priority=2)
	public void LoginwithValidUsernameInvalidPassword() {
		driver.findElement(By.id("loginusername")).sendKeys("seleniumyucel");
		driver.findElement(By.id("loginpassword")).sendKeys("selenium12345");
		driver.findElement(By.xpath("//html/body/div[3]/div/div/div[3]/button[2]")).click();
		
		
	}
	@Test(priority=3)
	public void LoginWitInvalidUsernameValidPassword() {
		driver.findElement(By.id("loginusername")).sendKeys("seleniumyucel123");
		driver.findElement(By.id("loginpassword")).sendKeys("selenium123");
		driver.findElement(By.xpath("//html/body/div[3]/div/div/div[3]/button[2]")).click();
		
		
	}
	@Test(priority=4)
	public void LoginWitInvalidUsernameInValidPassword() {
		driver.findElement(By.id("loginusername")).sendKeys("seleniumyucel123");
		driver.findElement(By.id("loginpassword")).sendKeys("selenium123123");
		driver.findElement(By.xpath("//html/body/div[3]/div/div/div[3]/button[2]")).click();
	}
	@Test(priority=5)
	public void LoginWitNoCredentials() {
		driver.findElement(By.xpath("//html/body/div[3]/div/div/div[3]/button[2]")).click();
	}
		
	@AfterMethod
    public void TearDown() {
		driver.quit();
		
	   }
	
	}


