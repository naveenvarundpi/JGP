package Assigments.week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/selenium/web/inputs.html");
		List<WebElement> elements = driver.findElements(By.xpath("//input[@name='radio_input']"));
		
		for(WebElement element:elements)
		{
			System.out.println(element.isSelected());
		}
	}

}
