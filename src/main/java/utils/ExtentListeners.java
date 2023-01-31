package utils;

import java.util.Arrays;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import baseClass.TestBaseClass;

public class ExtentListeners extends TestBaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {

		try {
			ExtentTest test = extent
			.createTest(result.getMethod().getDescription());
			extentTest.set(test);
			extentTest.get().log(Status.INFO,result.getTestClass().getName() + " @TestCase : " + result.getMethod().getMethodName());
			extentTest.get().assignCategory(result.getMethod().getRealClass().getSimpleName());
			System.out.println("|STARTED|::"+result.getMethod().getDescription()+ " @TestCase : " + result.getMethod().getMethodName());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void onTestSuccess(ITestResult result) {

		try {
			String methodName = result.getMethod().getMethodName();
			String logText = "<b>" + "TEST CASE:- " + methodName.toUpperCase() + " PASSED" + "</b>";
			Markup mark = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			extentTest.get().pass(mark);
			System.out.println("|PASSED|::" + result.getMethod().getDescription() + " @TestCase : "
					+ result.getMethod().getMethodName());
			if (dr.get() != null) {
				dr.get().quit();
			}
			dr.remove();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult result) {
		try {
			String excepionMessage = result.getThrowable().toString();
			String excepionMessage1 = Arrays.toString(result.getThrowable().getStackTrace());
			extentTest.get()
					.fail("<details>" + "<summary>" + "<b>" + "<font color=" + "red>" + "Exception Occured:Click to see"
							+ "</font>" + "</b >" + "</summary>" + excepionMessage + "\n"
							+ excepionMessage1.replaceAll(",", "<br>") + "</details>" + " \n");
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {

			if (dr.get() != null) {

				try {
					extentTest.get().fail(
							"<b>" + "<font color=" + "red>" + "Screenshot of failure" + "</font>" + "</b>",
							MediaEntityBuilder
									.createScreenCaptureFromPath(
											".\\" + getScreenShotPath(dr.get(), result.getMethod().getMethodName()))
									.build());
				} catch (Exception e) {

					extentTest.get().log(Status.INFO, "Failed : Page is not loaded successfully");
					extentTest.get().log(Status.INFO, "Failed : Capture Screenshot");
				}
				System.out.println("|FAILED|::" + result.getMethod().getDescription() + " @TestCase : "
						+ result.getMethod().getMethodName());
				if (dr.get() != null) {
					dr.get().quit();
				}
				dr.remove();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String failureLogg = "TEST CASE FAILED";
			Markup mark = MarkupHelper.createLabel(failureLogg, ExtentColor.RED);
			extentTest.get().log(Status.FAIL, mark);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		Markup mark = null;
		try {
			String excepionMessage=result.getThrowable().toString();
			String excepionMessage1 = Arrays.toString(result.getThrowable().getStackTrace());
			extentTest.get()
					.skip("<details>" + "<summary>" + "<b>" + "<font color=" + "red>" + "Exception Occured:Click to see"
							+ "</font>" + "</b >" + "</summary>" +excepionMessage+"\n"+ excepionMessage1.replaceAll(",", "<br>") + "</details>"
							+ " \n");		
			String methodName = result.getMethod().getMethodName();
			String logText = "<b>" + "Test Case:- " + methodName + " Skipped" + "</b>";
			mark = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {
			if (dr.get() != null) {
				try {
					extentTest.get()
							.skip("<b>" + "<font color=" + "red>" + "Screenshot of failure" + "</font>" + "</b>",
									MediaEntityBuilder
											.createScreenCaptureFromPath(
													".\\"+ getScreenShotPath(dr.get(), result.getMethod().getMethodName()))
													.build());
				} catch (Exception e) {
					extentTest.get().log(Status.INFO, "Failed : Page is not loaded successfully");
					extentTest.get().log(Status.INFO, "Failed : Capture Screenshot");
				}
				System.out.println("|SKIPPED|::"+result.getMethod().getDescription()+ " @TestCase : " + result.getMethod().getMethodName());
				if(dr.get()!=null) {
					dr.get().quit();	
				}
				dr.remove();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		extentTest.get().skip(mark);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

		if (extent != null) {
			extent.flush();
		}
	}
}