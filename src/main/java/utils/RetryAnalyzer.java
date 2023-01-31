package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	private int retryCount = 1;
	private static final int maxRetryCount = 1;

	public boolean retry(ITestResult result) {

		try {
			if (retryCount < maxRetryCount) {
				retryCount++;
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
