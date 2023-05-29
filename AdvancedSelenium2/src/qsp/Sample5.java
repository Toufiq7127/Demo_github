package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample5 {

	public static void main(String[] args)
	{

System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://WWW.Facebook.com");
 String page=driver.getPageSource();
 System.out.println(page);

	}

}
//System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
//WebDriver driver=new ChromeDriver();
//driver.get("http://www.Facebook.com");