package utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import baseClass.TestBaseClass;

public class StringOperation extends TestBaseClass {

	// This method will conver string data to integer
	public List<Integer> ConverStringToInteger(List<String> dataList) {
		try {
			List<Integer> listOfData = new ArrayList<Integer>();
			for (int i = 0; i < dataList.size(); i++) {
				listOfData.add(Integer.parseInt(dataList.get(i)));
			}
			return listOfData;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
