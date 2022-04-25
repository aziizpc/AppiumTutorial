package com.qa.base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class Basics extends Base {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver driver = capabilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Preference']")).click();		
		driver.findElement(By.xpath("//android.widget.TextView[@text = '3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();	// Note: Selecting the second element based on class
		driver.findElement(By.className("android.widget.EditText")).sendKeys("HelloWorld@123");
		//driver.findElement(By.id("android:id/button1")).click();
		driver.findElements(By.className("android.widget.Button")).get(1).click();	// Find all the elements of this ClassName and click the second one.
		

	}

}