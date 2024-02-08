package testNG3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day5b {
	
	// Passing the parameter via xml File
	
	WebDriver driver;
	@Parameters({"username","password"})
	@Test()
	public void login(String un,String pwd) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#login-button")).click();
		Assert.assertTrue( driver.getCurrentUrl().contains("inventory"));
		
	}
	
	

}
