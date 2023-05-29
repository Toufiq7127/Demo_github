package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO1 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe")	;
WebDriver driver =new ChromeDriver();
driver.get("https://www.google.com");
 String url=driver.getCurrentUrl();
 System.out.println(url+"hellllllllllllllllllllllllllllllo");
 String Title= driver.getTitle();
 System.out.println(Title+"broooooooooooooooooooooooooo");
  String page=driver.getPageSource();
  System.out.println(page);
   Thread.sleep(2000);
   driver.close();
}
}
