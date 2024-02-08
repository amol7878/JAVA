package testNG3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day1 {
	@Test

	public void validateTitle() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		String actualTitle = driver.getTitle();
		String expectedtitle = "WebDriverUniversity.com";
		Assert.assertEquals(actualTitle, expectedtitle);
		driver.close();
	}

	@Test
	public void validateCurrentUrl() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		String url = driver.getCurrentUrl();
		boolean avail = url.contains("university");
		Assert.assertTrue(avail);
		driver.close();
	}
}
