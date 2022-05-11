package com.qa.amazon.pages;

import org.openqa.selenium.WebDriver;

import com.qa.amazon.utils.ConstantUtils;
import com.qa.amazon.utils.ElementsUtils;

public class LoginPage {
	private ElementsUtils elementUtil; 

	
	
	 public LoginPage(WebDriver driver) {
		 elementUtil = new ElementsUtils(driver);
	 }

	 public  String getlogintitle() {

		 return elementUtil.waitForTitle(5, ConstantUtils.LOGIN_PAGE_TITLE);
		 
	 }
	 
	 public String getpageurl() {
		 return elementUtil.getLoginPageUrl();
	 }
	 

}
