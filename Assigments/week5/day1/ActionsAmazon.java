package Assigments.week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazon {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Load the URL (https://www.amazon.in/)
		driver.get("https://www.amazon.in/");
		//2. Search for "oneplus 9 pro".
		Actions act=new Actions(driver);
		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
		act.sendKeys(findElement,"oneplus 10 pro").sendKeys(findElement,Keys.ENTER).build().perform();
		//3. Get the price of the first product.
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText().replaceAll("[^0-9]","");
		System.out.println("Price of the phone: "+price);
		int pr=Integer.parseInt(price);
		//4. Print the number of customer ratings for the first displayed product.
		String ratings = driver.findElement(By.xpath("(//div[@data-cy='reviews-block'])[1]//a/span")).getText();
		System.out.println("number of custiner ratings: "+ratings);
		//5. Click the first text link of the first image.
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		String parentWindow=null;
		String childWindow=null;
		for(String str:windowHandles)
		{
			driver.switchTo().window(str);
			if(driver.getTitle().equals("Amazon.in : oneplus 10 pro"))
			{
				parentWindow=str;
			}
			else
			{
				childWindow=str;
			}
		}
		//6. Take a screenshot of the product displayed.
		act.moveToElement(driver.findElement(By.id("imgTagWrapperId"))).perform();
		TakesScreenshot st=(TakesScreenshot)driver;
		File src=st.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//Screenshot//Amazon.png");
		FileUtils.copyFile(src,dest);
		//7. Click the 'Add to Cart' button.
		Thread.sleep(2000);
		WebElement addToCart = driver.findElement(By.xpath("(//span[text()='Add to Cart'])[2]"));
		act.moveToElement(addToCart).click().build().perform();
		
		//8. Get the cart subtotal and verify if it is correct.
		Thread.sleep(5000);
		String text = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		//System.out.println(text);
		String replaceAll = text.replaceAll("[^0-9]","");
		int num=(Integer.parseInt(replaceAll))/100;
		if(num==pr)
		{
			System.out.println("The price are same");
		}
		else
		{
			System.out.println("The price are not same");
		}
		//9. Close the browser.
		driver.quit();
/*




 * */
		
	}

}
