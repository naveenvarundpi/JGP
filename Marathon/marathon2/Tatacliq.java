package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tatacliq {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//1. Load the url as https://www.tatacliq.com/
		driver.get("https://www.tatacliq.com/");
		//2. MouseHover on 'Brands'
		Actions act=new Actions(driver);
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		act.moveToElement(brands).perform();
		//3. MouseHover on 'Watches & Accessories'
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Watches & Accessories']"))).perform();
		//4. Choose the first option from the 'Featured brands'.
		driver.findElement(By.xpath("//div[text()='Featured brands']/following-sibling::div")).click();
		//5. Select sortby: New Arrivals
		WebElement sort = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		Select sel=new Select(sort);
		sel.selectByValue("isProductNew");
		//6. choose men from catagories filter.
		driver.findElement(By.xpath("//div[text()='Men']")).click();
		//7. print all price of watches
		Thread.sleep(2000);
		List<WebElement> watchprice = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		System.out.println("Prices of listed watches");
		
		for(WebElement element:watchprice)
		{
			System.out.println(element.getText().replaceAll("[^0-9]",""));
		}
		//8. click on the first resulting watch.
		Thread.sleep(5000);
		String firstproductprice=driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder']")).getText();
		String searchpageprice = firstproductprice.replaceAll("[^0-9]","");
		System.out.println(searchpageprice);
		act.click(driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder']"))).perform();
		
		//9. Handle Alert Pop Up
		Set<String> windowHandles = driver.getWindowHandles();
		String mainWindow=null;
		String productWindow=null;
		for(String wh:windowHandles)
		{
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			if(title.contains("Buy Watches For Men At Best Prices Online In India"))
			{
				mainWindow=wh;
			}
			else
			{
				productWindow=wh;
			}
		}
		//10. compare two price are similar
		String text = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();
		String productpageprice = text.replaceAll("[^0-9]","");
		if(productpageprice.equals(searchpageprice))
		{
			System.out.println("Price are similar");
		}
		else
		{
			System.out.println("Price are not similar");
		}
		//11. click Add to cart and get count from the cart icon.
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		String count = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("number of products added in cart: "+count);
		//11. Click on the cart
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		//12. Take a snap of the resulting page.
		Thread.sleep(3000);
		TakesScreenshot st=(TakesScreenshot)driver;
		File source=st.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//Screenshot//Tatacliq.png");
		FileUtils.copyFile(source, dest);
		//13. Close All the opened windows one by one.
		driver.close();
		driver.switchTo().window(mainWindow);
		driver.close();
		/*



		 * 
		 * 
		 * */
		
		
	}

}
