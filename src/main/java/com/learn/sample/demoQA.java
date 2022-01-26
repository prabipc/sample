package com.learn.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demoQA {

	static By userName = By.id("sso_username");
	static By password=By.id("ssopassword");
	By submit=By.id("signin_button");
	static String uname;
	static String pwd;
	static String url;
	static WebDriver driver=launchApplication.driver;
	
	
	public static WebDriver read() throws FileNotFoundException
	{
		Properties prop;
		try {
			File file=new File("C:\\Users\\DELL\\eclipse-workspace\\data.properties");
			FileInputStream in=new FileInputStream(file);
			prop=new Properties();
			prop.load(in);
			uname=prop.getProperty("userName");
			System.out.println(uname);
			
			pwd=prop.getProperty("password");
			System.out.println(pwd);
			url=prop.getProperty("url");
			System.out.println(url);
		    driver.get(url);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
	public static void login()
	{
		new WebDriverWait(driver, 3).until(ExpectedConditions.presenceOfElementLocated(userName)).sendKeys(uname);
		new WebDriverWait(driver, 3).until(ExpectedConditions.presenceOfElementLocated(password)).sendKeys(pwd);
	}
}
