package com.prodon.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class Productspage {
@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement addimg;

public Productspage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getAddimg() {
	return addimg;
}
}
 