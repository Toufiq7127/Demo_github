package TESTNG_________;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Jobclass_script1 extends Generic_Script
{
@Test
public void login()
{
	driver.findElement(By.xpath("//a[.='Login']")).click();
	driver.findElement(By.id("email")).sendKeys("toufiq@gmail.com");
	driver.findElement(By.id("password")).sendKeys("9535207127");
	driver.findElement(By.id("loginBtn")).click();
	
}

}
