package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotelPage extends BaseClass {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement dDnLocation;

	@FindBy(id="hotels")
	private WebElement dDnHotels;

	@FindBy(id="room_type")
	private WebElement dDnroomtype;

	@FindBy(id="room_nos")
	private WebElement dDnroomno;

	@FindBy(id="datepick_in")
	private WebElement txtDatein;

	@FindBy(id="datepick_out")
	private WebElement txtDateout;

	@FindBy(id="adult_room")
	private WebElement txtadultroom;

	@FindBy(id="child_room")
	private WebElement txtchildroom;
	
    @FindBy(xpath="//td[text()='Select Hotel ']")
    private WebElement txtSelectHotel;
   
	@FindBy(id="location_span")
	private WebElement txtSelectLocation;
	
    @FindBy(id="checkin_span")
    private WebElement txtCheckIn;
    
    @FindBy(id="checkout_span")
    private WebElement txtCheckOut;
	
	public WebElement getTxtSelectHotel() {
		return txtSelectHotel;
	}


	public WebElement getTxtSelectLocation() {
		return txtSelectLocation;
	}


	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}


	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	@FindBy(id="Submit")
	private WebElement btnsubmit;

   
	public WebElement getdDnLocation() {
		return dDnLocation;
	}


	public WebElement getdDnHotels() {
		return dDnHotels;
	}


	public WebElement getdDnroomtype() {
		return dDnroomtype;
	}


	public WebElement getdDnroomno() {
		return dDnroomno;
	}


	public WebElement getTxtDatein() {
		return txtDatein;
	}


	public WebElement getTxtDateout() {
		return txtDateout;
	}


	public WebElement getTxtadultroom() {
		return txtadultroom;
	}


	public WebElement getTxtchildroom() {
		return txtchildroom;
	}


	public WebElement getBtnsubmit() {
		return btnsubmit;
	}



 public void searchHotel(String location, String hotels,  String roomType, String noofrooms, String checkindate, String checkoutdate, String adultperroom, String childrenroom) {
	selectOptionByText(getdDnLocation(),location);
	selectOptionByText(getdDnHotels(), hotels);
	selectOptionByText(getdDnroomtype(), roomType);
    selectOptionByText(getdDnroomno(), noofrooms);
	type(getTxtDatein(), checkindate);
	type(getTxtDateout(), checkoutdate);
    selectOptionByText(getTxtadultroom(), adultperroom);
	selectOptionByText(getTxtchildroom(), childrenroom);
	click(getBtnsubmit());
	}
 

	public void searchHotel(String location, String noofrooms, String checkindate, String checkoutdate, String adultperroom) {
		selectOptionByText(getdDnLocation(),location);
		selectOptionByText(getdDnroomno(), noofrooms);
		type(getTxtDatein(), checkindate);
	    type(getTxtDateout(), checkoutdate);
	    selectOptionByText(getTxtadultroom(), adultperroom);
	    click(getBtnsubmit());
		
	}
	
	public void searchHotel() {
		
		click(getBtnsubmit());
			
	}
	
			
}
