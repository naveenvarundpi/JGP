package Assigments.week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
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
		//- Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();
		//- Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();
		//- Enter a FirstName.
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TestLeaf2025");
		//- Enter a LastName. 
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gemini");
		//- Enter a CompanyName.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//- Enter a Title .
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");
		//- Click the "Create Lead" button.
		driver.findElement(By.className("smallSubmit")).click();
		//- Verify that the Title is displayed correctly.
		String actualtitle = driver.getTitle();
		String expectedTitle="View Lead | opentaps CRM";
		if(actualtitle.contains(expectedTitle))
		{
			System.out.println("Account created successfully");
		}
		//- Close the browser window.
	//	driver.close();
	}

}
