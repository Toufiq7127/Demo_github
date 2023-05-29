package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo123 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); driver.get("https://facebook.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		 String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
