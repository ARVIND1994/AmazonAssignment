package com.qa.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.amazon.utils.ElementsUtils;

public class ProductList {

private WebDriver driver; 
	
	private static ElementsUtils elementUtil; 
	private By sort = By.xpath("//select[@id='s-result-sort-select']");
	private By productclick = By.xpath("(//span[@class='a-price'])[2]");
	private static By actualString = By.xpath("//h1[normalize-space()='About this item']");

	
	
	
	public ProductList(WebDriver driver) {
		 elementUtil = new ElementsUtils(driver);
	 }
	
	public void sortingproduct(){
		elementUtil.doSelectDropDownByVisibleText(sort, "Price: High to Low");
		
	}
	  public void clickmenu() {
		  elementUtil.doClick(productclick);
		  
	  }
	  public void switchwindow() {
		  elementUtil.switchToWindowAndGetTitle();
	  }
	  
	  public static String gettextofvalue() {
		  return elementUtil.verifytextpresentatpage(actualString);
	  }
	  
	

}
