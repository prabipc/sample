package com.learn.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launchApplication {
	public static WebDriver driver;
	
	public static void launch(String browser) {
		if(browser=="chrome")
		{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\chromedriver.exe");
	driver=new ChromeDriver();
		}
		else if(browser=="edge")
		{
	System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\eclipse-workspace\\msedgedriver.exe");
	driver=new EdgeDriver();

	}
	}
	
}
