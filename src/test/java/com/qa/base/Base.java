package com.qa.base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static void main(String[] args) throws MalformedURLException {
		
	}
	
	public static AndroidDriver capabilities() throws MalformedURLException {
		
		File appDir = new File("src");
		File app = new File(appDir, "ApiDemos-debug.apk");

		DesiredCapabilities cap = new DesiredCapabilities();		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "AzeezEmulator"); // Give the Emulator name you created		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());	// Passing the apk file
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");	// Android
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		return driver;
		

	}

}