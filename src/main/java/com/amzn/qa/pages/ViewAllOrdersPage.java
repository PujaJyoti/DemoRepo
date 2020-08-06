package com.amzn.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amzn.qa.base.TestBase;

public class ViewAllOrdersPage extends TestBase {

	@FindBy(xpath="//*[@id='aspnetForm']/table/tbody/tr/td[2]/div[2]/h2")
	WebElement listofallorderslabel;
	
	@FindBy(xpath="//a[contains(text(),'Check All')]")
	WebElement checkbox;
	
	//initilization of Page Object
	public ViewAllOrdersPage(){
	PageFactory.initElements(driver, this);

	}
	//Actions
	public boolean verifyviewpagelabel(){
		return listofallorderslabel.isDisplayed();
	}
	public void  clickoncheckbox(){
		checkbox.click();
	}
}
