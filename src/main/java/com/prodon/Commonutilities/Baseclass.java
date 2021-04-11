package com.prodon.Commonutilities;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.prodon.pomrepo.Home_page;
import com.prodon.pomrepo.Login_page;

public class Baseclass {
public Excel_utility excel = new Excel_utility();
public Fileutility flib = new Fileutility();
public Javautility jlib = new Javautility();
public Webdriverutility wlib = new Webdriverutility();
public WebDriver driver;

@BeforeClass
public void configbeforeclass() throws Throwable
{
	String Browser = flib.getPropertykeyvalue("browser");
	String url = flib.getPropertykeyvalue("url");
	
	try {
		
		if(Browser.equals("firefox"))
		{
			driver = new FirefoxDriver();		
		}
		else if (Browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else {
			driver = new ChromeDriver();
		}
		}
	
	catch (Exception e) {
		throw new Browserdrivermissingexception();
		
	}
driver.get(url);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@BeforeMethod
public void configbeforemethod() throws Throwable
{
	System.out.println("login  to app");
String username = flib.getPropertykeyvalue("username");
System.out.println("username entered");
String password = flib.getPropertykeyvalue("password");
Login_page lp = new Login_page(driver);
lp.logintoApp(username, password);
}

@AfterMethod
public void configaftermethod()
{
	System.out.println("hello");
	Home_page hp = new Home_page(driver);
	//wlib.waitforelelmentvisibility(driver, element);

	
	hp.logout();
	/*Login_page lp = new Login_page(driver);
	wlib.waitforelelmentvisibility(driver, lp.getSubmitbtn());*/
}
@AfterClass
public void configafterclass()
{
	driver.close();
}
}
