package com.BOOTCAMP_QUESTIONS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Title_Page {
	// Write a TestNG test to navigate to a website and verify the title of the page.
	
	@Test
	public void NavigateWebsiteToVerifyTitlePage() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println("The Website is:"+ url);
		System.out.println("The Title is:"+ title);
		driver.quit();
		

		
		
		
	}
}
