/*
 * Author By Puja Kumari
 * 
 */
package com.amzn.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amzn.qa.base.TestBase;
import com.amzn.qa.pages.HomePage;
import com.amzn.qa.pages.LoginPage;
import com.amzn.qa.pages.OrdersPage;
import com.amzn.qa.pages.ProductsPage;
import com.amzn.qa.pages.ViewAllOrdersPage;

import junit.framework.Assert;

public class HomePageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	ViewAllOrdersPage viewallorderpage;
	ProductsPage productspage;
	OrdersPage orderspage;
	
	public HomePageTest(){
		super();//to call test base class constructor 
	}
	@BeforeMethod
	public void setup(){
		initialization();
		//Create object of LoginPage Class
		loginpage=new LoginPage();
        homepage=loginpage.login(p.getProperty("username"),p.getProperty("password"));
		}
	@Test(priority=1)
	public void titleTest(){
		String hometitle=homepage.verifyHomePageTitle();
		Assert.assertEquals(hometitle, "Web Orders");
		
	}
	@Test(priority=2)
	public void homeuserloginnameTest(){
		boolean flag=homepage.validateloginname();
		Assert.assertTrue(flag);	
	}
	@Test(priority=3)
	public void viewallorderTest(){
		viewallorderpage=homepage.viewallorderLink();
	}
	@Test(priority=4)
	public void productsTest(){
		productspage=homepage.viewallproductLink();	
	}
	@Test(priority=5)
	public void ordersTest(){
		orderspage=homepage.ordersbuttonLink();	
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
}
