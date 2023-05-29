package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Min_max {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Softwares1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

	}

}
