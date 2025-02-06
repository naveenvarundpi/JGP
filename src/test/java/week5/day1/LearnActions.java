package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		WebElement ele=driver.findElement(By.xpath(null));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
		

	}

}
