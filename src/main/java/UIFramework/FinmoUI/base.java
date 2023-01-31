package UIFramework.FinmoUI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	
	public WebDriver driver;
	public Properties prop;
	
public WebDriver initializeDriver() throws IOException
{
	
	prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\Divyanshu\\Asian_Cloud_UI\\src\\main\\java\\Asian\\Asian_Cloud_UI\\data.properties");
	
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divyanshu\\Asian_Cloud_UI\\chromedriver.exe");		
		 driver = new ChromeDriver();
		//execute in chrome driver
	}
	else if(browserName == "firefox")
	{
		
	}
	else if(browserName == "IE")
	{
		
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
	
}

public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source =ts.getScreenshotAs(OutputType.FILE);
	String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
//	FileUtils.copyFile(source,new File(destinationFile));
	return destinationFile;


}
}
