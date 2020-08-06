package com.amzn.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amzn.qa.base.TestBase;

public class OrdersPage extends TestBase{
@FindBy(xpath="//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']")
WebElement quantity;	
@FindBy(xpath="//input[@name='ctl00$MainContent$fmwOrder$txtUnitPrice']")
WebElement priceperunit;
@FindBy(xpath="//input[@name='ctl00$MainContent$fmwOrder$txtDiscount']")
WebElement discount;
@FindBy(xpath="//input[@name='ctl00$MainContent$fmwOrder$txtTotal']")
WebElement total;
@FindBy(xpath="//input[@type='submit']")
WebElement calculate;
@FindBy(xpath="//input[@name='ctl00$MainContent$fmwOrder$txtName']")
WebElement custumername;
@FindBy(xpath="//input[@name='ctl00$MainContent$fmwOrder$TextBox2']")
WebElement streetaddress;
@FindBy(xpath="//input[@name='ctl00$MainContent$fmwOrder$TextBox3']")
WebElement city;
@FindBy(xpath="//input[@name='ctl00$MainContent$fmwOrder$TextBox4']")
WebElement state;
@FindBy(xpath="//input[@name='ctl00$MainContent$fmwOrder$TextBox5']")
WebElement zip;
@FindBy(xpath="//input[@id='ctl00_MainContent_fmwOrder_cardList_1']")
WebElement cardtype;
@FindBy(xpath="//input[@name='ctl00$MainContent$fmwOrder$TextBox6']")
WebElement cardno;
@FindBy(xpath="//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")
WebElement eprddmm;
@FindBy(xpath="//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")
WebElement processbutton;


//initilization of Page Object
public OrdersPage(){
PageFactory.initElements(driver, this);

}

//Actions
public void createneworder(String title,String quan,String perunit,String custname,String str){
	Select select=new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
select.selectByValue(title);
quantity.sendKeys(quan);
priceperunit.sendKeys(perunit);
calculate.click();
custumername.sendKeys(custname);
streetaddress.sendKeys(str);

processbutton.click();

}

}
