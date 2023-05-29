package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.com/");
             		 driver.findElement(By.xpath("//input[@id='r-date']")).click();
             		driver.findElement(By.xpath("(//span[.='4'])[1]")).click();


	}

}
