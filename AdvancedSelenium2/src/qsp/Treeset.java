package qsp;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Treeset {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/Empire.html");
	   WebElement ele = driver.findElement(By.id("Empire"));
	  Select S = new Select(ele);
	  TreeSet<String> l=new TreeSet<String>();
	  List<WebElement> opt = S.getOptions();
	  int count=opt.size();
	  System.out.println(count);
for (WebElement we : opt)
{
	String t=we.getText();
	l.add(t);
}

//Collections.sort(l);
for (String s : l)
{
	System.out.println(s);
}


	}

}
