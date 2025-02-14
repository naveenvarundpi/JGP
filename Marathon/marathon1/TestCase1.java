package Marathon.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//1. Launch Chrome
		//2. Load https://www.amazon.in/ add implicitlyWait driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		// 3. Type  * "Bags for boys" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		// 4. Choose the item in the result (bags for boys)
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]")).click();
		// 5. Print the total number of results (like 50000) example like this-----> 1-48 of over 50,000 results for "bags for boys"
		String text = driver.findElement(By.xpath("//div[contains(@class,'sg-col-inner')]/h2")).getText();
		System.out.println(text);
		//6. Select the  first 2 brands in the left menu (like American Tourister, Generic)
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Brands']/../../ul/span/span/li/span/a/div/label/i)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Brands']/../../ul/span/span/li/span/a/div/label/i)[2]")).click();
		//7. Choose  New Arrivals (Sort)
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
		Select sel=new Select(dropdown);
		sel.selectByIndex(4);
		//8. Print the first resulting bag info (name, discounted  price)
		String baginfo = driver.findElement(By.xpath("(//div[contains(@class,'a-section a-spacing-base')])[1]//a/h2/span")).getText();
		System.out.println("First bag info: "+baginfo);
		//9. Get the page title and close the browser(driver.close())
		String title = driver.getTitle();
		System.out.println("Title of the page: "+title);
		driver.close();
	}

}
