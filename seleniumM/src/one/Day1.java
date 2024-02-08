package one;

import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// selenium Webdriver Jar Download And Added
		// Check Version for Chrome
		// Download Chrome driver and extract
		// copy Chrome Driver Path into testCases

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
