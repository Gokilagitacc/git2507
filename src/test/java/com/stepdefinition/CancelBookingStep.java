package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

public class CancelBookingStep extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();
	
	
	@Then("User Should Cancel the generated Order Id")
	public void userShouldCancelTheGeneratedOrderId() throws InterruptedException {
		Thread.sleep(5000);
	   pom.getCancelBookingPage().cancelBooking();
	}
	
	 @Then("User Should verify order id cancelled message after cancelling the booking {string}")
	public void userShouldVerifyOrderIdCancelledMessageAfterCancellingTheBooking(String CancelError){
		String cancelErrorMsg1 = getText(pom.getCancelBookingPage().getCancelErrorMsg());
		Assert.assertTrue("Verify The booking has been cancelled.", CancelError.contains(CancelError));	
		System.out.println(cancelErrorMsg1);
	}

	@Then("User Should cancel the Existing Order Id in the Booked Itinerary Page {string}")
	public void userShouldCancelTheExistingOrderIdInTheBookedItineraryPage(String orderId) {
		
		pom.getCancelBookingPage().cancelBooking(orderId);
	}


}
