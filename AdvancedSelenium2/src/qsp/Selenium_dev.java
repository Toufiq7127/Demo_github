package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_dev {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		ArrayList l=new ArrayList();
 WebElement ele1= driver.findElement(By.xpath("//span[.='Downloads']"));
 WebElement ele2 = driver.findElement(By.xpath("//span[.='Documentation']"));
 WebElement ele3 = driver.findElement(By.xpath("//span[.='Projects']"));
 WebElement ele4 = driver.findElement(By.xpath("//span[.='Support']"));
 WebElement ele5 = driver.findElement(By.xpath("//span[.='Blog']"));
l.add(ele1);
l.add(ele2);
l.add(ele3);
l.add(ele4);
l.add(ele5);
Actions a=new Actions(driver);
Robot r =new Robot();
for(Object we:l)
{
	a.contextClick((WebElement)we).perform();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	
}

Set<String> wh = driver.getWindowHandles();
//ArrayList o=new ArrayList(wh);
//for(String b:wh)
//{
//	driver.switchTo().window(b);
//	Thread.sleep(2000);
//}
int count=wh.size();

/*for (int i = 1; i <count; i++) 
//{
//	if(i==count-1)
//	{
//	String 	s= wh.get(i);
	//	driver.switchTo().window(wh);
	}
}*/
//Collections.sort(o);
int i=0;
for(String t:wh)
{
	if(i==count-1)
	{
		driver.switchTo().window(t);
		
	}
	i++;

}
	}

	}

