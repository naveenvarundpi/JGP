package practise;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class FileUpload {
	
	  static ExtentSparkReporter extentSparkReporter;
	   static ExtentReports extentReports;
	   ExtentTest extentTest;
	   
	@BeforeClass
	public static void startTest()
	{
		extentSparkReporter  = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/extentReport.html");
	       extentReports = new ExtentReports();
	       extentReports.attachReporter(extentSparkReporter);


	       //configuration items to change the look and feel
	       //add content, manage tests etc
	       extentSparkReporter.config().setDocumentTitle("Simple Automation Report");
	       extentSparkReporter.config().setReportName("Test Report");
	       extentSparkReporter.config().setTheme(Theme.STANDARD);
	       extentSparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");	
	
	}

	@Test
	public void fu () throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.id("pickfiles")).click();
		Thread.sleep(5000);
		Robot rb = new Robot();
		StringSelection str = new StringSelection("D:\\Test Leaf\\2025 Workspace\\selenium\\Downloads\\download.pdf");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	    rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
		
	}
	 @AfterMethod
	   public void getResult(ITestResult result) {
	       if(result.getStatus() == ITestResult.FAILURE) {
	           extentTest.log(Status.FAIL,result.getThrowable());
	       }
	       else if(result.getStatus() == ITestResult.SUCCESS) {
	           extentTest.log(Status.PASS, "FileUpload");
	       }
	       else {
	           extentTest.log(Status.SKIP, result.getTestName());
	       }
	   }

	 @AfterTest
	   public void tearDown() {
	       //to write or update test information to the reporter
	       extentReports.flush();
	   }
}
