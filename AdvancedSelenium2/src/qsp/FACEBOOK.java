package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FACEBOOK {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("9535207127");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Touf9096403323");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();

	}

}
