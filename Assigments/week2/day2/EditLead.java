package Assigments.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		//- Enter a username and password. 
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//- Click the "Login" button. 
		driver.findElement(By.className("decorativeSubmit")).click();
		//- Click on the "CRM/SFA" link.
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//- Click on the Leads Button. 
		driver.findElement(By.linkText("Leads")).click();
		//- Click on Create Lead.
		driver.findElement(By.linkText("Create Lead")).click();
		//- Enter the CompanyName Field Using Xpath. 
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testpore");
		//- Enter the FirstName Field Using Xpath. 
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("TestFirstname2025");
		//- Enter the LastName Field Using Xpath. 
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("TestLastname2025");
		//- Enter the FirstName (Local) Field Using Xpath. 
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("TestLocalName2025");
		//- Enter the Department Field Using any Locator of Your Choice. 
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testdepartname");
		//- Enter the Description Field Using any Locator of your choice. 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("2025 descrption");
		//- Enter your email in the E-mail address Field using the locator of your choice.
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@test.com");
		//- Select State/Province as NewYork Using Visible Text. 
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sstate=new Select(state);
		sstate.selectByVisibleText("New York");
		//- Click on the Create Button. 
		driver.findElement(By.className("smallSubmit")).click();
		//- Click on the edit button. 
		driver.findElement(By.linkText("Edit")).click();
		//- Clear the Description Field. 
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//- Fill the Important Note Field with Any text. 
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Lead edited");
		//- Click on the update button. 
		driver.findElement(By.className("smallSubmit")).click();
		//- Get the Title of the Resulting Page.
		System.out.println("Tile of the page: "+driver.getTitle());
		//- Close the browser window.
		driver.quit();
	}

}
