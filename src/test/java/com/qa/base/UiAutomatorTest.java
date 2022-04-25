package com.qa.base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class UiAutomatorTest extends Base {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver driver = capabilities();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Syntax: driver.findElement(MobileBy.AndroidUIAutomator("attribute(\"value\")"))

		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click(); // ("attribute("value")") . Then put
																					// \ as escape character.

		
		// Validate clickable feature for all options: // 'Clickable' is a property, not attribute (Unlike above). Hence, "new UiSelector().".
		// Syntax: driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().property(value)")) --> 's'
		int size = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().clickable(true)")).size();	// Giving wrong?
		System.out.println(size);		

	}

}