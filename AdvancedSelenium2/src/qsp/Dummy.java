package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/r.php");
	WebElement ele = driver.findElement(By.xpath("//input[@type='text' and@name='firstname']"));
ele.sendKeys("Toufiq");
WebElement ele1 = driver.findElement(By.xpath("//input[@type='text' and@name='lastname']"));
ele1.sendKeys("897456123");

	}

}
