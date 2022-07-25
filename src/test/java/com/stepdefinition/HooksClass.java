package com.stepdefinition;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
	
	@Before
	
	public void beforeScenario() throws FileNotFoundException, IOException {
	
		getDriver(getPropertyFileValue("browser"));
		getUrl(getPropertyFileValue("url"));
	
	}
	
	@After
	public void afterScenario(Scenario scenario) {
	boolean bool = scenario.isFailed();
	if(bool) {
	   TakesScreenshot screenshot = (TakesScreenshot) driver;
	    byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
	    scenario.embed(b, "All Scenario");
	}  
	}
	
}
