package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookingPage extends BaseClass {
	
	public BookingPage() {
	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id= "last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccNum;
	
	@FindBy(id="cc_type")
	private WebElement ccType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ccExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement ccCvv;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;

	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement txtBookConfirm;
	
	@FindBy(id="first_name_span")
	private WebElement firstNameErrorMsg;
	
	@FindBy(id= "last_name_span")
	private WebElement lastNameErrorMsg;
	
	@FindBy(id="address_span")
	private WebElement addressErrorMsg;
	
	@FindBy(id="cc_num_span")
	private WebElement ccNumErrorMsg;
	
	@FindBy(id="cc_type_span")
	private WebElement cctypeErrorMsg;
	
	@FindBy(id="cc_cvv_span")
	private WebElement ccCvvErrorMsg;
	
	@FindBy(id="cc_expiry_span")
	private WebElement ccExpErrorMsg;
	
    public WebElement getCcExpErrorMsg() {
		return ccExpErrorMsg;
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getTxtBookConfirm() {
		return txtBookConfirm;
	}


	public WebElement getFirstNameErrorMsg() {
		return firstNameErrorMsg;
	}


	public WebElement getLastNameErrorMsg() {
		return lastNameErrorMsg;
	}


	public WebElement getAddressErrorMsg() {
		return addressErrorMsg;
	}


	public WebElement getCcNumErrorMsg() {
		return ccNumErrorMsg;
	}


	public WebElement getCctypeErrorMsg() {
		return cctypeErrorMsg;
	}


	public WebElement getCcCvvErrorMsg() {
		return ccCvvErrorMsg;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCcNum() {
		return ccNum;
	}


	public WebElement getCcType() {
		return ccType;
	}


	public WebElement getCcExpMonth() {
		return ccExpMonth;
	}


	public WebElement getCcExpYear() {
		return ccExpYear;
	}


	public WebElement getCcCvv() {
		return ccCvv;
	}


	public WebElement getBtnBookNow() {
		return btnBookNow;
	}


	public void bookHotel(String fName, String lName, String address, String ccNum, String ccType, String ccExpMnth, String ccExpYear, String ccCvv) 
 
	{
	
    	type(getFirstName(), fName);
    	type(getLastName(), lName);
    	type(getAddress(), address);
    	type(getCcNum(), ccNum);
    	type(getCcType(), ccType);
    	type(getCcExpMonth(), ccExpMnth);
    	type(getCcExpYear(), ccExpYear);
    	type(getCcCvv(), ccCvv);
    	click(getBtnBookNow());
    	
	}

     public void bookHotel() {
	
    		click(getBtnBookNow());
    	
       }	
	
}
