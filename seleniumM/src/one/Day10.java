package one;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com");
		driver.findElement(By.cssSelector("#contact-us")).click();

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		Set<String> WindowIds = driver.getWindowHandles();
		System.out.println(WindowIds);

		

		for (String id : WindowIds) {
			System.out.println(id);
			if (id != parentWindow) {
				driver.switchTo().window(id);
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		boolean ele =  driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div")).isDisplayed();
		System.out.println(ele);
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
