package com.qa.amazon.tests;

import com.qa.amazon.utils.ConstantUtils;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.amazon.base.basetest;

public class Logintest extends basetest {
	
	@Test(priority = 1)
	public void loginpagetitletest() {
		String title = loginpage.getlogintitle();
		System.out.println("Login Page title is:" + title);
		Assert.assertEquals(title,ConstantUtils.LOGIN_PAGE_TITLE);
		
	}
	@Test(priority = 2)
	public void loginpageurltest() {
		String url = loginpage.getpageurl();
         Assert.assertTrue(url.contains(ConstantUtils.LOGIN_URL_VALUE));		
	}
	

}
