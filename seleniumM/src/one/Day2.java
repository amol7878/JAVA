package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WebElement ??
		// WebElwmwnt ???? // HTML Element

		// <h1 id="one" class="two" name ="nm">Hello</h1>

		// TESTCASE 1

		// ARRANGMENT

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		// ACTION

//		WebElement ele = driver.findElement(By.cssSelector("#user-name"));
//		ele.sendKeys("standard_user");
//		WebElement ele2 = driver.findElement(By.cssSelector("#password"));
//		ele2.sendKeys("secret_sauce");
//		WebElement ele3 = driver.findElement(By.cssSelector("#login-button"));
//		ele3.click();
//		
//		// ASSERTION
//		
//		WebElement ele4 = driver.findElement(By.cssSelector(".app_logo"));
//		boolean flag = ele4.isDisplayed();
//		
//		if(flag) {
//			System.out.println("TESTCASE 1 PASS");
//		}
//		else {
//			System.out.println("TESTCASE 1 FAIL");
//		}
//		
//		driver.close();

		// TESTCASE 2

		// ACTION

		WebElement ele = driver.findElement(By.cssSelector("#user-name"));
		ele.sendKeys("standard_user");
		WebElement ele2 = driver.findElement(By.cssSelector("#password"));
		ele2.sendKeys("set_sauce");
		WebElement ele3 = driver.findElement(By.cssSelector("#login-button"));
		ele3.click();
		WebElement ele4 = driver.findElement(By.cssSelector("h3[data-test=\"error\"]"));
		String expectedText = ele4.getText();
		System.out.println(expectedText);

		if (expectedText.contains("Epic sadface: Username and password do not match any user in this service")) {
			System.out.println("TESTCASE 2 PASS");
		} else {
			System.out.println("TESTCASE 2 FAIL");
		}

		driver.close();

	}
}