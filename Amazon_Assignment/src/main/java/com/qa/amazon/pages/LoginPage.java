package com.qa.amazon.pages;

import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver; 

	
	
	 public LoginPage(WebDriver driver) {
		 this.driver = driver ;
	 }

	 public  String getlogintitle() {
		 return driver.getTitle();
		 
		 
	 }
	 
	 public String getpageurl() {
		 return driver.getCurrentUrl();
	 }
	 

}
