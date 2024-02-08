package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDay2 {

	public static void main(String[] args) {
	 
		
		// Test Case 1
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		
		//Webelements
		
		WebElement firstname = driver.findElement(By.cssSelector("input[name=\"first_name\"]"));
		WebElement lastname = driver.findElement(By.cssSelector("input[name=\"last_name\"]"));
		WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
		WebElement message = driver.findElement(By.cssSelector("textarea[name=\"message\"]"));
		WebElement formButton = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
		WebElement form = driver.findElement(By.cssSelector("#contact_form"));
		
		
		//sendKeys() , click() ,submit() , isdisplayed()
		
		firstname.sendKeys("Amol");
		lastname.sendKeys("Shinde");
		email.sendKeys("amolshinde1234@gmail.com");
		message.sendKeys("I am Leaning Js");
		
		//formButton.click()
		
		form.submit();
		
		
		WebElement msg = driver.findElement(By.tagName("h1"));
		boolean avail = msg.isDisplayed();
		if(avail) {
			System.out.println("TestCase Is Pass");
		}
		else {
			System.out.println("TestCase Is Fail");
		}
		
		
		driver.close();
		
		
		

	}

}
