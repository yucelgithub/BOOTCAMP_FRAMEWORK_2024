package com.demo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public WebDriver driver;
	
	@FindBy(linkText = "Samsung galaxy s6")
	private WebElement galaxys6;
	
		
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean displayStatusOfGalaxys6() {
		boolean status =galaxys6.isDisplayed();
		return status;
	}
	
	}

