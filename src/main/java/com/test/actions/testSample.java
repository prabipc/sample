package com.test.actions;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.learn.sample.demoQA;
import com.learn.sample.launchApplication;

public class testSample {

	
	@Test()
	public void testLoginChrome() throws FileNotFoundException
	{
		launchApplication.launch("chrome");
		demoQA.read();
		
		
	}
	@Test()
	public void testLoginEdge() throws FileNotFoundException
	{
		launchApplication.launch("Edge");
		demoQA.read();
		
		//demoQA.login();
		
	}
	
	
}
