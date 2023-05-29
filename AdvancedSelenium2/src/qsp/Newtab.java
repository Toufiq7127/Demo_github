package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Newtab {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
	    driver.findElement(By.xpath("//button[.='✕']")).click();
	  Actions act =new Actions(driver);
	   WebElement ele=driver.findElement(By.xpath("//div[.='Mobiles' and @class='xtXmba']"));
	 
act.contextClick(ele).perform();
 Robot r=new Robot();
 r.keyPress(KeyEvent.VK_T);
 r.keyRelease(KeyEvent.VK_T);
driver.close();


	}

}
