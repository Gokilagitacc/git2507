package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 * @author begin
 *@description To maintain the locator for cancel booking page
 *@creation date: 30/06/2022
 */

public class CancelBookingPage extends BaseClass{
	
	public CancelBookingPage() {
	
	PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement btnMyItinerary;
	
	@FindBy(id = "order_id_text")
	private WebElement orderSearch; 
	
	@FindBy(id = "search_hotel_id")
	private WebElement btnOrderSearch;
	
	@FindBy(xpath ="//input[contains(@value, 'Cancel')]")
	private WebElement clickCheckId;
	
	@FindBy(id="search_result_error")
	private WebElement cancelErrorMsg;
	
	
	public WebElement getCancelErrorMsg() {
		return cancelErrorMsg;
	}
	
	public WebElement getBtnMyItinerary() {
		return btnMyItinerary;
	}

	public WebElement getOrderSearch() {
		return orderSearch;
	}

	public WebElement getBtnOrderSearch() {
		return btnOrderSearch;
	}

	
	public WebElement getClickCheckId() {
		return clickCheckId;
	}

	
    
	public void cancelBooking(String orderId) {
	
		click(getBtnMyItinerary());
		type(getBtnOrderSearch(), orderId);
		click(getBtnOrderSearch());
		click(getClickCheckId());
		okAlert();
		System.out.println("Deleted Successfully");
		
	}
	
	public void cancelBooking() {
	
        click(getBtnMyItinerary());
        click(getClickCheckId());
        okAlert();
        
	}
	
	
}
