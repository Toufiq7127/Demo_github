package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.com");
	 String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	
	}

}
