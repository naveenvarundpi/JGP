package Assigments.week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableYahoo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Load the url - https://finance.yahoo.com/
			driver.get("https://finance.yahoo.com/");
			Thread.sleep(5000);
			//- Click on �Crypto� tab
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.stop();");
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//span[text()='More']"))).perform();
			act.click(driver.findElement(By.xpath("(//a[text()='Crypto '])[3]"))).perform();
			//- Locate the table in the dom page
			//- Locate the cryptocurrency names in the table using specific row and column.
			List<WebElement> currencynamelist = driver.findElements(By.xpath("//tbody/tr/td[2]/span/div"));
			List<String> currencyName=new ArrayList<String>();
			//- Use loop to iterate the cryptocurrency names
			for(WebElement ele:currencynamelist)
			{
				currencyName.add
				(ele.getText());
			}
			//- Print the cryptocurrency names
			for(String name:currencyName)
			{
				System.out.println(name);
			}

	}

}
