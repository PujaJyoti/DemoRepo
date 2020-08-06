package com.amzn.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amzn.qa.base.TestBase;
import com.amzn.qa.pages.HomePage;
import com.amzn.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest(){
		super();//to call test base class constructor 
	}
	
	@BeforeMethod
public void setup(){
	initialization();
	//Create object of LoginPage Class
	 loginpage=new LoginPage();
	
}
	@Test(priority=1)
	public void loginPageTitleTest(){
	String title=loginpage.validateloginpagetitle();
	Assert.assertEquals(title, "Web Orders Login");
	}
	@Test(priority=2)
	public void loginPageUsernamelabelTest(){
		boolean flag=loginpage.validateusernamelabel();
		Assert.assertTrue(flag);
			}
	@Test(priority=3)
	public void loginPagePasswordlabelTest(){
		boolean flag=loginpage.validatepasswordlabel();
		Assert.assertTrue(flag);
			}
	@Test(priority=4)
	public void loginPageLogin(){
	homepage=loginpage.login(p.getProperty("username"),p.getProperty("password"));
	
	}
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}
