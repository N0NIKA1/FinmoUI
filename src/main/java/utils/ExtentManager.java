package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager

{

	public static ExtentReports extent;
	public static ExtentReports createInstance(String fileName) {
		try {
			ExtentSparkReporter htmlReporter = new ExtentSparkReporter(
					System.getProperty("user.dir") + "\\Extent_Reports\\ExtentReport.html");
			htmlReporter.config().setEncoding("utf-8");
			htmlReporter.config().setDocumentTitle(fileName);
			htmlReporter.config().setReportName(fileName);
			htmlReporter.config().setTheme(Theme.STANDARD);

			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);

			extent.setSystemInfo("Project Name", "Finmo");
			extent.setSystemInfo("Browser", "Chrome");
			extent.setSystemInfo("Environment", "QA");
			extent.setSystemInfo("Test Engineer", "Nonika Sharma");

		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return extent;

	}

}