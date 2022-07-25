package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;


public class BookingHotelStep extends BaseClass{
	
	PageObjectManager pom = new PageObjectManager();
	
	
	@Then("User Should select all fields in book hotel page {string}, {string}, {string} and Save the Generated Order id")
	public void userShouldSelectAllFieldsInBookHotelPageAndSaveTheGeneratedOrderId(String fName, String lName, String address, io.cucumber.datatable.DataTable dataTable) {
	 
		List<Map<String,String>> m = dataTable.asMaps();
		Map<String, String> e = m.get(0);
		
		String ccNum = e.get("Credit Card No");
		String ccType = e.get("Credit Card Type");
		String ccExpMnth = e.get("Select Month");
		String ccExpYear = e.get("Select Year");
		String ccCvv = e.get("CVV Number");
		
		pom.getBookingPage().bookHotel(fName, lName, address, ccNum, ccType, ccExpMnth, ccExpYear, ccCvv);
		pom.getBookingConfirmationPage().getTxtorderno();
		
		
	}

	@Then("User Should Verify the message after clicking book now {string}")
	public void userShouldVerifyTheMessageAfterClickingBookNow(String txtBookConfirm) throws InterruptedException {
		
		Thread.sleep(8000);
		String txtBookConfirm1 = getText(pom.getBookingPage().getTxtBookConfirm());		
		Assert.assertTrue("Verify Booking Confirmation", txtBookConfirm1.contains(txtBookConfirm));
		System.out.println(txtBookConfirm1);
	}

	@Then("User need to click BookNow button without select any field")
	public void userNeedToClickBookNowButtonWithoutSelectAnyField() {
	 
	}

	@Then("User should verify the error message after clicking book now {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void userShouldVerifyTheErrorMessageAfterClickingBookNowAnd(String firstNameError, String lastNameError, String addressErrorMsg, String ccNumErrorMsg, String ccTypeErrorMsg, String ccExpErrorMsg, String ccCvvErrorMsg) {
	   
	    pom.getBookingPage().bookHotel();
	    String firstNameError1 = getText(pom.getBookingPage().getFirstNameErrorMsg());
	    Assert.assertTrue("Verify Please Enter your First Name", firstNameError1.contains(firstNameError));
	    System.out.println(firstNameError1);
	    String lastNameError1 = getText(pom.getBookingPage().getLastNameErrorMsg());
		Assert.assertTrue("Verify Please Enter you Last Name", lastNameError1.contains(lastNameError));
		System.out.println(lastNameError1);
		String addressErrorMsg1 = getText(pom.getBookingPage().getAddressErrorMsg());
		Assert.assertTrue("Verify Please Enter your Address", addressErrorMsg1.contains(addressErrorMsg));
		System.out.println(addressErrorMsg1);
		String ccNumErrorMsg1 = getText(pom.getBookingPage().getCcNumErrorMsg());
        Assert.assertTrue("Verify Please Enter your 16 Digit Credit Card Number", ccNumErrorMsg1.contains(ccNumErrorMsg));
	    System.out.println(ccNumErrorMsg1);
        String ccTypeErrorMsg1 = getText(pom.getBookingPage().getCctypeErrorMsg());
	    Assert.assertTrue("Verify Please Select your Credit Card Type", ccTypeErrorMsg1.contains(ccTypeErrorMsg));
	    System.out.println(ccTypeErrorMsg1);
	    String ccExpErrorMsg1 = getText(pom.getBookingPage().getCcExpErrorMsg());
	    Assert.assertTrue("Verify Please Select your Credit Card Expiry Month", ccExpErrorMsg1.contains(ccExpErrorMsg));
	    System.out.println(ccExpErrorMsg1);
	    String ccCvvErrorMsg1 = getText(pom.getBookingPage().getCcCvvErrorMsg());
	    Assert.assertTrue("Verify Please Enter your Credit Card CVV Number", ccCvvErrorMsg1.contains(ccCvvErrorMsg));
	    System.out.println(ccCvvErrorMsg1);
	    
	}
	
}
