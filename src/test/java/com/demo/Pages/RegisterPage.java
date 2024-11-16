package com.demo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public WebDriver driver;

	@FindBy(id = "sign-username")
	private WebElement usernameTextBox;

	@FindBy(id = "sign-password")
	private WebElement passwordTextBox;

	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enteruserName(String usernameText) {
		usernameTextBox.sendKeys(usernameText);
	}

	public void enterLastName(String passwordText) {
		passwordTextBox.sendKeys(passwordText);
	}

	public AccountSuccessPage combineMandatoryDetailsToNavigateToAccountSuccessPage(String usernameText,String passwordText) {
		usernameTextBox.sendKeys(usernameText);
		passwordTextBox.sendKeys(passwordText);
		return new AccountSuccessPage(driver);
	}
}
	

	