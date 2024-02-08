package testNg2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testSuitOne {
	WebDriver driver;

	@Test
	public void testCaseOne() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement e = driver.findElement(By.cssSelector("#contact-us"));
		e.click();
		driver.quit();
	}

	@Test
	public void testCaseTwo() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement e = driver.findElement(By.cssSelector("#contact-us"));
		String script = "arguments[0].click()";
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript(script, e);

		driver.quit();
	}

	// Scrolling-around

	@Test
	public void testCaseThree() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement e = driver.findElement(By.cssSelector("#scrolling-around"));
		String script = "arguments[0].scrollIntoView(true)";
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript(script, e);

		driver.quit();
	}

	// <h1 data-cy = "two">Hello<h1>

	@Test
	public void testCaseFour() {
		// adding the Attribute to the element
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement e = driver.findElement(By.cssSelector("#scrolling-around"));
		String script = "arguments[0].setAttribute('data-cy','two')";
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript(script, e);
		String attributeVal = e.getAttribute("data-cy");
		Assert.assertEquals(attributeVal, "two");

		// driver.quit();

	}

	@Test

	public void testCaseFive() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
//		String title = driver.getTitle();
//		Assert.assertEquals(title, "WebDriverUniversity.com");
		String script = "return document.title";
		JavascriptExecutor je = (JavascriptExecutor)driver;
		String actualTitle =(String) je.executeScript(script);
		Assert.assertEquals(actualTitle,"WebDriverUniversity.com");
		
		driver.quit();

		// click ,scrollIntoview ,title, attributeget and set ,remove. 
	}

}