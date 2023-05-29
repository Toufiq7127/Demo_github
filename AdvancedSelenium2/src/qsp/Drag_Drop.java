package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
	    driver.findElement(By.xpath("//button[.='✕']")).click();
	  Actions act =new Actions(driver);
	   WebElement src=driver.findElement(By.xpath("//div[.='Mobiles' and @class='xtXmba']"));
	   WebElement dst=driver.findElement(By.xpath("//div[.='Mobiles' and @class='xtXmba']"));
act.dragAndDrop(src, dst).perform();
driver.close();


	}

}
