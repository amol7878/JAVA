package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class W1Actionclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
	driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);
		
		Actions act= new Actions(driver);
		
		WebElement rightClick=driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightClick).perform();
		Thread.sleep(2000);
		
//		WebElement doubleClick= driver.findElement(By.id("doubleClickBtn"));
//		act.doubleClick(doubleClick).perform();
//		Thread.sleep(2000);
		

		
		

	}

}
