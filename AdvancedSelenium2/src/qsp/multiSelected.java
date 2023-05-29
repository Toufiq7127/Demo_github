package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelected {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/Empire.html");
	   WebElement ele = driver.findElement(By.id("Empire"));
	  Select S = new Select(ele);
	  boolean b=S.isMultiple();
	  if (b)
	  {
		  System.out.println("multiselected dropdown");
	  }
	  else
	  {
		  System.out.println("is not multiselected dropdown");
	  }

	}

}
