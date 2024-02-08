package testNg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testSuitFour {
	WebDriver driver;

	@Test()
	public void IframeTestCase() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");

		// Switching to the iframe Through element
		WebElement iframe = driver.findElement(By.cssSelector("#frame"));
		driver.switchTo().frame(iframe);
		boolean avail = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a")).isDisplayed();
		Assert.assertTrue(avail);
		driver.close();

	}

	@Test

	public void iframeTestCase2() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
		// Iframe By Index
		driver.switchTo().frame(0);
		boolean avail = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a")).isDisplayed();
		Assert.assertTrue(avail);
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("IFrame"));
		driver.close();

	}

	@Test

	public void iframeTestCaseThree() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
		// Iframe By Id or name

		driver.switchTo().frame("frame");
		boolean avail = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a")).isDisplayed();
		Assert.assertTrue(avail);
		driver.close();

	}

}
