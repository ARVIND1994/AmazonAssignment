package com.qa.amazon.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.amazon.factory.driverfactory;
import com.qa.amazon.pages.LoginPage;

public class basetest {

	driverfactory df;
	private WebDriver driver;
	public LoginPage loginpage;
	Properties prop;
	@BeforeTest
	public void setup() {
		df = new driverfactory();
		  prop = df.init_prop();
		 driver = df.init_driver(prop);
		 loginpage = new LoginPage(driver);
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
