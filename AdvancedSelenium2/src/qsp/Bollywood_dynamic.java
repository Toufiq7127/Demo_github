package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Bollywood_dynamic {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bollymoviereviewz.com/2013/04/bollywood-box-office-collection-2013.html");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[.='Gumraah']/../../../td[2]")).click();
		
//		driver.findElement(By.xpath("//a[@target='_blank' and text()='Bholaa ']/../../../td[3]")).click();
//		
//		driver.findElement(By.xpath("//a[@href='https://www.bollymoviereviewz.com/2022/12/ved-marathi-budget-day-1-box-office-collection.html']/../../td[4]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@href='https://www.bollymoviereviewz.com/2023/03/bholaa-budget-day-1-box-office-collection.html']/../../following::td[2]")).click();

	}

}
