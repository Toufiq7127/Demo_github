package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/two.html");
		//driver.findElement(By.tagName("input")).sendKeys("selenium");
		//driver.findElement(By.id("a1")).sendKeys("selenium");
		//driver.findElement(By.name("n1")).sendKeys("selenium");
		driver.findElement(By.className("c1")).sendKeys("selenium");
	}

}
