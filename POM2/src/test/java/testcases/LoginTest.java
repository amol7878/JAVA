package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Login;
import utilies.Utils;

public class LoginTest {

	WebDriver driver;
	Login loginA;
	Utils utilies;

	@BeforeMethod

	public void Setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		loginA = new Login(driver);
		utilies = new Utils(driver);
	}

	@Test

	public void VerifyLoginWithValidCredentials() {
		loginA.login("standard_user", "secret_sauce");
		boolean avail = utilies.validUrl("inventory");
		Assert.assertTrue(avail);
	}

	@Test
	public void VerifyLoginWithInValidCredentials() {
		loginA.login("standard", "secret_sauce");
		boolean avail = loginA.errorState();
		Assert.assertTrue(avail);
	}

	@AfterMethod

	public void tearDown() {
		driver.quit();
	}
}
