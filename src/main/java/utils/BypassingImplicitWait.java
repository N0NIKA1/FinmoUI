package utils;

import java.util.concurrent.TimeUnit;

import baseClass.TestBaseClass;

public class BypassingImplicitWait extends TestBaseClass{
	
	/*
	* This method temporally turn off implicitly wait
	*/
	public static void turnOFFImplicitWaits() throws Exception {



	try {
	getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	//extentTest.get().log(Status.INFO, "|OFF| :: Implicitly Wait");
	} catch (Exception e) {

	e.printStackTrace();
	throw new Exception(e.getMessage());
	}



	}



	/*
	* This method temporally turn on implicitly wait
	*/
	public static void turnONImplicitWaits() throws Exception {



	try {
	getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	//extentTest.get().log(Status.INFO, "|ON| :: Implicitly Wait");
	} catch (Exception e) {

	e.printStackTrace();
	throw new Exception(e.getMessage());
	}



	}
	/*
	* This method will set temporally time for implicitly wait
	*/
	public static void setImplicitWaitTime(int timeOut) throws Exception {



	try {
	getDriver().manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
	} catch (Exception e) {

	e.printStackTrace();
	throw new Exception(e.getMessage());
	}



	}



}
