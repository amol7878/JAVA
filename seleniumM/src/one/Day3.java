package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

		// isDisplayed()

		WebElement contactE = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
//		boolean a = contactE.isDisplayed();
//		if (a) {
//			System.out.println("TEST CASE PASS");
//		} else {
//			System.out.println("TEST CASE FAIL");
//		}
//		
//		driver.close();
		// getText()

//		if (contactE.getText().equals("CONTACT US")) {
//			System.out.println("TEST CASE PASS");
//		} else {
//			System.out.println("TEST CASE FAIL");
//		}
//        driver.close(); 

		// sendKeys();

		WebElement firstName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement lastName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement message = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement submitButton = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));

		// clear

		// firstName.clear();
		// click();
//		firstName.sendKeys("Amol");
//		lastName.sendKeys("Rao");
//		email.sendKeys("Amol04@gmail.com");
//		message.sendKeys("I Am Learning New things");
//		submitButton.click();

		// Submit()

		firstName.sendKeys("Amol");
		lastName.sendKeys("Rao");
		email.sendKeys("Amol04@gmail.com");
		message.sendKeys("I Am Learning New things");
		submitButton.submit();

		// Click() , SendKeys() , clear(), submit (), isDisplayed(),getText()

		System.out.println("TEST CASE PASS");
		
	}

}
