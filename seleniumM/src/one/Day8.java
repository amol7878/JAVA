package one;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		// Webdriver --- interface ---> implements chrome Driver

		// get()

		// driver.get("http://www.webdriveruniversity.com");
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String url = driver.getCurrentUrl();
		if (url.contains("inventory")) {
			System.out.println("Test Case Pass");
		} else {
			System.out.println("Test Case Fail");
		}

		driver.close();
	}

}
