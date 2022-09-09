package com.qa.practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.practice.base.TestBase;

public class loginPage extends TestBase{

  //Constructor  //page factory
	public loginPage() {
		
		PageFactory.initElements(driver, this); //this reffer to local class instances
		
	}
	
	
	@FindBy(xpath="//input[@name='email']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passWord;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	WebElement loginbutton;
	
	@FindBy(xpath="(//img[@alt='logo'])[1]")
	WebElement logo;
	
	@FindBy(xpath="(//*[contains(@class,'icon-box icon')])[2]")
	WebElement paymentLogo;
	
	public boolean phpLogo() {
		return logo.isDisplayed();
	}
	
	public boolean paymentLogo() {
		return paymentLogo.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
}
