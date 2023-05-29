package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sort {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/Empire.html");
	   WebElement ele = driver.findElement(By.id("Empire"));
	  Select S = new Select(ele);
	  ArrayList<String> l=new ArrayList<String>();
	  List<WebElement> opt = S.getOptions();
	  int count=opt.size();
	  System.out.println(count);
for (WebElement we : opt)
{
	String t=we.getText();
	System.out.println(t);
}

Collections.sort(l);
for (String s : l)
{
	System.out.println(s);
}

	}

}
