package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

public class SelectHotelStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
	
	
	@Then("User should click the radio button and continue button in select hotel page")
	public void userShouldClickTheRadioButtonAndContinueButtonInSelectHotelPage() {
		
	pom.getSelectHotelPage().selectHotel();
	    	}

	@Then("User Should verify the message after select hotel {string}")
	public void userShouldVerifyTheMessageAfterSelectHotel(String txtBookHotel) {
		String txtBookHotel1 = getText(pom.getSelectHotelPage().getTxtBookHotel());
		Assert.assertTrue("Verify Book A Hotel", txtBookHotel1.contains(txtBookHotel));
		System.out.println(txtBookHotel1);
	    }

	@Then("User need to click continue button without select any hotel")
	public void userNeedToClickContinueButtonWithoutSelectAnyHotel() {
		pom.getSelectHotelPage().selectContinue();
		
	}

	@Then("User should verify the error message in the select hotel page {string}")
	public void userShouldVerifyTheErrorMessageInTheSelectHotelPage(String selectHtl) {
	    String selectHtl1 = getText(pom.getSelectHotelPage().getTxtSelectHotel());
		Assert.assertTrue("Verify Please Select a Hotel", selectHtl1.contains(selectHtl));
        System.out.println(selectHtl1);	
	
	}
	


}
