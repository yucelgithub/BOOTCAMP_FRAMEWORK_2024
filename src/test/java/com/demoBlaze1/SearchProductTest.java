package com.demoBlaze1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchProductTest {
			

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
			
		
		}
		@Test
		public void NavigateDifferentPage() throws InterruptedException {
			driver.findElement(By.linkText("Samsung galaxy s6")).sendKeys("Samsung galaxy s6");
			Assert.assertTrue(driver.findElement(By.linkText("Samsung galaxy s6")).isDisplayed());
			Thread.sleep(3000);
			
						 
	}

	@AfterMethod
    public void TearDown() {
		driver.quit();
	}
}	