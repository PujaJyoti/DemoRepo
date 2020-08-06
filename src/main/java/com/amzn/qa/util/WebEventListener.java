package com.amzn.qa.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.amzn.qa.base.TestBase;

public class WebEventListener extends TestBase implements WebDriverEventListener {

	public void afterAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("After alert accept");
		
	}

	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("After alert Dismiss");
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		System.out.println("checking");
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Click on " + element);
	}

	public void afterFindBy(By xpath, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Find By" +xpath +element );
		
	}

	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Navigate Back" );
	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Naviagte Forward");
	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Navigate Refresh");
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Naviagte to" +url);
	}

	public void afterScript(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After script" +url);
	}

	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before alert accept");
	}

	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("alert dismiss ");
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] abc) {
		// TODO Auto-generated method stub
		System.out.println("before change values " +element);
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("befor click on " + element);
	}

	public void beforeFindBy(By xpath, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Dind by action " + xpath  +element ) ;
	}

	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before navigate to back ");
	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Befor click on navigate to forward action");
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Navigate referesh action  ");
		
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Navigate to url" + url);
		
	}

	public void beforeScript(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before script url is" + url);
	}

	public void onException(Throwable e, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Provides exception" + e);
		try {
			takesScreenshotAtEndOfTest();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private void takesScreenshotAtEndOfTest() throws IOException {
		// TODO Auto-generated method stub
		 File sshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
	      FileHandler.copy(sshot, new File("/Users/pujakumari/Documents/workspace/AmazonTest/sceenshots/sc.png"));
	}

}
