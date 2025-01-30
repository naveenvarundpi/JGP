package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//1. Launch ServiceNow application
		driver.get("https://dev190529.service-now.com/");
		//2. Login with valid credentials username as admin and password
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("zH+*gR56jQiD");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		//3. Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
		Shadow sh=new Shadow(driver);
		sh.setImplicitWait(3);
		sh.findElementByXPath("//div[text()='All']").click();
		sh.findElementByXPath("//input[@id='filter']").sendKeys("Service Catalog");
		//sh.findElementByXPath("//label[contains(text(),'Enter search term to filter All menu')]/parent::div/label").sendKeys(Keys.ENTER);
		sh.findElementByXPath("//input[@id='filter']").sendKeys(Keys.ENTER);
		//4. Click on  mobiles
		WebElement findElementByXPath = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(findElementByXPath);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		//5. Select Apple iphone13pro
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		//6. Choose yes option in lost or broken iPhone
		driver.findElement(By.xpath("(//label[@class='radio-label'])[1]")).click();
		//7. Enter phonenumber as 99 in original phonenumber field
		driver.findElement(By.xpath("(//span[text()='What was the original phone number?']//ancestor::label/../following::div/input)[2]")).sendKeys("99");
		//8. Select Unlimited from the dropdown in Monthly data allowance
		WebElement findElement = driver.findElement(By.xpath("//select[contains(@class,'form-control cat_item_option')]"));
		Select sel=new Select(findElement);
		sel.selectByValue("unlimited");
		//9. Update color field to SierraBlue and storage field to 512GB
		driver.findElement(By.xpath("//label[contains(text(),'Sierra Blue')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'512')]")).click();
		//10. Click on Order now option
		driver.findElement(By.xpath("//button[contains(text(),'Order Now')]")).click();
		//11. Verify order is placed and copy the request number
		Thread.sleep(4000);
		if(driver.getTitle().contains("Order Status"))
		{
			System.out.println("Order has been successfully placed");
			String requestNumber = driver.findElement(By.xpath("//a[@id='requesturl']/b")).getText();
			System.out.println("Request number: "+requestNumber);
		}
		//12.Take a Snapshot of order placed page	
		Thread.sleep(3000);
		TakesScreenshot st=(TakesScreenshot)driver;
		File source=st.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//Screenshot//ServiceNow.png");
		
		FileUtils.copyFile(source, dest);
		driver.quit();
	}

}
