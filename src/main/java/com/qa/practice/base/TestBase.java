package com.qa.practice.base;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
	public static Properties pro;
	public static FileInputStream fis;
	public static WebDriver driver;
	
	
	public void driver_run() throws IOException  {
		
		pro =new  Properties();
		fis = new FileInputStream("C:\\Users\\jekha\\eclipse-workspace\\TestBeeFramework_Deepa\\src\\main\\java\\com\\qa\\practice\\config\\configaration.properties");
    
		pro.load(fis);
		String browser =pro.getProperty("Browser");
		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 
		}else if (browser.equalsIgnoreCase("edge")) {
			

		}else if (browser.equalsIgnoreCase("safari")) {
			

		}else if (browser.equalsIgnoreCase("opera")) {
			
		}
		
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        driver.get("https://www.phptravels.net/login");



}

	

	public static void main (String[]args) throws IOException {
	      TestBase obj = new TestBase();
	       obj.driver_run();

}
			
	}
	
	
	


