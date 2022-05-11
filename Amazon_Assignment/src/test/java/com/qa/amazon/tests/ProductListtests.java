package com.qa.amazon.tests;

import org.testng.Assert;

import com.qa.amazon.pages.ProductList;
import com.qa.amazon.utils.ConstantUtils;

public class ProductListtests {


	public void textverify() {
		String text = ProductList.gettextofvalue();
		System.out.println("The value of text is:" + text);
		Assert.assertEquals(text,ConstantUtils.TEXT_ON_PAGE);
		
	}
	 
}
