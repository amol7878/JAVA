package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	// Locators

	// By ClassName
	// By Name
	// By LinkText
	// BY Partiali Linktext
	// By id
	// By TagName
	// By Css Selector
	// By X Path

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/");
		WebElement elementByLinkText = driver
				.findElement(By.linkText("Cypress with Cucumber BDD - Beginner to Expert in 9 Hours!"));
		if (elementByLinkText.isDisplayed()) {
			System.out.println("TestCase 1 Pass");
		} else {
			System.out.println("TestCase 1 Fail");
		}

		WebElement elementByPLinkText = driver.findElement(By.partialLinkText("Cypress with Cucumber BDD"));
		if (elementByPLinkText.isDisplayed()) {

			System.out.println("TestCase 2 Pass");
		} else {
			System.out.println("TestCase 2 Fail");
		}
		driver.close();

	}

}
