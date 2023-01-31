package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import baseClass.TestBaseClass;

public class PageLoaders extends TestBaseClass{
	
	/*
	* This method is would be reuse for creating the different loaders.
	*
	*/
	public void PageLoaderTimeOut(WebDriver driver, By url, Duration defaultImplicitWait,
	Duration loaderExplicitWait) throws Exception {
	try {
	BypassingImplicitWait.turnOFFImplicitWaits();
	try {
	ExplictlyWait.presenceOfElementLocated(driver, url, defaultImplicitWait);
	} catch (Exception ex) {
	BypassingImplicitWait.turnONImplicitWaits();
	extentTest.get().log(Status.INFO, "loader not found");
	return;
	}
	try {
	ExplictlyWait.stalenessOfOfElement(driver, driver.findElement(url), loaderExplicitWait);
	extentTest.get().log(Status.INFO, "loader found");
	} catch (Exception e1) {
	BypassingImplicitWait.turnONImplicitWaits();
	return;
	}



	} catch (Exception e) {
	//e.printStackTrace();
	}

	}

	public static void PageLoaderTimeOut(WebDriver driver, String url, int defaultImplicitWait,
			int loaderExplicitWait) {
		// TODO Auto-generated method stub
		
	}





}
