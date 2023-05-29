package tESTNG_Generic;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Facebook extends Generic_script1
{
@Test
public void ligin()
{
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9535207127");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Touf9535207127");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	String title = driver.getTitle();
	Reporter.log(title);
}

}
