package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drodown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.srsbooking.com/car-rental-services");
		 WebElement ele = driver.findElement(By.xpath("//select[@name='request_feature[bus_type]']"));
		
Select s=new Select(ele);
ArrayList n=new ArrayList();
List<WebElement> opt = s.getOptions();
for (WebElement we : opt) 
{
	 String b=we.getText();
	 //System.out.println(b);
	 n.add(b);
	
}
Collections.sort(n);
for(Object e:n) 
{
	System.out.println(e);
}
int  count=opt.size();
System.out.println(count);
	}

}
