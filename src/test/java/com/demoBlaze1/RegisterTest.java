package com.demoBlaze1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest {

	
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
		driver.findElement(By.id("signin2")).click();
		
	}
	
	@Test(priority=1)
	public void RegisterWithValidUsernameValidPassword() {
		
		driver.findElement(By.id("sign-username")).sendKeys("seleniumyucel");
		driver.findElement(By.id("sign-password")).sendKeys("selenium123");
		//div[@id='exampleModal']/following::button[2]
		driver.findElement(By.xpath("//div[@id='exampleModal']/following::button[2]")).click();
		
	}
	@Test(priority=2)
	public void RegisterWithValidUsernameInvalidPassword() {
	
		driver.findElement(By.id("sign-username")).sendKeys("seleniumyucel");
		driver.findElement(By.id("sign-password")).sendKeys("selenium12311");
		driver.findElement(By.xpath("//div[@id='exampleModal']/following::button[2]")).click();
	
    }
	@Test(priority=3)
	public void RegisterWithInValidUsernameValidPassword() {
		
		driver.findElement(By.id("sign-username")).sendKeys("11seleniumyucel");
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

