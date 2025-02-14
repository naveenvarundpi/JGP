package Assigments.week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/button.xhtml");
//		- Click on the button with the text ‘Click and Confirm title.’ 
		driver.findElement(By.xpath("//span[text()='Click']")).click();
//		- Verify that the title of the page is ‘dashboard.’ 
		String title = driver.getTitle();
		if(title.contains("Dashboard"))
		{
			System.out.println("Title of the page is "+title+" is verified" );
		}
//		- Check if the button with the text ‘Confirm if the button is disabled’ is disabled. 
		driver.navigate().back();
		boolean buttonenabled = driver.findElement(By.xpath("//h5[contains(text(),'disabled')]/../button")).isEnabled();
		System.out.println(buttonenabled);
		if(!buttonenabled)
		{
			System.out.println("Button is disabled");
		}
		else
		{
			System.out.println("Button is enabled");
		}
//		- Find and print the position of the button with the text ‘Submit.’ 
		List<WebElement> buttonelements = driver.findElements(By.xpath("//span[@class='ui-button-text ui-c']"));
		int i=0;
		for(WebElement element:buttonelements)
		{
			i++;
			if(element.getText().equals("Submit"))
			{
				System.out.println("Position of the button is :"+i);
				
			}
		}
//		- Find and print the background color of the button with the text ‘Find the Save button color.’ 
		String cssValue = driver.findElement(By.xpath("//span[text()='Save']/..")).getCssValue("background-color");
		System.out.println("Color of the button is: "+cssValue);
//		- Find and print the height and width of the button with the text ‘Find the height and width of this button.’ 
		int height = driver.findElement(By.xpath("//h5[contains(text(),'hei')]/../button")).getSize().height;
		int width = driver.findElement(By.xpath("//h5[contains(text(),'hei')]/../button")).getSize().width;
		System.out.println("Height of the button: "+height);
		System.out.println("Width of the button: "+width);
//		- Close the browser window.
		driver.close();

	}

}
