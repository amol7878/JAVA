package one;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WWPopupMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("confirmButton")).click();
//		Alert ss = driver.switchTo().alert();
//		ss.accept();
		
//		driver.findElement(By.id("promtButton")).click();
//		ss.sendKeys("AMo Shinde");
//		ss.accept();
//		Thread.sleep(2000);
//		System.out.println(ss.getText());
//		
		

	}

}
