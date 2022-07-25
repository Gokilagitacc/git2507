 package com.stepdefinition;

import java.awt.AWTException;

import org.junit.Assert;
import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep extends BaseClass {
	
         PageObjectManager pom = new PageObjectManager();
	
	
	@Given("User is on the Adactin page")
	public void userIsOnTheAdactinPage()  {
		
	}

	@When("User should enter {string}, {string}")
	public void userShouldEnter(String username, String password) {
		
		pom.getLoginPage().login(username, password	);
		
	}

	
	@When("User Should login with the help of enter key {string}, {string}")
	public void userShouldLoginWithTheHelpOfEnterKey(String username, String password) throws AWTException {
		
		pom.getLoginPage().loginWithEnter(username, password);
       
	
	}

	@Then("User Should verify Login Error Message contains {string}")
	public void userShouldVerifyLoginErrorMessageContains(String expected) {
		
		pom.getLoginPage().login();
		String text = getText(pom.getLoginPage().getTxtErrormessage());
		Assert.assertTrue("Verify Error Message", text.contains(expected));
		System.out.println(text);
		
	}
	
}
