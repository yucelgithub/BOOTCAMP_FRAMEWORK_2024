package com.demo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

		
		public WebDriver driver;
		
		
		@FindBy(id ="loginusername")
        private WebElement LoginTextBox;
		
		@FindBy(id="loginpassword")
		private WebElement passwordTextBox;
				
		
		
		public LoginPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
		public void enterusername(String usernameText) {
			LoginTextBox.sendKeys(usernameText);
		}
		
		public void enterPassword(String passwordText) {
			passwordTextBox.sendKeys(passwordText);
		}
						
		public AccountPage directlyGoToAccountPage(String loginTextBox, String passwordText) {
			LoginTextBox.sendKeys(loginTextBox);
			passwordTextBox.sendKeys(passwordText);
			return new AccountPage(driver);	
		}
		
		

	}


