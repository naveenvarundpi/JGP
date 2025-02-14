package src.test.java.practise;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FileDownload {
	@Test
	public void filedownload() throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options =new ChromeOptions();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory","D:\\Test Leaf\\2025 Workspace\\selenium\\Downloads" );
		options.setExperimentalOption("prefs", prefs);
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("downloadButton")).click();
		Thread.sleep(3000);
        String filePath = "D:\\Test Leaf\\2025 Workspace\\selenium\\Downloads\\download.xlsx"; // Replace with your expected file name
        File downloadedFile = new File(filePath);
        boolean exists = downloadedFile.exists();
        System.out.println(exists);
        downloadedFile.delete();
        driver.close();		
	}

}
