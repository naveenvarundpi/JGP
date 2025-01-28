package week4.day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException
	{
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Load the URL (http://leaftaps.com/opentaps/control/login)
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Enter the username and password.
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on the Login button.	
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on the CRM/SFA link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//Click on the Contacts button.
		driver.findElement(By.linkText("Contacts")).click();
		//Click on Merge Contacts.
		driver.findElement(By.linkText("Merge Contacts")).click();
		//Click on the widget of the "From Contact".
		driver.findElement(By.xpath("//span[text()='From Contact']/parent::td/following-sibling::td/a")).click();
		//Click on the first resulting contact.
		Set<String> windows = driver.getWindowHandles();
		String mainWindow=null;
		String childWindow=null;
		for(String window:windows)
		{
			driver.switchTo().window(window);
			String title = driver.getTitle();
			if(title.equals("Find Contacts"))
			{
				childWindow=window;
			}
			else if(title.equals("Merge Contacts | opentaps CRM"))
			{
				mainWindow=window;
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')])[1]")).click();
		//Click on the widget of the "To Contact"
		driver.switchTo().window(mainWindow);
		driver.findElement(By.xpath("//span[text()='To Contact']/parent::td/following-sibling::td/a")).click();
		//Click on the second resulting contact.
		windows.clear();
		windows=driver.getWindowHandles();
		
		for(String window:windows)
		{
			driver.switchTo().window(window);
			String title = driver.getTitle();
			if(title.equals("Find Contacts"))
			{
				childWindow=window;
			}
			else if(title.equals("Merge Contacts | opentaps CRM"))
			{
				mainWindow=window;
			}
		}
		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')])[2]")).click();
		// Click on the Merge button.
		driver.switchTo().window(mainWindow);
		driver.findElement(By.linkText("Merge")).click();
		//Accept the alert.
		driver.switchTo().alert().accept();
		//Verify the title of the page
		String title = driver.getTitle();
		if(title.equals("View Contact | opentaps CRM"))
		{
			System.out.println("Contacts has been Merged");
		}
		else
		{
			System.out.println("Contacts has not been Merged");
		}



	}
}
