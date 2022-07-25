package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.BaseClass;

public class BookingConfirmationPage extends BaseClass {
	
	@FindBy(id="order_no")
	private WebElement txtorderno;
	
	@FindBy(className="login_title")
	private WebElement txtlogintitle;
	

	public WebElement getTxtorderno() {
		return txtorderno;
	}

	public WebElement getTxtlogintitle() {
		return txtlogintitle;
	}
	
	public String bookingConfirmation() {
		 String orderNum = getAttribute(getTxtorderno());
		 return orderNum;
	}

	
	

}

