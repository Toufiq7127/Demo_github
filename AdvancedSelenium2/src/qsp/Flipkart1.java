package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name ='q']")).sendKeys("iphone13");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div[.='APPLE iPhone 13 (Blue, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]"));
		Thread.sleep(2000);
	   String t=ele.getText();
		System.out.println(t);
		Thread.sleep(2000);
	
		String b = t.replaceFirst("₹", "");
		//Thread.sleep(2000);
		String fincos = b.replaceAll(",", "");
		System.out.println(fincos);
		//Thread.sleep(2000);
		driver.close();
	}
}
