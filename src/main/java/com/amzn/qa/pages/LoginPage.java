package com.amzn.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amzn.qa.base.TestBase;

public class LoginPage extends TestBase {
//Object Repository --Page Factory
	@FindBy(xpath="//input[@name='ctl00$MainContent$username']")
	WebElement username;
	@FindBy(xpath="//input[@name='ctl00$MainContent$password']")
	WebElement continuebutton;
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbutton;
	@FindBy(xpath="//label[@for='ctl00_MainContent_username']")
	WebElement usernamelable;
	@FindBy(xpath="//label[@for='ctl00_MainContent_password']")
	WebElement passwordlabel;
	
	
	//	initilization of Page Object
public LoginPage(){
	PageFactory.initElements(driver, this);
	
}
//Actions
public String validateloginpagetitle(){
	return driver.getTitle();
}
public boolean validateusernamelabel(){
	return usernamelable.isDisplayed();
}
public boolean validatepasswordlabel(){
	return passwordlabel.isDisplayed();
}
public HomePage login(String un ,String pwd){
	username.sendKeys(un);
	password.sendKeys(pwd);
	loginbutton.click();
	return new HomePage();
}
/*public HomePage login(){
	username.sendKeys(p.getProperty("username"));
	password.sendKeys(p.getProperty("password"));
	loginbutton.click();
	return new HomePage();
}
*/
}
