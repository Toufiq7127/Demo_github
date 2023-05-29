package qsp;


import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement ele= driver.findElement(By.xpath("//a[.='Facebook']"));
		ele.click();
		Point p=ele.getLocation();
		int y=p.getY();
		JavascriptExecutor js =(JavascriptExecutor) driver;
	
		
		js.executeScript("window.scrollBy(0,"+y+")");


	}

	
}
