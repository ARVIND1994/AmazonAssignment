package com.qa.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.amazon.utils.ElementsUtils;

public class HomePageMenu {
	private WebDriver driver; 
	
	private ElementsUtils elementUtil; 

	
	private By menu = By.id("nav-hamburger-menu");
	private By electronics_menu = By.xpath("//div[normalize-space()='TV, Appliances, Electronics']");
	private By tv_menu = By.xpath("//a[normalize-space()='Televisions']");
	private By samsung_tv = By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Samsung']");
	
	 public HomePageMenu(WebDriver driver) {
		 elementUtil = new ElementsUtils(driver);
	 }
	 
  public void clickmenu() {
	  elementUtil.doClick(menu);
	  elementUtil.doClick(electronics_menu);
	  elementUtil.doClick(tv_menu);
	  elementUtil.doClick(samsung_tv);
  }


}
