package Assigments.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		//- Click on the "Basic Checkbox.” 
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//- Click on the "Notification Checkbox."
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		//- Verify that the expected message is displayed.
		String message=driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		if(message.contains("Checked"))
		{
			System.out.println("Notification checkbox has been successfully selected");
		}
		//driver.findElement(By.xpath("//div[@class='ui-growl-icon-close ui-icon ui-icon-closethick']")).click();
		//- Click on your favorite language (assuming it's related to checkboxes). 
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		Thread.sleep(10000);
		//- Click on the "Tri-State Checkbox."//
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/../div/div/div")).click();
		//- Verify which tri-state option has been chosen. 
		String tristatecheckbox = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		if(tristatecheckbox.contains("State has been changed."))
		{
			System.out.println("Tristate checkbox has been successfully selected");
		}
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//div[@class='ui-growl-icon-close ui-icon ui-icon-closethick']")).click();
		//- Click on the "Toggle Switch."
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		//- Verify that the expected message is displayed.
		String Tmessage=driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		if(Tmessage.contains("Checked"))
		{
			System.out.println("Toggle switch has been successfully selected");
		}
		//driver.findElement(By.xpath("//div[@class='ui-growl-icon-close ui-icon ui-icon-closethick']")).click();
		//- Verify if the Checkbox is disabled. 
		boolean enabled = driver.findElement(By.xpath("//h5[text()='Verify if check box is disabled']/../div/div/div")).isEnabled();
		if(enabled)
		{
			System.out.println("Check box is disabled");
		}	
		//- Select multiple options on the page (details may be needed).
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		//- Perform any additional actions or verifications required."
		
		// - Close the web browser when done.
	}

}
