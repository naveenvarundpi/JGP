package Assigments.week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClasses {
	public ChromeDriver driver;
	
	@BeforeMethod
	@Parameters({"uname","pword"})
	public void preConditions(String uname,String pword) throws InterruptedException {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		//Login to https://login.salesforce.com
		driver.get("https://login.salesforce.com");
		//Enter Username, password and click login button.
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pword);
		driver.findElement(By.id("Login")).click();
		//Click on the toggle menu button from the left corner
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//Click View All and click Legal Entities from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities");
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		//Click on the Dropdown icon in the legal Entities tab
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Legal Entities')]/ancestor::a/following-sibling::one-app-nav-bar-item-dropdown")).click();
	}
	
	@AfterMethod
	public void precondition()
	{
		driver.close();
	}

}
