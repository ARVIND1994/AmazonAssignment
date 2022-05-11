package com.qa.amazon.utils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsUtils {

	private WebDriver driver;

	public ElementsUtils(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public String getLoginPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}

	/********************************** drop down utils ********************/

	public void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public void doSelectDropDownByVisibleText(By locator, String visibletext) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibletext);
	}

	public void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

 




	public void switchToWindowAndGetTitle() {
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
                    }	
       		String title = driver.getTitle();
       		System.out.println(title + "Title of the Current Window");
		
	}
	public String verifytextpresentatpage(By locator) {
		return getElement(locator).getText();

	}





	public String waitForTitle(int timeOut, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}

	
}
