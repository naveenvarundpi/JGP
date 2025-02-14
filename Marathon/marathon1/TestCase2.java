package Marathon.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//1. Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//2. Load the Url "https://www.pvrcinemas.com/"
		driver.get("https://www.pvrcinemas.com/");
		//3. Choose Your location as "Chennai" (sometimes it will be located automatically)
		//driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		//4. Click on Cinema under Quick Book
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		//5. Select Your Cinema
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
		//6. Select Your Date as Tomorrow
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[2]")).click();
		//7. Select Your Movie
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[3]")).click();
		//8. Select Your Show Time
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
		//9. Click on Book Button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'quick-lefts')]/button")).click();
		//10. Click Accept on Term and Condition
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//11. Click any one available seat
		driver.findElement(By.id("SL.SILVER|E:15")).click();
		//12. Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//13. Print the Seat info under book summary
		Thread.sleep(1000);
		String movieSummary = driver.findElement(By.xpath("//div[@class='summary-movies-content']")).getText();
		System.out.println("Movie Summary:");
		System.out.println(movieSummary);
		//14. Print the grand total under book summary
		String grandTotal = driver.findElement(By.xpath("//h6[text()='Grand Total']/following::h6/span")).getText();
		System.out.println("Grand total: "+grandTotal);
		//15. Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//16. Close the popup
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[contains(@class,'pi pi-times')])[2]")).click();
		//17. Print Your Current Page title
		String title = driver.getTitle();
		System.out.println("Title of the Page: "+title);
		//18. Close Browser
		driver.close();

	}

}
