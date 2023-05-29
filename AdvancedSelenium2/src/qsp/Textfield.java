package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textfield {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/textfield.html");
		List<WebElement> txt = driver.findElements(By.xpath("//input[@type='text']"));
		int count=txt.size();
		System.out.println(count);
		for (WebElement we : txt) 
		{
			we.sendKeys("Toufiq");
			Thread.sleep(2000);
		}
        for (int i = count-1; i>=0; i--) 
        {
		 WebElement	we=txt.get(i);
		 Thread.sleep(2000);
		 we.clear();
		}
	}
}