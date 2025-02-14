package Assigments.week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		//enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click "CRM/SFA link "
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//click  accounts
		driver.findElement(By.linkText("Accounts")).click();
		//Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		//Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys("TestLeaf2025");
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		//Enter a Number Of Employees.
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		//Enter a Site Name as “LeafTaps”
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		//Verify that the Title is displayed correctly.
		String actualtitle = driver.getTitle();
		String expectedTitle="Account Details | opentaps CRM";
		if(actualtitle.contains(expectedTitle))
		{
			System.out.println("Account created successfully");
		}
		driver.close();
	}

}
