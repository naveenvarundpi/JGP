package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase1 extends ProjectSpecificMethod{
	@Test
	public void createEntity() throws InterruptedException
	{
			String uName="Naveen Kumar";	
			//Click View All and click Legal Entities from App Launcher
				driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities");
				driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
				//Click on the Dropdown icon in the legal Entities tab
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[contains(text(),'Legal Entities')]/ancestor::a/following-sibling::one-app-nav-bar-item-dropdown")).click();
				//Click on New Legal Entity
				Thread.sleep(3000);
				Actions act=new Actions(driver);
				act.click(driver.findElement(By.xpath("//span[text()='New Legal Entity']/ancestor::span"))).perform();
				//Enter Name as 'Salesforce Automation by *Your Name*'
				driver.findElement(By.xpath("//label[text()='Legal Entity Name']/parent::div/div/input")).sendKeys("Salesforce Automation by "+uName);
				//Click save and verify Legal Entity Name
				driver.findElement(By.xpath("//button[text()='Save']")).click();
				//Click save and verify Legal Entity Name
				String text = driver.findElement(By.xpath("//div[@role='alert']//div/div/div/div/span")).getText();
				System.out.println(text);
				if(text.contains(uName))
				{
					System.out.println("New Entity has been created");
				}
				else
				{
					System.out.println("New Entity has not been created");
				}
	}

}
