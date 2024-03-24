package one;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.Text;

public class WWActionclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		WebElement TextBox=driver.findElement(By.id("userName"));
		TextBox.sendKeys("Amol Shinde");
		Thread.sleep(2000);
		
		TextBox.clear();
		
		Thread.sleep(2000);
		Actions act =new Actions(driver);
		WebElement Tex=driver.findElement(By.id("userName"));
		act.keyDown(Keys.SHIFT).build().perform();
		Tex.sendKeys("c");
		Thread.sleep(2000);
		
		act.keyUp(Keys.SHIFT).build().perform();
		Tex.sendKeys("Amol");
		
		Thread.sleep(2000);
		
		act.keyDown(Keys.SHIFT).build().perform();
		Tex.sendKeys("Shinde");
		
		Thread.sleep(2000);
		
		
	
		
		
		
	

	}

}
