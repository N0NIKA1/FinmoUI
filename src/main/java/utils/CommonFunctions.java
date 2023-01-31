package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import baseClass.TestBaseClass;

public class CommonFunctions extends TestBaseClass {
	
	
	public ExplictlyWait explictlyWait=new ExplictlyWait();	
	public utils.PageLoaders PageLoaders=new utils.PageLoaders();
	
	By linkProfileDropdownMenu = By.cssSelector(".fa.fa-bars");
	By Menu=By.cssSelector(".fa.fa-bars");
	By Operations= By.xpath("(//span[contains(text(),'Operations Management')])[1]");
	By HSEDashboard= By.cssSelector("a[href='/OperationManagement/HSEDashboard']");
	By reports= By.xpath("//span[contains(text(),'Reports')][1]");
	By DGR= By.cssSelector("a[href='/Reports/DistributedDGRReports']");
	By materialMngmnt= By.xpath("//span[contains(text(),'Material Management')][1]");
	By customReports = By.cssSelector("a[href='/Reports/CustomReports']");
	By menuIcon = By.id("div[id= 'hide-bar']");
	By portfolio= By.xpath("//span[contains(text(),'Dashboard')]");
	
	public void navigateToHSEDashboardTab()
	{
		try
		{
			
			WebElement BtnProfileDropdown = getDriver().findElement(linkProfileDropdownMenu);
			extentTest.get().log(Status.INFO, "Finding the Profile menu dropdown link from dashboard page");
			ExplictlyWait.visibilityOf(getDriver(), BtnProfileDropdown, Duration.ofSeconds(5));
			ExplictlyWait.elementToBeClickable(getDriver(), BtnProfileDropdown);
			BtnProfileDropdown.click();
			extentTest.get().log(Status.INFO, "Click on the ProfileDropDown Menu");
			
			WebElement TXtOperationsTab = getDriver().findElement(Operations);
			ExplictlyWait.visibilityOf(getDriver(), TXtOperationsTab, Duration.ofSeconds(5));
			ExplictlyWait.elementToBeClickable(getDriver(), TXtOperationsTab);
			TXtOperationsTab.click();
			extentTest.get().log(Status.INFO, "Click : " + TXtOperationsTab.getText() + " button");
			
			WebElement TXtHSEDashboardTab = getDriver().findElement(HSEDashboard);
			extentTest.get().log(Status.INFO, "Clicked on HSE Tab.");
			ExplictlyWait.visibilityOf(getDriver(), TXtHSEDashboardTab, Duration.ofSeconds(5));
			ExplictlyWait.elementToBeClickable(getDriver(), TXtHSEDashboardTab);	
			TXtHSEDashboardTab.click();
			extentTest.get().log(Status.INFO, "Click : " + TXtHSEDashboardTab.getText() + " button");
		}
		catch(Exception e)
		{
		
			e.printStackTrace();
			
		}
	}
	
	public void navigateToReportsTab()
	{
		try
		{
			
			WebElement BtnProfileDropdown = getDriver().findElement(linkProfileDropdownMenu);
			extentTest.get().log(Status.INFO, "Finding the Profile menu dropdown link from dashboard page");
			ExplictlyWait.visibilityOf(getDriver(), BtnProfileDropdown, Duration.ofSeconds(5));
			ExplictlyWait.elementToBeClickable(getDriver(), BtnProfileDropdown);
			BtnProfileDropdown.click();
			extentTest.get().log(Status.INFO, "Click on the ProfileDropDown Menu");
			
			WebElement TXtReportsTab = getDriver().findElement(reports);
			ExplictlyWait.visibilityOf(getDriver(), TXtReportsTab, Duration.ofSeconds(5));
			ExplictlyWait.elementToBeClickable(getDriver(), TXtReportsTab);
			TXtReportsTab.click();
			extentTest.get().log(Status.INFO, "Click : " + TXtReportsTab.getText() + " button");
			
			WebElement TXtDGRTab = getDriver().findElement(DGR);
			extentTest.get().log(Status.INFO, "Clicked on HSE Tab.");
			ExplictlyWait.visibilityOf(getDriver(), TXtDGRTab, Duration.ofSeconds(5));
			ExplictlyWait.elementToBeClickable(getDriver(), TXtDGRTab);	
			TXtDGRTab.click();
			extentTest.get().log(Status.INFO, "Click : " + TXtDGRTab.getText() + " button");
		}
		catch(Exception e)
		{
		
			e.printStackTrace();
			
		}
	}
	
	
	public void navigateToMaintenanceAnalyticsTab()
	{
		try
		{
			
			WebElement BtnProfileDropdown = getDriver().findElement(linkProfileDropdownMenu);
			extentTest.get().log(Status.INFO, "Finding the Profile menu dropdown link from dashboard page");
			ExplictlyWait.visibilityOf(getDriver(), BtnProfileDropdown, Duration.ofSeconds(5));
			ExplictlyWait.elementToBeClickable(getDriver(), BtnProfileDropdown);
			BtnProfileDropdown.click();
			extentTest.get().log(Status.INFO, "Click on the ProfileDropDown Menu");
			
			WebElement TXtReportsTab = getDriver().findElement(reports);
			ExplictlyWait.visibilityOf(getDriver(), TXtReportsTab, Duration.ofSeconds(5));
			ExplictlyWait.elementToBeClickable(getDriver(), TXtReportsTab);
			TXtReportsTab.click();
			extentTest.get().log(Status.INFO, "Click : " + TXtReportsTab.getText() + " button");
			
			WebElement TXtCustomTab = getDriver().findElement(customReports);
			extentTest.get().log(Status.INFO, "Clicked on customreport.");
			ExplictlyWait.visibilityOf(getDriver(), TXtCustomTab, Duration.ofSeconds(5));
			ExplictlyWait.elementToBeClickable(getDriver(), TXtCustomTab);	
			TXtCustomTab.click();
			extentTest.get().log(Status.INFO, "Click : " + TXtCustomTab.getText() + " button");
		}
		catch(Exception e)
		{
		
			e.printStackTrace();
			
		}
	}
	
	
	public void navigateToMaterialMangmntTab()
	{
		try
		{
			
			WebElement BtnProfileDropdown = getDriver().findElement(linkProfileDropdownMenu);
			extentTest.get().log(Status.INFO, "Finding the Profile menu dropdown link from dashboard page");
			ExplictlyWait.visibilityOf(getDriver(), BtnProfileDropdown, Duration.ofSeconds(5));
			ExplictlyWait.elementToBeClickable(getDriver(), BtnProfileDropdown);
			BtnProfileDropdown.click();
			extentTest.get().log(Status.INFO, "Click on the ProfileDropDown Menu");
			
			WebElement TXtMatrlmsngmntTab = getDriver().findElement(materialMngmnt);
			ExplictlyWait.visibilityOf(getDriver(), TXtMatrlmsngmntTab, Duration.ofSeconds(5));
			ExplictlyWait.elementToBeClickable(getDriver(), TXtMatrlmsngmntTab);
			TXtMatrlmsngmntTab.click();
			extentTest.get().log(Status.INFO, "Click : " + TXtMatrlmsngmntTab.getText() + " button");
			
//			WebElement TXtDGRTab = getDriver().findElement(DGR);
//			extentTest.get().log(Status.INFO, "Clicked on HSE Tab.");
//			ExplictlyWait.visibilityOf(getDriver(), TXtDGRTab, 5);
//			ExplictlyWait.elementToBeClickable(getDriver(), TXtDGRTab);	
//			TXtDGRTab.click();
//			extentTest.get().log(Status.INFO, "Click : " + TXtDGRTab.getText() + " button");
		}
		catch(Exception e)
		{
		
			e.printStackTrace();
			
		}
	}
	
	
	public void navigateToPortfolioTab()
	{
		try
		{
			
			WebElement BtnProfileDropdown = getDriver().findElement(linkProfileDropdownMenu);
			extentTest.get().log(Status.INFO, "Finding the Profile menu dropdown link from dashboard page");
			ExplictlyWait.visibilityOf(getDriver(), BtnProfileDropdown, Duration.ofSeconds(5));
			ExplictlyWait.elementToBeClickable(getDriver(), BtnProfileDropdown);
			BtnProfileDropdown.click();
			extentTest.get().log(Status.INFO, "Click on the ProfileDropDown Menu");
			
			WebElement TXtPortfolioTab = getDriver().findElement(portfolio);
			ExplictlyWait.visibilityOf(getDriver(), TXtPortfolioTab, Duration.ofSeconds(5));
			ExplictlyWait.elementToBeClickable(getDriver(), TXtPortfolioTab);
			TXtPortfolioTab.click();
			extentTest.get().log(Status.INFO, "Click : " + TXtPortfolioTab.getText() + " button");
			
			WebElement TXtDGRTab = getDriver().findElement(DGR);
			extentTest.get().log(Status.INFO, "Clicked on HSE Tab.");
			ExplictlyWait.visibilityOf(getDriver(), TXtDGRTab, Duration.ofSeconds(5));
			ExplictlyWait.elementToBeClickable(getDriver(), TXtDGRTab);	
			TXtDGRTab.click();
			extentTest.get().log(Status.INFO, "Click : " + TXtDGRTab.getText() + " button");
		}
		catch(Exception e)
		{
		
			e.printStackTrace();
			
		}
	}

}
