package one;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WwTakeScrenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
//		Thread.sleep(2000);
//		TakesScreenshot ss = (TakesScreenshot) driver;
//
//		File source = ss.getScreenshotAs(OutputType.FILE);
//
//		File Folder = new File("C:\\Users\\AMOL\\Desktop\\New folder\\Facebook.png");
//		FileUtils.copyFile(source, Folder);
//		driver.close();
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\AMOL\\\\Desktop\\\\chromedriver\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File Folder = new File("C:\\Users\\AMOL\\Desktop\\New folder\\Facebook1.png");
		FileUtils.copyFile(source,Folder);
		driver.close();
		

	}

}
