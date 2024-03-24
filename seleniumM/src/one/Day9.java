package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com");

		// driver.getTitle()
//		String title = driver.getTitle();
//		System.out.println(title);
//		if (title.equals("WebDriverUniversity.com")) {
//			System.out.println("Test Case pass");
//		}

		driver.get("https://www.saucedemo.com/");
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
//		String url = driver.getCurrentUrl();
//		if (url.contains("inventory")) {
//			System.out.println("Test Case Pass");
//		} else {
//			System.out.println("Test Case Fail");
//		}

		// Find Element()
//
//		WebElement ele = driver.findElement(By.className("login_logo"));
//		if (ele.isDisplayed()) {
//			System.out.println("Test Case Pass");
//		} else {
//			System.out.println("Test Case Fail");
//		}

		// Find Element

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		List<WebElement> ele = driver.findElements(By.className("inventory_item_name"));
		if (ele.size() == 6) {
			System.out.println("Test Case Pass");
		} else {
			System.out.println("Test Case Fail");
		}

		for (int i = 0; i < ele.size(); i++) {
			System.out.println(ele.get(i).getText());
		}

		driver.close();
		// driver.close() -- closes the current browser handled by automation

		//// driver.quit()

		// closes the all browser handled by automation

	}

}
