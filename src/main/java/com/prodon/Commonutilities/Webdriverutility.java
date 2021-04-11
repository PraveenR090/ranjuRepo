package com.prodon.Commonutilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.inject.spi.Element;

public class Webdriverutility {
public void waitforPagetoload(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}


public void waitforelelmentvisibility(WebDriver driver, WebElement element)
{
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(element));
	
}

public void waitforelementtobeclickable(WebDriver driver, WebElement element)
{
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(element));
}

public void waitandclick(WebElement element)
{
	int count = 0;
	while(count<=40)
	{
		try {
			element.click();
			break;
		} catch (Throwable e) {
			count++;
		}
	}
}
 
public void select(WebElement element, String options)
{
	Select s = new Select(element);
	s.selectByValue(options);
}

public void select(WebElement element, int index)
{
	Select s = new Select(element);
	s.selectByIndex(index);
}

public void select( String visibletext, WebElement element)
{
	Select s = new Select(element);
	s.selectByVisibleText(visibletext);
}

public void alertok(WebDriver driver)
{
	driver.switchTo().alert().accept();
}

public void alertcancel(WebDriver driver)
{
	driver.switchTo().alert().dismiss();
}

public void movetoexpectedelement(WebDriver driver, WebElement element)
{
	Actions act = new Actions(driver);
	act.moveToElement(element).perform();
}
















}
