package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelect {

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
		//- Click on the "Accounts" tab. 
		driver.findElement(By.linkText("Accounts")).click();
		//- Click on the "Create Account" button. 
		driver.findElement(By.linkText("Create Account")).click();
		//- Enter an account name. 
		String accountname="TestLeaf2025_new1";
		driver.findElement(By.id("accountName")).sendKeys(accountname);
		//- Enter a description as "Selenium Automation Tester." 
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		//- Select "ComputerSoftware" as the industry. 
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select sindustry=new Select(industry);
		sindustry.selectByValue("IND_SOFTWARE");
		//- Select "S-Corporation" as ownership using SelectByVisibleText. 
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select sownership=new Select(ownership);
		sownership.selectByVisibleText("S-Corporation");
		//- Select "Employee" as the source using SelectByValue. 
		WebElement sourceId = driver.findElement(By.name("dataSourceId"));
		Select ssourceId=new Select(sourceId);
		ssourceId.selectByValue("LEAD_EMPLOYEE");
		//- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		WebElement marketingcampaign = driver.findElement(By.name("marketingCampaignId"));
		Select smarketingcampaign=new Select(marketingcampaign);
		smarketingcampaign.selectByIndex(5);
		//- Select "Texas" as the state/province using SelectByValue. 
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sstate=new Select(state);
		sstate.selectByValue("TX");
		//- Click the "Create Account" button. 
		driver.findElement(By.className("smallSubmit")).click();
		//- Verify that the account name is displayed correctly. 
		String actualaccountname = driver.findElement(By.xpath("//span[text()='Account Name']/../following-sibling::td/span")).getText();
		if(actualaccountname.contains(accountname))
		{
			System.out.println("Accountname is displayed correctly");
		}
		//- Close the browser window.

	}

}
