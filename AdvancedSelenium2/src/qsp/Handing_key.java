package qsp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handing_key {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//ArrayList l=new ArrayList();
//		 WebElement a = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		 a.sendKeys(Keys.ENTER);
//		 WebElement b=driver.findElement(By.xpath("//input[@name='q']"));
//		 b.sendKeys("mobiles");
//		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).sendKeys(Keys.ENTER);
 List<WebElement> links = driver.findElements(By.xpath("//a"));
 //int t=links.size();
 //System.out.println(t);
for(WebElement b:links)
{
	String u=b.getText();
	System.out.println(u);
}
	}

}
