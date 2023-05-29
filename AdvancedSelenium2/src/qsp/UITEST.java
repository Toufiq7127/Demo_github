package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UITEST {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com");
		driver.findElement(By.xpath("//a[.='Form']")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Toufiq");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("inamadar");
		driver.findElement(By.xpath("(// label[@class='radio-inline'])[2]")).click();
		driver.findElement(By.xpath("//input[@value='cricket']")).click();
//		WebElement ele = driver.findElement(By.xpath("//select[@id='sel1']"));
//		Select s =new Select(ele);
//		s.getOptions();
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		driver.findElement(By.xpath("//option[.='Mar']")).click();
		driver.findElement(By.xpath("//option[.='1999']")).click();
		driver.findElement(By.xpath("//a[.-'15']")).click();
		driver.findElement(By.xpath("//input[@id='phonenumber']")).sendKeys("9535207121");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Toufiq7127");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("inamadartoufiq@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("hiii");
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("toufiq");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
