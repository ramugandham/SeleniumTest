package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement InkMyaccount;
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement InkRegister;
	@FindBy(linkText = "Login")   // Login link added in step5
	WebElement linkLogin;


	public void clickMyAccount() {

		InkMyaccount.click();
	}

	public void clickRegister() {

		InkRegister.click();
	}
	public void clickLogin()
	{
		linkLogin.click();
	}


}
