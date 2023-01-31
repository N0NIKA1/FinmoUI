package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.By.ById;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import utils.PageLoaders;




public class LoginPage extends baseClass.TestBaseClass {
	public utils.ExplictlyWait explictlyWait=new utils.ExplictlyWait();

	By txtUserName = By.name("email");
	By txtPassword = By.name("password");
	By btnLogin = By.xpath("//span[contains(text(),'Log in')]");
	
	
	
	/**
	 * This method used to launch the base url
	 */
	public void launchBaseURL(String url) throws Exception {
		try {
			extentTest.get().log(Status.INFO, "WebDriver session created and opened");
			getDriver().get(url);
			extentTest.get().log(Status.INFO, "Set: Asian Cloud's Url : " + url);
		} catch (Exception e) {
			e.getMessage();
			throw new Exception(e.getMessage());
		}
	}

	
	/**
	 *  this method is used to set username and password 
	 */
	public void setTxtUsernameAndPassword(String userName, String password) throws Exception {
		try {
			
			WebElement userNameTxt = getDriver().findElement(txtUserName);
			userNameTxt.sendKeys(userName);
			extentTest.get().log(Status.INFO, "Set username : " + userName);
			WebElement passwordTxt = getDriver().findElement(txtPassword);
			explictlyWait.visibilityOf(getDriver(), passwordTxt, Duration.ofSeconds(10));
			passwordTxt.sendKeys(password);
			extentTest.get().log(Status.INFO, "Set password: ****");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	/**
	 * This method will click login button
	 */
	public void clickLoginButton() throws Exception {
		try {
		
			WebElement loginBtn = getDriver().findElement(btnLogin);
			explictlyWait.visibilityOf(getDriver(), loginBtn, Duration.ofSeconds(10));
			utils.ExplictlyWait.elementToBeClickable(getDriver(), loginBtn);
			extentTest.get().log(Status.INFO, "Click : " + loginBtn.getText() + " button");
			
			loginBtn.click();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	/**
	 * This method take input parameter as user name and password,shadow root
	 * tags,and base url
	 * 
	 */
	public void login(String userName, String password, String url) throws Exception {
		try {
			launchBaseURL(url);
			PageLoaders.PageLoaderTimeOut(getDriver(), url, 5, 5);
			setTxtUsernameAndPassword(userName,password);
			clickLoginButton();
			extentTest.get().log(Status.INFO, "User logged IN");
			try {
//				WebElement userProfile = getDriver().findElement(dropdownUserName);
//				explictlyWait.visibilityOf(getDriver(), userProfile, 30);
				extentTest.get().log(Status.INFO, "Login is successful.");
			} catch (Exception e) {
				extentTest.get().log(Status.INFO, "Login failed. Try again or contact your administrator.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}


	/**
	 *  Assert Explore Page
	 * @throws Exception
	 */
	public String validateLoginPage() throws Exception {
		try {
			String pageTitle = getDriver().getTitle();
			extentTest.get().log(Status.INFO, "Finmo title is obtained");
			return pageTitle;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

	
	

}
