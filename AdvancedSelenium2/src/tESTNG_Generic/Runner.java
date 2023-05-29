package tESTNG_Generic;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner extends Generic_script1
{
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//a[.='Login']")).click();
		driver.findElement(By.id("email")).sendKeys("toufiq@gmail.com");
		driver.findElement(By.id("password")).sendKeys("9535207127");
		driver.findElement(By.id("loginBtn")).click();
	}
	@Test
	public void logout()
	{
		driver.findElement(By.xpath("//a[.='Login']")).click();
		Assert.fail();
		driver.findElement(By.id("email")).sendKeys("toufiq@gmail.com");
		driver.findElement(By.id("password")).sendKeys("9535207127");
		driver.findElement(By.id("loginBtn")).click();
		
	}	
}
