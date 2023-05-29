package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/mainpage.html");
		driver.findElement(By.id("a1")).sendKeys("Toufiq");
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("f1");
     WebElement ele=driver.findElement(By.id("f1"));
     driver.switchTo().frame(ele);
		driver.findElement(By.id("b1")).sendKeys("Shahid");
		

	}

}
