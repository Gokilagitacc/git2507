package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass{
	
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id= "radiobutton_0")
	private WebElement btnClick;
	
    @FindBy(id= "continue")
    private WebElement btnContinue;
    
    @FindBy(xpath="//td[text()='Book A Hotel ']")
    private WebElement txtBookHotel;
    
    @FindBy(id="radiobutton_span")
    private WebElement txtSelectHotel;
    
    
	public WebElement getTxtBookHotel() {
		return txtBookHotel;
	}


	public WebElement getTxtSelectHotel() {
		return txtSelectHotel;
	}


	public WebElement getBtnClick() {
		return btnClick;
	}

	
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
		public void selectHotel() {
	
		click(getBtnClick());
		click(getBtnContinue());

	}

	public void selectContinue() {

		click(getBtnContinue());

	}
	
	

}
