package com.qa.practice.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.practice.base.TestBase;
import com.qa.practice.pages.DashBoard;
import com.qa.practice.pages.loginPage;

public class DashBoardTest extends TestBase{

	DashBoard db;
	loginPage lp;
	
	
	
	@BeforeMethod
	public void setup() throws IOException {
		driver_run();
		lp =new loginPage();
		db=lp.dologin(pro.getProperty("username"), pro.getProperty("password"));
		db = new DashBoard();
		
	}
	
	
	
	@Test
	public void dashboardWalletTest() throws InterruptedException {
    Assert.assertTrue(db.deshboardWallet());
    
	}
	
	
	
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		
		Thread.sleep(4000);
		driver.quit();
		
	}
	
	
}
