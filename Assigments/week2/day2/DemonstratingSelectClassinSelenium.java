package Assigments.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemonstratingSelectClassinSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		//- Click on the Create new account button.
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();	
		//- Enter the First name. 
		driver.findElement(By.name("firstname")).sendKeys("TestLeaf2025");
		//- Enter the Surname.
		driver.findElement(By.name("lastname")).sendKeys("Gemini");
		//- Enter the Mobile number or email address. 
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/../input")).sendKeys("1234567899");
		//- Enter the New password. 
		driver.findElement(By.id("password_step_input")).sendKeys("123WErTG");
		//- Handle all three dropdowns in Date of birth
		WebElement dobday = driver.findElement(By.id("day"));
		Select sday=new Select(dobday);
		sday.selectByIndex(8);
		
		WebElement dobmonth = driver.findElement(By.id("month"));
		Select smonth=new Select(dobmonth);
		smonth.selectByValue("9");
		
		WebElement dobyear = driver.findElement(By.id("year"));
		Select syear=new Select(dobyear);
		syear.selectByVisibleText("1984");
		//- Select the radio button in Gender.
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		//close the browser
		driver.close();
	}

}
