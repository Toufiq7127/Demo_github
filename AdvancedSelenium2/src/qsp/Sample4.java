package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("htttps://WWW.Facebook.com");
	        String	url=driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(4000);
	}

}
//System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
//WebDriver driver=new ChromeDriver();
//driver.get("http://www.Facebook.com");