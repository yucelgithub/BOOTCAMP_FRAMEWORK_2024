package com.demo.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	public WebDriver driver;
	
	
	@FindBy(xpath="//html/body/div[3]/div/div/div[3]/button[2]")
	private WebElement logoutLink;
	
	
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean validateDisplayStatusOfLogoutLink() {
		boolean status = logoutLink.isDisplayed();
		return status;
	}

}
