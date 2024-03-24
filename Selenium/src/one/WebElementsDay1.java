package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDay1 {

	public static void main(String[] args) throws InterruptedException {

		// <h1 id="one class ="two" name ="three">HeadOne</h1>
		// click()

		// Arrangement

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

		// Action
//		driver.findElement(By.name("first_name")).sendKeys("Amol");
//		driver.findElement(By.name("last_name")).sendKeys("Shinde");
//		driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
//		driver.findElement(By.name("message")).sendKeys("I am Learning JS");
//		driver.findElement(By.cssSelector("[type='submit']")).click();  //click()
//		
//		// Assertion
//		
//		boolean q1 = driver.findElement(By.tagName("h1")).isDisplayed();
//		if(q1) {
//			System.out.println("Login Successfully");
//		}
//		else {
//			System.out.println("Login not Successful");
//		}
//		
		// ====================================================================================================>

		// sendKeys()

//		driver.findElement(By.name("first_name")).sendKeys("Amol");
//		driver.findElement(By.name("last_name")).sendKeys("Shinde");
//		driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
//		driver.findElement(By.name("message")).sendKeys("I am Learning JS");
//		driver.findElement(By.cssSelector("[type='reset']")).click();  //click()
//		String Text = driver.findElement(By.name("first_name")).getText();
//		if(Text.equals("")) {
//			System.out.println("TestCase Pass");
//		}
//		else {
//			System.out.println("TestCase Fail");
//		}

		// GetText()
		// <h2 name="contactme" class="section_header">CONTACT US</h2>

//		String txt = driver.findElement(By.name("contactme")).getText();
//		if(txt.equals("CONTACT US")) {
//			System.out.println("TestCase 1 Pass");
//		}
//		else {
//			System.out.println("TestCase 1 Fail");
//		}
//		

		// GetAttribute()
//		String className = driver.findElement(By.name("contactme")).getAttribute("class");
//		if(className.equals("section_header")) {
//			System.out.println("TestCase 2 Pass");
//		}
//		else {
//			System.out.println("TestCase 2 Fail");
//		}
//		

//		WebElement userName = driver.findElement(By.name("first_name"));
//		userName.sendKeys("I am Lerning JS");
//		Thread.sleep(3000);
//		userName.clear();

		// IsEnabled()
//		
//		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//		boolean avail = driver.findElement(By.cssSelector("[value='cabbage']")).isEnabled();
//		if(avail) {
//			System.out.println("TestCase 3 Fail");
//		}
//		else {
//			System.out.println("TestCase 3 Pass");
//		}

		// IsDisplayed()
//
//		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//		boolean avail2 = driver.findElement(By.tagName("h1")).isDisplayed();
//		if (avail2) {
//			System.out.println("TestCase 4 pass");
//		} else {
//			System.out.println("TestCase 4 fail");
//		}
//		

		
		// IsSelected()

		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		boolean avail3 = driver.findElement(By.cssSelector("[value='cabbage']")).isSelected();
		if (avail3) {
			System.out.println("TestCase 4 pass");
		} else {
			System.out.println("TestCase 4 fail");
		}
		
		driver.close();

	}

}
