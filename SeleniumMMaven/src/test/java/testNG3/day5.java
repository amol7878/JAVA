package testNG3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day5 {
       @DataProvider(name ="logindata")
       public Object [] [] loginData(){
    	   
    	   return new Object [] [] {
    		   {"standard_user","secret_sauce"},
    		   {"locked_out_user","secret_sauce"},
    		   {"problem_user","secret_sauce"},
    		   {"performance_glitch_user","secret_sauce"}
    	   };
       }
	WebDriver driver;

	@Test(dataProvider = "logindata")
	public void Login(String Username, String Password) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.cssSelector("#login-button")).click();
	    Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
	}

}
