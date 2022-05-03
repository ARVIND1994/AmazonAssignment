package com.qa.amazon.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.amazon.factory.driverfactory;
import com.qa.amazon.pages.LoginPage;

public class basetest {

	driverfactory df;
	private WebDriver driver;
	public LoginPage loginpage;
	@BeforeTest
	public void setup() {
		df = new driverfactory();
		 driver = df.init_driver("chrome");
		 loginpage = new LoginPage(driver);
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
