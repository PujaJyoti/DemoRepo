package com.amzn.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amzn.qa.base.TestBase;
import com.amzn.qa.pages.HomePage;
import com.amzn.qa.pages.LoginPage;
import com.amzn.qa.pages.ViewAllOrdersPage;

import junit.framework.Assert;

public class ViewAllOrdersPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	ViewAllOrdersPage viewallorderpage;
	public ViewAllOrdersPageTest(){
		super();//to call test base class constructor 
	}
	@BeforeMethod
public void setup(){
	initialization();
	//Create object of LoginPage Class
	 loginpage=new LoginPage();
	 homepage=loginpage.login(p.getProperty("username"),p.getProperty("password"));
	 viewallorderpage=homepage.viewallorderLink();
	 }
	@Test(priority=1)
	public void labelTest(){
		boolean flag=viewallorderpage.verifyviewpagelabel();
		Assert.assertTrue(flag);	
	}
	@Test(priority=2)
	public void checkboxTest(){
		viewallorderpage.clickoncheckbox();
	}
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}
