package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		//- Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();
		//-Click "Find leads." 
		driver.findElement(By.linkText("Find Leads")).click();
		//- Click on the "Phone" tab. 
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//- Enter the phone number. 
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("23418992");
		//- Click the "Find leads" button. 
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//- Capture the lead ID of the first resulting lead. 
		Thread.sleep(5000);
		WebElement firstleadelement = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String firstleadid = firstleadelement.getText();
		//- Click the first resulting lead. 
		firstleadelement.click();
		//- Click the "Delete" button.
		driver.findElement(By.linkText("Delete")).click();
		//- Click "Find leads" again. 
		driver.findElement(By.linkText("Find Leads")).click();
		//- Enter the captured lead ID. 
		driver.findElement(By.xpath("//label[text()='Lead ID:']/../div/input")).sendKeys(firstleadid);
		//- Click the "Find leads" button. 
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//- Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion. 
		String actualmessage = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		String expexctedMessage="No records to display";
		if(actualmessage.equals(expexctedMessage))
		{
			System.out.println("Lead "+firstleadid+" has been successfully deleted");
		}
		else
		{
			System.out.println("Lead "+firstleadid+" has not been successfully deleted");
		}
		//- Close the browser.
		driver.close();
	}

}
