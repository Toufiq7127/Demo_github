package tESTNG_Generic;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assert1 extends Generic_script1
{
	@Test
	public void logout()
	{
		driver.findElement(By.xpath("//a[.='Login']")).click();
		
		driver.findElement(By.id("email")).sendKeys("toufiq@gmail.com");
		driver.findElement(By.id("password")).sendKeys("9535207127");
		driver.findElement(By.id("loginBtn")).click();
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title, "Login");
		//Assert.assertTrue(title.contains("Login"));
		//System.out.println("Execution contiues");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(title, "TLo");
		//System.out.println("Execution contiues");
		Reporter.log(title);
		sa.assertAll();
		}
}
