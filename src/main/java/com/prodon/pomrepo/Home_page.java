package com.prodon.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prodon.Commonutilities.Webdriverutility;

public class Home_page extends Webdriverutility {
	
	WebDriver driver;
@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
private WebElement signoutimg;

@FindBy(xpath="//a[text()='Sign Out']")
private WebElement signoutbtn;

@FindBy(xpath="//a[text()='Products']")
private WebElement productlink;

public WebElement getProductlink() {
	return productlink;
}

public Home_page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}

public WebElement getSignoutimg() {
	return signoutimg;
}

public WebElement getSignoutbtn() {
	return signoutbtn;
}

public void logout()
{
	waitforelelmentvisibility(driver, signoutimg);
	movetoexpectedelement(driver, signoutimg);
	signoutbtn.click();

}
}
