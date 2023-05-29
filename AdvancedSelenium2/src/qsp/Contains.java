package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	String	title =driver.getTitle();
	System.out.println(title);
	String CR="Facebook – log in or sign up";
	String CR1="https://www.facebook.com/";
	 String url=driver.getCurrentUrl();
	 System.out.println(url);
	if(title.contains(CR))
	{
		System.out.println("Title is same");
		
	}
	else
	{
		System.out.println("Title is not same");

	}
	if(url.contains(CR1))
	{
		System.out.println("url is same");
		
	}
	else
	{
		System.out.println("url is not same");

	}


	}

}
