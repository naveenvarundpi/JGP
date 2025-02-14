package Assigments.week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Launch (https://www.snapdeal.com/)
		driver.get("https://www.snapdeal.com/");
		//2. Go to "Men's Fashion".
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Men')]"))).perform();
		//3. Go to "Sports Shoes".
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		//4. Get the count of sports shoes.
		String count = driver.findElement(By.xpath("//span[contains(@class,'category-count')]")).getText().replaceAll("[^0-9]","");
		System.out.println("Number of Sports shoes for men: "+count);
		//5. Click on "Training Shoes".
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		//6. Sort the products by "Low to High".
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		act.click(driver.findElement(By.xpath("(//li[@data-index='1'])[2]"))).perform();
		//7. Check if the displayed items are sorted correctly.
		Thread.sleep(2000);
		List<Integer> pricel=new ArrayList<Integer>();
		List<Integer> pricen=new ArrayList<Integer>();
		List<WebElement> findElements = driver.findElements(By.xpath("//span[contains(@id,'display-price')]"));
		for(WebElement element:findElements)
		{
			//System.out.println(element.getText());
			String price = element.getText().replaceAll("[^0-9]","");
			pricel.add(Integer.parseInt(price));
		}
		pricen.addAll(pricel);
		Collections.sort(pricen);
		boolean flag=false; 
		for(int i=0;i<pricel.size();i++)
		{
			if(pricel.get(i)==pricen.get(i))
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
		}
		if(flag)
		{
			System.out.println("Prices are sorted");
		}
		else
		{
			System.out.println("Prices are not sorted");
		}
		//8. Select any price range ex:(500-700).
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("500");
		
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("700");
		driver.findElement(By.xpath("//div[normalize-space(text())='GO']")).click();
		//9. Filter by any colour.
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space(text())='White & Blue']/ancestor::label")).click();
		//10. Verify all the applied filters.
		List<WebElement> fileter = driver.findElements(By.xpath("//a[@class='clear-filter-pill']"));
		for(WebElement ele:fileter)
		{
			System.out.println(ele.getText());
		}
		//11. Mouse hover on the first resulting "Training Shoes".
		Thread.sleep(3000);

		act.moveToElement(driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]"))).perform();
		//12. Click the "Quick View" button.
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		//13. Print the cost and the discount percentage.
		Thread.sleep(2000);
		String shoeprice = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Price of the first shoe: "+shoeprice);
		String discountPercentage = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Discount of the first shoe: "+discountPercentage);
		//14. Take a snapshot of the shoes.
		TakesScreenshot st=(TakesScreenshot)driver;
		File src = st.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//Screenshot//SnapDeal.png");
		FileUtils.copyFile(src, dest);
		//15. Close the current window.
		driver.findElement(By.xpath("//div[contains(@class,'close')]")).click();
		//16. Close the main window.
		driver.close();
		
	}

}
