package com.qa.practice.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.practice.base.TestBase;
import com.qa.practice.pages.DashBoard;
import com.qa.practice.pages.loginPage;

public class loginPageTEST extends TestBase {

	
	loginPage lp ;
	DashBoard db;
	
	@BeforeMethod
	public void SetUp() throws IOException {
		
		driver_run();
		lp = new loginPage();
		db =new DashBoard();
		
		
	}	
		
	@Test
	public void validLoginTest() {
		
	db=	lp.dologin(pro.getProperty("username"), pro.getProperty("password"));
	Assert.assertTrue(db.userNameAfterLogin());	
		
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
