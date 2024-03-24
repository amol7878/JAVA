package one;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		driver.findElement(By.cssSelector("input[name=\"first_name\"]")).sendKeys("chinmay");
		driver.findElement(By.cssSelector("input[name=\"last_name\"]")).sendKeys("deshpande");
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("chinmay23@gmail.com");
		driver.findElement(By.cssSelector("textarea[name=\"message\"]")).sendKeys("chinmay dehpande");

		// click();

		// driver.findElement(By.cssSelector("#form_buttons >
		// input:nth-child(2)")).click();

		// submit();

		// driver.findElement(By.cssSelector("#form_buttons >
		// input:nth-child(2)")).submit();

		// getLocation()

//		Point a = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).getLocation();
//		System.out.println(a);

		// clear()
//		driver.findElement(By.cssSelector("input[name=\"first_name\"]")).clear();
//		driver.findElement(By.cssSelector("input[name=\"last_name\"]")).clear();
//		driver.findElement(By.cssSelector("input[name=\"email\"]")).clear();
//		driver.findElement(By.cssSelector("textarea[name=\"message\"]")).clear();

		// isDisplayed()

//		driver.findElement(By.cssSelector("input[name=\"first_name\"]")).isDisplayed();

		// getTagName()
		String q = driver.findElement(By.cssSelector("input[name=\"first_name\"]")).getTagName();
		System.out.println(q);

		// getCssValue()
		String fontSize = driver.findElement(By.cssSelector("input[name=\"first_name\"]")).getCssValue("font-size");
		System.out.println(fontSize);

		// getAttribute()

		String q1 = driver.findElement(By.cssSelector("input[name=\"first_name\"]")).getAttribute("placeholder");
		System.out.println(q1);
		
		String txt = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2")).getText();
		System.out.println(txt);
		
		Dimension qq = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2")).getSize();
		//driver.manage().window().maximize();
		System.out.println(qq);
		driver.close();

	}

}
