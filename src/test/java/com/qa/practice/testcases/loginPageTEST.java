package com.qa.practice.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.practice.base.TestBase;
import com.qa.practice.pages.loginPage;

public class loginPageTEST extends TestBase {

	loginPage lp ;
	
	
	@BeforeMethod
	public void SetUp() throws IOException {
		
		driver_run();
		
		lp = new loginPage();
		
	}	
		
	
	
	
	
	@Test
	public void phpLogoTest() {
		
		Assert.assertTrue(lp.phpLogo());
		
	}
	
	
	@Test
	public void paymentLogoTest() {
		
		Assert.assertTrue(lp.paymentLogo());
		
		
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
}
