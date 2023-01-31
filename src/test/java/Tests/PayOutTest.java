package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PayOutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().logs();
		driver.get("https://dashboard.qafinmo.net/login");
		
		driver.findElement(By.name("email")).sendKeys("nonikasharma1201@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Nonie@19");
		driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("checked")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Payout')][1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'All Payout')]")).click();
		driver.manage().logs();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	
		
	}

}
