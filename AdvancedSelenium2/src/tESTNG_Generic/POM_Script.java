package tESTNG_Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Script 
{
@FindBy(id="email")
private WebElement usename;
@FindBy(id="pass")
private WebElement pwd;
@FindBy(xpath="//button[.='Log in']")
private WebElement button;
public POM_Script(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void user()
{
	usename.sendKeys("9535207127");
}
public void pass()
{
	pwd.sendKeys("Touf9096403323");
}
public void toClick()
{
	button.click();
}
}