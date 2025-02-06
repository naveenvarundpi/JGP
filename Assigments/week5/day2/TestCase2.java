package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase2 extends ProjectSpecificMethod {
@Test
public void createEntity() throws Exception
{
	driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities");
	driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
	//Click on the Dropdown icon in the legal Entities tab
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Legal Entities')]/ancestor::a/following-sibling::one-app-nav-bar-item-dropdown")).click();
	//Click on New Legal Entity
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.click(driver.findElement(By.xpath("//span[text()='New Legal Entity']/ancestor::span"))).perform();
	//Enter the Company name as'TestLeaf'.
	driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
	//Enter Description as 'Salesforces'.
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//label[text()='Description']/following::div)[1]/textarea")).sendKeys("Salesforces");
	//Select Status as 'Active'
	Thread.sleep(3000);
	act.moveToElement(driver.findElement(By.xpath("//label[text()='Status']/parent::div/div//div//button"))).click().build().perform();
	
	driver.findElement(By.xpath("//span[text()='Active']")).click();
	//Click on Save
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	//Verify the Alert message (Complete this field) displayed for Name
	String text = driver.findElement(By.xpath("//div[@class='fieldLevelErrors']/div/strong")).getText();
	System.out.println(text);
	
}
}
