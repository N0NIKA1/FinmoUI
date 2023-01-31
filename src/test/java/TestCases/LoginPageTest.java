package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import pageObjects.LoginPage;
import utils.CommonFunctions;
import utils.ExtentListeners;
import utils.RetryAnalyzer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.TestBaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ExtentListeners.class)

public class LoginPageTest extends TestBaseClass {

	public  WebDriver driverInstance ;
	public LoginPage loginPage;
	public CommonFunctions commonFunctions;
	

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "Verify user is able to navigate to Finmo web app", groups = {
			"Smoke","Sanity", "Regression" }, enabled = true)
	public void TC01VerifyUserIsAbleToNavigateToFinmoAndLogin() throws Exception {
		try {
			
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();	
//			driverInstance = initializeDriver();
			extentTest.get().log(Status.INFO, "WebDriver session created and opened");
			loginPage = new LoginPage();
			loginPage.login(objectreader1.getProperty("username"),objectreader1.getProperty("password"),
					objectreader1.getProperty("url"));
			loginPage.validateLoginPage();
				
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

}
