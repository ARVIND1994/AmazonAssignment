package com.qa.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menu {
	private WebDriver driver; 
	private By menu = By.id("nav-hamburger-menu");
	private By electronics_menu = By.xpath("//div[normalize-space()='TV, Appliances, Electronics']");
	private By tv_menu = By.xpath("//a[normalize-space()='Televisions']");
	private By samsung_tv = By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Samsung']");


 public Menu(WebDriver driver) {
	 this.driver = driver ;
 }
 
 //public page methods
 
 
 public  String gettitle() {
	 return driver.getTitle();
	 
	 
 }
 
 public String getpageurl() {
	 return driver.getCurrentUrl();
 }
 
 public void clickmenu() {
	 driver.findElement(menu).click();
	 driver.findElement(electronics_menu).click();
	 driver.findElement(tv_menu).click();
	 driver.findElement(samsung_tv).click();
 }
 
 

}
