package week2.day2;

import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/radio.xhtml");
		//- Select 'Your most favourite browser' from the radio buttons
		driver.findElement(By.xpath("(//label[text()='Safari'])[1]")).click();
		// - Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’. 

		/*
		 * WebElement radiounselect =
		 * driver.findElement(By.xpath("//label[text()='Bengaluru']/../div")); boolean
		 * selected = radiounselect.isSelected();
		 * System.out.println("Radio button selected status "+selected);
		 * radiounselect.click(); boolean selected1 =
		 * driver.findElement(By.xpath("//label[text()='Bengaluru']/../div")).isSelected
		 * (); System.out.println("Radio button selected status "+selected1);
		 */
		
		
		// System.out.println(domAttribute);
		
		driver.findElement(By.xpath("//label[text()='Bengaluru']/../div")).click();
		@Nullable
		String domAttribute = driver.findElement(By.xpath("(//label[text()='Bengaluru']/../div/div)[2]")).getDomAttribute("class");
		//System.out.println(domAttribute);
		if(domAttribute.contains("active")) {
			System.out.println("Button is selected");
		}
		else
		{
			System.out.println("Button is not selected");
		}
		driver.findElement(By.xpath("//label[text()='Bengaluru']/../div")).click();
		if(domAttribute.contains("active")) {
			System.out.println("Button is selected");
		}
		else
		{
			System.out.println("Button is not selected");
		}
		//- Identify the radio button that is initially selected by default.
		List<WebElement> defaultradioelement = driver.findElements(By.xpath("//h5[contains(text(),'Find')]/../div/div/table/tbody/tr/td/div/div/input"));
		int i=0;
		for(WebElement element:defaultradioelement)
		{
			//System.out.println(element.isSelected());
			i++;
			if(element.isSelected())
			{
				String xpath="(//h5[contains(text(),'Find')]/../div/div/table/tbody/tr/td/label)["+i+"]";
				String defaultradiobutton = driver.findElement(By.xpath(xpath)).getText();
				System.out.println("Default radio button selected: "+defaultradiobutton);
				break;
			}
		}
		// - Check and select the age group (21-40 Years) if not already selected.
		WebElement agegroup = driver.findElement(By.xpath("//label[text()='21-40 Years']/../div/div/input"));
		//System.out.println(agegroup.isSelected());
		if(!agegroup.isSelected())
		{
			agegroup.click();
		}

	}

}
