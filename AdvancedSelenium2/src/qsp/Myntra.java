package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("T-Shirts");
	driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
	driver.findElement(By.xpath("//img[@alt='Puma Men Blue Printed Manchester City Football T-shirt']")).click();
	Set<String> allwh = driver.getWindowHandles();
	String pid = driver.getWindowHandle();
	for (String wh : allwh) 
	       {
		if(wh.equals(pid))
		{
		driver.switchTo().window(wh);
	     }
	
	       }
	driver.findElement(By.xpath("//div[@class='size-buttons-tipAndBtnContainer']/../div[2]")).click();
	driver.findElement(By.xpath("//div[.='ADD TO BAG']")).click();
	}
}

