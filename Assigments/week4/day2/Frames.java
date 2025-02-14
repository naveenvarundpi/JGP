package Assigments.week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args)
	{
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Load the URL (https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt)
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//Switch to the frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame);
		//Click the "Try It" button inside the frame
		driver.findElement(By.xpath("//button[contains(text(),'Try')]")).click();
		//- Click OK/Cancel in the alert that appears
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//Confirm the action is performed correctly by verifying the text displayed
		String text = driver.findElement(By.id("demo")).getText();
		if(text.equals("Hello Harry Potter! How are you today?"))
		{
			System.out.print("Alert has been handeled");
		}
		else
		{
			System.out.print("Alert has not been handeled");
		}

	}
}
