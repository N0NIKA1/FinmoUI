package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import com.aventstack.extentreports.Status;

import baseClass.TestBaseClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTimeOperation extends TestBaseClass {

	/*
	 * This method will return system date in MMM dd, yyyy pattern
	 */
	public String getSystemdate() throws Exception {
		try {
			DateFormat dateFormat1 = new SimpleDateFormat("MMM dd, yyyy");
			Date date = new Date();
			String dateText = dateFormat1.format(date);
			extentTest.get().log(Status.INFO, "get system month,date and year" + dateText);
			return dateText;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/*
	 * This method will return system date in yyyy-MM-dd pattern
	 */
	public String getSystemDateInYYYYMMDDFormat(String dateText) throws Exception {
		try {
			String format = null;
			if (dateText.trim() != "") {
				Date date1 = new SimpleDateFormat("MMM dd, YYYY HH:MM aa").parse(dateText);
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				format = formatter.format(date1);
				extentTest.get().log(Status.INFO, "get system year month and date" + format);
			}
			return format;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	/*
	 * This method will return system date in yyyy-MM-dd pattern
	 */
	public String getSystemDateInYYYYMMDDHHMMFormat(String dateText) throws Exception {
		try {
			String format = null;
			if (dateText.trim() != "") {
				Date date1 = new SimpleDateFormat("MMM dd, YYYY HH:MM aa").parse(dateText);
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd kk");
				format = formatter.format(date1);
				extentTest.get().log(Status.INFO, "get system year month and date" + format);
			}
			return format;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	
	/*This method is used to get the date in the format of MMMdd
	 * 
	 */
	public String getSystemDateInTheFormatOfMMMdd() throws Exception
	{
		try
		{
			DateFormat dateFormatter = new SimpleDateFormat("MMM dd");
			Date date = new Date();
			String dateValue = dateFormatter.format(date);
			System.out.println(dateValue);
			extentTest.get().log(Status.INFO, "get system::"+dateValue+"::month,date");
			return dateValue;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	
	/*
	 * This method will return Current Date
	 */
	public int getSystemCurrentDate() throws Exception {
		try {
			DateFormat dateFormat1 = new SimpleDateFormat("dd");
			Date date = new Date();
			String date1 = dateFormat1.format(date);
			int Systemdate = Integer.parseInt(date1);
			extentTest.get().log(Status.INFO, "get current date" + date1);
			return Systemdate;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/*
	 * This method will return Current year
	 */
	public String getSystemCurrentYear() throws Exception {
		try {
			DateFormat dateFormat = new SimpleDateFormat("yyyy");
			Date date = new Date();
			String year = dateFormat.format(date);
			extentTest.get().log(Status.INFO, "get current year" + year);
			return year;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/*
	 * This method will return Current month
	 */
	public String getSystemCurrentMonth() throws Exception {
		try {
			DateFormat dateFormat = new SimpleDateFormat("MMM");
			Date date = new Date();
			String month = dateFormat.format(date);
			extentTest.get().log(Status.INFO, "get current month" + month);
			return month;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/*
	 * This method will return Current time
	 */
	public String getSystemTime() throws Exception {
		try {
			LocalTime localTime = LocalTime.now();
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
			String systemTime = localTime.format(dateTimeFormatter);
			return systemTime;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	/*
	 * This method will return System Date And Time In yyyy MM dd HH mm ssFormat
	 */
	public String getSystemDateAndTimeInyyyyMMddHHmmssFormat() throws Exception {
		try {
			Calendar cal = Calendar.getInstance();
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        String strDate = sdf.format(cal.getTime());
	        
	        SimpleDateFormat sdf1 = new SimpleDateFormat();
	        sdf1.applyPattern("yyyy-MM-dd HH:mm:ss");
	        Date date = sdf1.parse(strDate);
	        String currentDateTime=sdf1.format(date);
	        return  currentDateTime;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	public String getUIDateAndTimeAndConvertItIntoStringDateAndTime(String dateAndTime) throws Exception
	{
		try
		{
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date=dateFormat.parse(dateAndTime);
			String datetime=dateFormat.format(date);
			System.out.println(datetime);
			extentTest.get().log(Status.INFO, "get ui date and time" + datetime);
			return datetime;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
}



