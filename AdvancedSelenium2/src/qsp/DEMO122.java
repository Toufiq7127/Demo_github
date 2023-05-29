package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO122 

{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.amazon.com");
	 String title=driver.getTitle();
System.out.println(title);
//	driver.close();
//	driver.getCurrentUrl();
//	driver.getPageSource();
//	
}
}
