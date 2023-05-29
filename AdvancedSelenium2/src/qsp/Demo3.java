package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3
{
public static void main(String[] args)
{
	String key="webdriver.gecko.driver";
	String value="./Softwares1/geckodriver.exe";
	System.setProperty(key, value);
	FirefoxDriver driver = new FirefoxDriver();
}
}
