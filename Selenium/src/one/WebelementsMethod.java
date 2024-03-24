package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://saucedemo.com/v1/index.html");
		
		
		//<h1 id="id class = "namee"  name = "nm>Hello<h1/>
		
		WebElement User_name = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		WebElement Logincredential = driver.findElement(By.id("login_credentials"));
		
		
		//<input type="text" class="form_input" data-test="username" id="user-name" name="user-name" placeholder="Username" autocorrect="off" autocapitalize="none" value="">
		
		// sendkeys() method --1
		
		User_name.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		
		//click () method ---2
		
		//loginButton.click();
		
		//clear() method --3
		User_name.clear();
		password.clear();
		
		
		
		//getAttribute() method --4
		//<input type="text" class="form_input" data-test="username" id="user-name" name="user-name" placeholder="Username" autocorrect="off" autocapitalize="none" value="">

		String attributeValue = User_name.getAttribute("class");
		System.out.println(attributeValue);
		
		//tagNameText() method --5
		
		String tagNameText= User_name.getTagName();
		System.out.println(tagNameText);
		
		//getText() --6
		
		String txt = Logincredential.getText();
		System.out.println(txt);
		
		
		
		
		
		
		
		
		
		

	}

}
