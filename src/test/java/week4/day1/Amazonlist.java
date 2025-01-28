package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/div/div/div/div/div/div/a/span/span/span"));
		List<Integer> price=new ArrayList<Integer>();
		for(int i=0;i<findElements.size();i++)
		{

			String text = findElements.get(i).getText();
			if(i%2!=0)
			{
				String replace = text.replace(",","");
				int parseInt = Integer.parseInt(replace);
				//		System.out.println(parseInt);
				price.add(parseInt);
			}
		}
		Collections.sort(price);
		System.out.println(price.get(0));
		System.out.println(price);
		Object[] array = price.toArray();
		Arrays.sort(array);
		System.out.println(array[0]);


	}

}
