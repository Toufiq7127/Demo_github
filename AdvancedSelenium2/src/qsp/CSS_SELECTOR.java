package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_SELECTOR
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https:www.facebook.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("9535207127");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Touf9535207127");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[name='login']")).click();
}
}
