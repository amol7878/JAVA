package one;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		boolean q1 = driver.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(3)")).isEnabled();
		System.out.println(q1);
		boolean q2 = driver.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(5)")).isSelected();
		System.out.println(q2);

		driver.close();
	}

}
