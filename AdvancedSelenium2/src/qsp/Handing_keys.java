package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handing_keys {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
String t=driver.getWindowHandle();
System.out.println(t);
//driver.switchTo().window()

	}

}
