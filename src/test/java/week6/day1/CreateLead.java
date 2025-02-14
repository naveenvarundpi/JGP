package src.test.java.week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	
	
	@Test(dataProvider="getdata")
	public void runCreateLad(String cname,String fname,String lname) {

		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
		
	}
	@DataProvider
	public String[][] getdata()
	{
		String[][] data=new String[2][3];
		data[0][0]="TestLeaf";
		data[0][1]="Fname1";
		data[0][2]="Lname1";
		data[1][0]="TestLeaf";
		data[1][1]="Fname2";
		data[1][2]="Lname2";
		return data;
	}
	
}






