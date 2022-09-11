package com.qa.practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.practice.base.TestBase;

public class DashBoard extends TestBase{

	
	public DashBoard() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//span[text()='Welcome Back']")
	WebElement userNameLogo;
	public boolean userNameAfterLogin () {
		return userNameLogo.isDisplayed();
	}
	
	
	
	@FindBy(xpath="//div[contains(@class,'col-lg-3 responsive-column-m user_wallet')]")
	WebElement wallet;
	public boolean  deshboardWallet() throws InterruptedException {
		Thread.sleep(4000);
		return wallet.isDisplayed();
	}
	
	
	
	
	
	
	
	
}
