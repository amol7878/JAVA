package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

		// finding the single elements

		boolean avail = driver.findElement(By.cssSelector("h2[name=\"contactme\"]")).isDisplayed();
		if (avail) {
			System.out.println("Test Case Is Pass");
		} else {
			System.out.println(("Test Case iS Fail"));
		}

		// find the multiple elements

		int elements = driver.findElements(By.cssSelector("input[type=\"text\"]")).size();
		if (elements == 3) {
			System.out.println("Test Case is Pass");
		} else {
			System.out.println("Testcase is fail");
		}

		// Class Name

		int elements2 = driver.findElements(By.className("feedback-input")).size();
		if (elements2 == 4) {
			System.out.println("Test Case is Pass");
		} else {
			System.out.println("Testcase is fail");
		}

		// ID Name

		boolean avail2 = driver.findElement(By.id("contact_form")).isDisplayed();
		if (avail2) {
			System.out.println("Test Case is Pass");
		} else {
			System.out.println("Testcase is fail");
		}

		// TAG Name

		boolean avail3 = driver.findElement(By.tagName("h2")).isDisplayed();
		if (avail3) {
			System.out.println("Test Case is Pass");
		} else {
			System.out.println("Testcase is fail");
		}

		// name

		boolean avail4 = driver.findElement(By.name("first_name")).isDisplayed();
		if (avail4) {
			System.out.println("Test Case is Pass");
		} else {
			System.out.println("Testcase is fail");
		}

		
		// Xpath

				boolean avail5 = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]")).isDisplayed();
				if (avail5) {
					System.out.println("Test Case is Pass");
				} else {
					System.out.println("Testcase is fail");
				}
				
				
		//Link Test
				
				
		
	   // Partial Linked
				
				
				
//		driver.close();
	}

}
