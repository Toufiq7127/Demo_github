package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./Softwares1/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://youtube.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Besharam rang");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//yt-formatted-string[.='Besharam Rang Song | Pathaan | Shah Rukh Khan, Deepika Padukone | Vishal & Sheykhar | Shilpa, Kumaar' and @class='style-scope ytd-video-renderer']")).click();
}
}