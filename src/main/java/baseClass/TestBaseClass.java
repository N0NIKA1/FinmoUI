package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

//import utils.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClass {
	public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();
	public static WebDriver driver;
	public static Properties properties;
	public static Properties objectreader;
	public static Properties objectreader1;
	public static Properties commonObjectReader;
	public static String setBrowserName = "";
	
	public static FileInputStream ip;
	public static FileInputStream commonIp;
	public ExtentTest test;
	public ExtentReports extent = utils.ExtentManager.createInstance("Extent_Reports");
	public static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	public static File reportDirectory;
	public static File folder = new File("Data Download");
	@BeforeSuite(alwaysRun=true)
	public void SetEnvironment() {
		objectreader = new Properties();
		objectreader1 = new Properties();
		commonObjectReader = new Properties();
		try {
			FileInputStream configProperty = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/configs/Configuration.properties");
		
			
			objectreader1.load(configProperty);
		
			String browserNameJenkins = System.getProperty("browser");

			if (browserNameJenkins != null && !browserNameJenkins.isEmpty()) {
				setBrowserName = browserNameJenkins;
			} else {
				setBrowserName = objectreader1.getProperty("browser");
			}
			System.out.println("Execution Browser " + setBrowserName);

			
			deleteFileAndFolder();
			createFolderForDownloadsFile();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
/*
 *This method will set the extentTest loggers 
 */
	public void setExtentTest(ExtentTest et) {
		extentTest.set(et);
	}
	/*
	 * This method will delete the Data Download Folder
	 */
	public void deleteFileAndFolder() {
		try {
			for (File file : folder.listFiles()) {

				file.delete();
			}
			try {
				folder.delete();
				System.out.println("Folder : " + folder + "  has been deleted successfully!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {

		}
	}
	/*
	 * This method will create the Data Download Folder
	 */
	public void createFolderForDownloadsFile() {
		try {
			folder.mkdir();
			System.out.println("Folder : " + folder + "  has been created successfully!");
		} catch (Exception e) {

		}
	}
/*
 * This method will initialize the browser driver
 */
	public WebDriver initializeDriver() throws Exception {
		 WebDriver driver = null;
		try {
			if (setBrowserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Divyanshu\\workspace\\FinmoUI\\Drivers\\chromedriver.exe");
						
				
		
				
				    ChromeOptions chromeOptions = new ChromeOptions();
				    //chromeOptions.setExperimentalOption("excludeSwitches",  Arrays.asList("disable-popup-blocking"));
					Map<String, Object> prefs = new HashMap<String, Object>();
					prefs.put("profile.default_content_settings.popups", 0);
					prefs.put("download.default_directory", folder.getAbsolutePath());
					chromeOptions.setExperimentalOption("prefs", prefs);
					
					HashMap<String, Object> chromeLocalStatePrefs = new HashMap<String, Object>();
					List<String> experimentalFlags = new ArrayList<String>();
					experimentalFlags.add("calculate-native-win-occlusion@2");
					chromeLocalStatePrefs.put("browser.enabled_labs_experiments", experimentalFlags);
					chromeOptions.setExperimentalOption("localState", chromeLocalStatePrefs); 
			  
				  
				   driver = new ChromeDriver();
			     
			} else if (setBrowserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if (setBrowserName.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver",
						System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
			else if (setBrowserName.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.edge.driver",
						System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			setWebDriver(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
	/*
	 * This method will capture the screenshot for Skipped/Failed Test
	 */
	public String getDestinationFile(WebDriver driver,String testCaseName) throws Exception {
		try {
			String destinationFile = System.getProperty("user.dir") + "\\Extent_Reports\\" + testCaseName + ".png";
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File(destinationFile);
			FileUtils.copyFile(SrcFile, DestFile);
			return testCaseName+".png";
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String getScreenShotPath(WebDriver driver, String testCaseName) throws Exception {
		try {
			if (testCaseName.length() > 150) {
				testCaseName = testCaseName.substring(0,145);
			}
			String destinationFile = getDestinationFile(driver,testCaseName + RandomStringUtils.randomNumeric(5));
			return destinationFile;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
/*
 * This method will return the WebDriver object
 */
	public static WebDriver getDriver() {

		return dr.get();

	}
/*
 * This method will set the driver
 */
	public void setWebDriver(WebDriver driver) {

		dr.set(driver);

	}
	
}
