package tESTNG_Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginScript 
{
@Test
public void validLogin() 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	POM_Script pm=new POM_Script(driver);
	pm.user();
	pm.pass();
	pm.toClick();
	driver.close();
	
}
}

