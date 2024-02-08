package testcae2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages2.Logine;

public class Login2Test {
	WebDriver driver;
	Logine LoginA;

	@BeforeMethod

	public void Setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		LoginA = new Logine(driver);
	}

	@Test
	public void verifyLoginWithValidCredential() {
		LoginA.login("standard_user","secret_sauce");
		boolean avail = LoginA.textt("inventory");
		Assert.assertTrue(avail);
	}

	@Test

	public void verifyWithInvalidCredential() {
		LoginA.login("sta", "secret_sauce");
		boolean avail = LoginA.errorState();
		Assert.assertTrue(avail);
	}

	@AfterMethod

	public void tearDown() {
		//driver.quit();
	}
}
