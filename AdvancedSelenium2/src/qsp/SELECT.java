package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SELECT {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/Empire.html");
	   WebElement ele = driver.findElement(By.id("Empire"));
	  Select S = new Select(ele);
	  List<WebElement> opt = S.getOptions();
	   int count=opt.size();
	   System.out.println(count);
	   S.selectByIndex(3);
	   S.selectByValue("4");
	   S.deselectByVisibleText("Chicken hydrabadi");
	   

	}

}