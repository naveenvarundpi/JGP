package src.test.java.week6.day2;

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
	public String[][] getdata() throws Exception
	{
		LearnExcel ex=new LearnExcel();
		String path="/Data/TestData.xlsx";
		String[][] excelData = ex.excelData(path);
		return excelData;
	}
	
}






