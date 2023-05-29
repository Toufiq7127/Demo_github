package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/checkbox.html");
		List<WebElement> links = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count=links.size();
		for (int i = 0; i <count; i++) 
		{
			WebElement we = links.get(i);
			Thread.sleep(2000);
			we.click();
		}
		Thread.sleep(2000);
		for (int i =count-1; i >=0; i--) 
		{
			WebElement we = links.get(i);
			Thread.sleep(2000);
			we.click();
		}


	}

}
