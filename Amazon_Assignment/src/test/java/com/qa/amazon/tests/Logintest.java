package com.qa.amazon.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.amazon.base.basetest;

public class Logintest extends basetest {
	
	@Test(priority = 1)
	public void loginpagetitletest() {
		String title = loginpage.getlogintitle();
		System.out.println("Login Page title is:" + title);
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
	}
	@Test(priority = 2)
	public void loginpageurltest() {
		String url = loginpage.getpageurl();
         Assert.assertTrue(url.contains("amazon.in"));		
	}
	

}
