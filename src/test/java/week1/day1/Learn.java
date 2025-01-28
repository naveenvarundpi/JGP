package week1.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=127;
		b=b++;
		++b;
		System.out.println(b);
		b=127;
		b=(byte)(b+1);
		System.out.println(b);
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Select sday=new Select(driver.findElement(By.id("day")));
		List<WebElement> options = sday.getOptions();
		sday.selectByIndex(options.size()-1);
		
	}

}
