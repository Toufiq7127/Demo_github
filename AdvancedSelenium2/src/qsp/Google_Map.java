package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Map 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./Softwares1/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://maps.google.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@class='eYqqWd']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Choose starting point, or click on the map...']")).sendKeys("Banglore");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("Vijayapur");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='mL3xi' and @aria-label='Search' and @id='searchbox-searchbutton']")).click();
}
}

