package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://WWW.Facebook.com");
	String tittle = driver.getTitle();
	System.out.println(tittle);
}
}
//System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
//WebDriver driver=new ChromeDriver();
//driver.get("http://www.Facebook.com");