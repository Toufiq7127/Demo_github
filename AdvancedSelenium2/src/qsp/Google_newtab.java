package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_newtab {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{

		System.setProperty("webdriver.chrome.driver","./Softwares1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com/");
		Thread.sleep(2000);
 WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
Actions a=new Actions(driver);
a.contextClick(ele).perform();
Robot r =new Robot();
r.keyPress(KeyEvent.VK_T);
r.keyRelease(KeyEvent.VK_T);
Set<String> wh = driver.getWindowHandles();
String  p_id=driver.getWindowHandle();
for (String st : wh) 
{ 
	if (p_id!=st)
	{
		driver.switchTo().window(st);	
	}
	
	
}
driver.close();

	}
}
