package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_com {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/r.php");
	 WebElement ele = driver.findElement(By.xpath("//select[@id='month']"));
	 Select s=new Select(ele);
	 List<WebElement> opt = s.getOptions();
	 int count=opt.size();
	 System.out.println(count);
	 for (WebElement we : opt)
	 {
		String t=we.getText();
		System.out.println(t);
	}

	}

}
