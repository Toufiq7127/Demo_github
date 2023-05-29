package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input['@type=text' and @name='q']")).sendKeys("mobiles");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='_4rR01T' and text()='SAMSUNG Galaxy F13 (Waterfall Blue, 64 GB)']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='button']")).click();
	}
}
