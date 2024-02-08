package testNG3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day2C {
	WebDriver driver;

	@BeforeMethod
	public void Login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.saucedemo.com/");
	}

	@Test

	public void ValidLoginSuccess() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		boolean avail = driver.getCurrentUrl().contains("inventory");
		Assert.assertTrue(avail);
		driver.close();
	}

	@Test

	public void ValidLoginFailuser() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret");
		driver.findElement(By.id("login-button")).click();
		boolean avail = driver.findElement(By.cssSelector("svg")).isDisplayed();
		Assert.assertTrue(avail);

	}

	@AfterMethod

	public void BrowserClose() {
		driver.close();
	}

}
