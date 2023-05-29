package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_multiple_element {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	 List<WebElement> img = driver.findElements(By.xpath("//img"));
		int Count=img.size();
		System.out.println(Count);
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
			int Count1=links.size();
			System.out.println(Count1);
			List<WebElement> links_img = driver.findElements(By.xpath("//a|//img"));
			int count1=links_img.size();
			System.out.println(count1);
	}

}
