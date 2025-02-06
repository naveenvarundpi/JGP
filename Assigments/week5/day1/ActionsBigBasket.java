package week5.day1;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsBigBasket {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Navigate to https://www.bigbasket.com/.
		driver.get("https://www.bigbasket.com");
		//2. Click on "Shop by Category".
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		//3. Mouse over "Foodgrains, Oil & Masala".
		Thread.sleep(3000);
		WebElement foodGrains = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(foodGrains).perform();
		//4. Mouse over "Rice & Rice Products".
		WebElement rice = driver.findElement(By.linkText("Rice & Rice Products"));
		act.moveToElement(rice).perform();
		//5. Click on "Boiled & Steam Rice".
		driver.findElement(By.linkText("Boiled & Steam Rice")).click();
		//6. Filter the results by selecting the brand "bb Royal".
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("BB Royal");
		driver.findElement(By.xpath("//label[text()='BB Royal']/preceding-sibling::input")).click();
		
		
		//7. Click on "Tamil Ponni Boiled Rice".
		Thread.sleep(3000);
		WebElement ponnirice = driver.findElement(By.xpath("//h3[contains(text(),'Tamil Ponni Boiled Rice')]"));
		act.scrollToElement(ponnirice).perform();;
		
		ponnirice = driver.findElement(By.xpath("//h3[contains(text(),'Tamil Ponni Boiled Rice')]"));
		ponnirice.click();
		Set<String> windowHandles = driver.getWindowHandles();
		String mainWindow=null;
		String childWindow=null;
		for(String s:windowHandles)
		{
			driver.switchTo().window(s);
			String title = driver.getTitle();
			//System.out.println(title);
			if(title.contains("Buy Boiled Steam Rice Online at the Best Price"))
			{
				mainWindow=s;
			}
			else
			{
				childWindow=s;
			}
		}
		//System.out.println(mainWindow);
		//System.out.println(childWindow);
		//8. Select the 5 Kg bag.
		WebElement kg = driver.findElement(By.xpath("//span[text()='5 kg']"));
		act.moveToElement(kg).click(kg).build().perform();
		//9. Check and note the price of the rice.
		String text = driver.findElement(By.xpath("//table/tr[2]/td")).getText();
		String replaceAll = text.replaceAll("[^0-9]","");
		System.out.println("Price is: "+ replaceAll);
		//10. Click "Add" to add the bag to your cart.
		
		WebElement addToCard = driver.findElement(By.xpath("//button[text()='Add to basket']"));
		act.moveToElement(addToCard).click(addToCard).build().perform();
		//11. Verify the success message that confirms the item was added to your cart.
		Thread.sleep(3000);
		String successMessage = driver.findElement(By.xpath("//div[@class='self-center']/following::p")).getText();
		//System.out.println(successMessage);
		if(successMessage.equals("An item has been added to your basket successfully"))
		{
			System.out.println("Product has been successfully added");
		}
		else
		{
			System.out.println("Product has not been successfully added");
		}
		//12. Take a snapshot of the current page
		TakesScreenshot st=(TakesScreenshot)driver;
		File src=st.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//Screenshot//BigBasket.png");
		FileUtils.copyFile(src,dest);
				
		//13. Close the current window.
		driver.close();
		//14. Close the main window
		//String windowHandle = driver.getWindowHandle();
		driver.switchTo().window(mainWindow);
		driver.close();
	}

}
