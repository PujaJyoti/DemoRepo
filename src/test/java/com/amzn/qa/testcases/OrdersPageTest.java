
package com.amzn.qa.testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amzn.qa.base.TestBase;
import com.amzn.qa.pages.HomePage;
import com.amzn.qa.pages.LoginPage;
import com.amzn.qa.pages.OrdersPage;
import com.amzn.qa.util.TestUtil;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Sheet;

public class OrdersPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	OrdersPage orderspage;
	String sheetname="Orders";
    TestUtil testutil;
	public OrdersPageTest(){
		super();//to call test base class constructor 
	}
	@BeforeMethod
	public void setup(){
		initialization();
		//Create object of LoginPage Class
		testutil=new TestUtil();
		 loginpage=new LoginPage();
		 homepage=loginpage.login(p.getProperty("username"),p.getProperty("password"));
		 orderspage=homepage.ordersbuttonLink();	
		 }
	@DataProvider
	public Object[][] getwebTestData() throws InvalidFormatException{
Object data[][]=	TestUtil.getTestData(sheetname);
	return data;
	}
	@Test(dataProvider="getwebTestData")
	public void createneworderTest(String title,String quan,String perunit,String custname,String str){
		//orderspage.createneworder("MyMoney", "1", "1", "puja", "patna");
		orderspage.createneworder(title,quan,perunit,custname,str);
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}
