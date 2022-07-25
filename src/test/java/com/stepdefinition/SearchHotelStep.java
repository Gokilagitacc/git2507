package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

public class SearchHotelStep extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();
	
	
	@Then("User should Select all fields in search hotel page {string} ,{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldSelectAllFieldsInSearchHotelPageAnd(String location, String hotels, String roomType, String noofrooms, String checkindate, String checkoutdate, String adultperroom, String childrenperroom) {
	    
		pom.getSearchHotelPage().searchHotel(location, hotels, roomType, noofrooms, checkindate, checkoutdate, adultperroom, childrenperroom);
	    
	}

	@Then("User Should verify the message after search hotel {string}")
	public void userShouldVerifyTheMessageAfterSearchHotel(String selectHotel) {
	
		 String selectHotel1 = getText(pom.getSearchHotelPage().getTxtSelectHotel());
		 Assert.assertTrue("Verify Select Hotel", selectHotel1.contains(selectHotel));
		 System.out.println(selectHotel1);
		
	    }	

	@Then("User Should Select the Mandatory field in search hotel page{string},{string},{string},{string}and{string}")
	public void userShouldSelectTheMandatoryFieldInSearchHotelPageAnd(String location, String noofrooms, String checkindate, String checkoutdate, String adultperroom) {
	
		pom.getSearchHotelPage().searchHotel(location, noofrooms, checkindate, checkoutdate, adultperroom);    
	
	}

	@Then("User should verify error message after search in both date field {string}, {string}")
	public void userShouldVerifyErrorMessageAfterSearchInBothDateField(String string, String string2) {
		
	    }

	@Then("User need to click Search button without select any field")
	public void userNeedToClickSearchButtonWithoutSelectAnyField() {
          pom.getSearchHotelPage().searchHotel();
		
	}
	
	@Then("User should verify the error message after search hotel {string}")
	public void userShouldVerifyTheErrorMessageAfterSearchHotel(String txtSelect) {
	    
		String txtSelect1 = getText(pom.getSearchHotelPage().getTxtSelectLocation());
		Assert.assertTrue("Verify Please Select a Location", txtSelect1.contains(txtSelect));
		System.out.println(txtSelect1);
		
	}
	
}

