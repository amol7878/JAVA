package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement result = driver.findElement(By.id("result"));
//		Test Case 1

//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
//		driver.switchTo().alert().accept();
//		if (result.getText().equals("You successfully clicked an alert")) {
//			System.out.println("Test Case 1 Pass");
//		} else {
//			System.out.println("Test Case 1 fail");
//		}

//		Test Case 2
//
//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
//		driver.switchTo().alert().accept();
//		if (result.getText().equals("You clicked: Ok")) {
//			System.out.println("Test Case 2 Pass");
//		} else {
//			System.out.println("Test case 2 Fail");
//		}

//		Test Case 3

//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
//		driver.switchTo().alert().dismiss();
//		if (result.getText().equals("You clicked: Cancel")) {
//			System.out.println("Test Case 3 Pass");
//		} else {
//			System.out.println("Test case 3 Fail");
//		}

//		Test Case 4
//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
//		String n = "hello";
//		driver.switchTo().alert().sendKeys(n);
//		driver.switchTo().alert().accept();
//		if (result.getText().contains(n)) {
//			System.out.println("Test Case 4 Pass");
//		} else {
//			System.out.println("Test Case 4 Fail");
//		}

//      Test case 5
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		driver.switchTo().alert().dismiss();
		if (result.getText().contains("You entered: null")) {
			System.out.println(" Test Case 5 Pass");
		} else {
			System.out.println("Test Case 5 Fail");
		}

		driver.close();

	}

}
