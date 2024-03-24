package one;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		// <h1 id ="one" class ="two">Headone</h1>
		// getText()

		WebElement ele = driver.findElement(By.cssSelector("h1"));
//		String actual =ele.getText();
//        String expected = "Dropdown Menu(s), Checkboxe(s) & Radio Button(s)";
//        if(actual.equals(expected)) {
//        	System.out.println("Test Case 1 Pass");
//        }
//        else {
//        	System.out.println("Test case 1 Fail");
//        }

		// isdisplayed()
//		if(ele.isDisplayed()) {
//			System.out.println("Test Case 2 Pass");
//		}
//		else {
//			System.out.println("Test Case 2 Fail");
//		}

		// is Selected() // click()
//
//		WebElement ele2 = driver.findElement(By.cssSelector("input[value=\"green\"]"));
//		ele2.click();
//		if (ele2.isSelected()) {
//			System.out.println("Test Case 3 Pass");
//		} else {
//			System.out.println("Test Case 3 Fail");
//		}

		// isEnabled()

//		WebElement ele3 = driver.findElement(By.cssSelector("input[value=\"cabbage\"]"));
//		if (ele3.isEnabled()) {
//			System.out.println("Test Case 4 Pass");
//		} else {
//			System.out.println("Test Case 4 Fail");
//		}

		// getSize()
		WebElement ele4 = driver.findElement(By.cssSelector("div[class=\"thumbnail\"]"));
		Dimension heigthWeight = ele4.getSize();
		driver.manage().window().maximize();
		System.out.println(heigthWeight);
		System.out.println(ele.getSize());

		// getAttribute()
//		WebElement ele5 = driver.findElement(By.id("main-header"));
//		String classValue = ele5.getAttribute("class");
//		System.out.println(classValue);

		// getCssValue()

//		String fontSizeValue = ele.getCssValue("font-size");
//		System.out.println(fontSizeValue);

		// getTagName()
//		String tg = ele.getTagName();
//		System.out.println(tg);

		// sendKeys() //clear()

		//driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		// input[name="first_name"]
//		WebElement ele6 = driver.findElement(By.cssSelector("input[name=\"first_name\"]"));
//		ele6.sendKeys("chinmay");
//		ele6.clear();
		
		driver.close();

		// Location()

		// Submit()

	}

}
