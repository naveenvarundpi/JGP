package Assigments.week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioHomeAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		//In the search box, type as "bags" and press enter
		driver.findElement(By.className("react-autosuggest__input")).sendKeys("bags");
		driver.findElement(By.className("react-autosuggest__input")).sendKeys(Keys.ENTER);
		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		//- Under "Category" click "Fashion Bags"
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/parent::div/label")).click();
		//Print the count of the items found.
		Thread.sleep(2000);
		String countofitems = driver.findElement(By.xpath("//div[@class=' filter-container']//div//strong")).getText();
		System.out.println("No of items found: "+countofitems);
		//- Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brandsElement = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		System.out.println("Brands of Bag:");
		for(WebElement element:brandsElement )
		{
			String brand = element.getText();
			System.out.println(brand);
		}
		//Get the list of names of the bags and print it
		List<WebElement> bagNamesElement = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("Names of Bag:");
		for(WebElement element:bagNamesElement )
		{
			String bagName = element.getText();
			System.out.println(bagName);
		}
		

	}

}
