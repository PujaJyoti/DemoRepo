package com.amzn.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amzn.qa.base.TestBase;

public class HomePage extends TestBase {
@FindBy(xpath="//div[@class='login_info']")
WebElement loginusername;
@FindBy(xpath="//a[contains(text(),'View all orders')]")
WebElement viewallordersbutton;
@FindBy(xpath="//a[contains(text(),'View all products')]")
WebElement viewallproductsbutton;
@FindBy(xpath="//a[contains(text(),'Order')]")
WebElement ordersbutton;

//initilization of Page Object
public HomePage(){
PageFactory.initElements(driver, this);

}
//Actions
public String verifyHomePageTitle(){
	return driver.getTitle();
}
public boolean validateloginname(){
	return loginusername.isDisplayed();
}
public ViewAllOrdersPage viewallorderLink(){
	viewallordersbutton.click();
	return new ViewAllOrdersPage();
}
public ProductsPage viewallproductLink(){
	viewallproductsbutton.click();
	return new ProductsPage();
}
public OrdersPage ordersbuttonLink(){
	ordersbutton.click();
	return new OrdersPage();
}



}
