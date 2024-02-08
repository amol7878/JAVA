package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowncheckBoxRadioButton {

	public static void main(String[] args) {
		System.setProperty("wbdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		// Drop Down
		
		
		WebElement ele = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(ele);

		// <select class="dropdown-menu-lists" id="dropdowm-menu-1">
//        <option value="java">JAVA</option>
//        <option value="c#">C#</option>
//        <option value="python">Python</option>
//        <option value="sql">SQL</option>
//      </select>

		select.selectByIndex(2);
		select.selectByVisibleText("Python");
		select.selectByValue("python");

		WebElement ele2 = select.getFirstSelectedOption();

		String avail = ele2.getText();
		if (avail.equals("Python")) {
			System.out.println("TestCAse 1 Pass");
		} else {
			System.out.println("TEstCase 1 Fail");
		}
		
		//Test Case 2
		
		// Check Box
		
		WebElement eleD = driver.findElement(By.cssSelector("input[value=\"option-1\"]"));
		eleD.click();
		boolean avail1 = eleD.isSelected();
        if(avail1 == true) {
        	System.out.println("TestCase 2 Is Pass ");
        }
        else {
        	System.out.println("TestCase 2 is Fail");
        }
        
        
        // Radio Button 
        
        WebElement greenE = driver.findElement(By.cssSelector("input[value=\"green\"]"));
        WebElement blueE = driver.findElement(By.cssSelector("input[value=\"blue\"]"));
        
        greenE.click();
        
        boolean avail2 = greenE.isSelected();
        boolean avail3 = blueE.isSelected();
        
        if(avail2 && !avail3) {
        	System.out.println("Test Case 3 Is Pass");
        }
        else {
        	System.out.println("Test Case  3 iS Fail");
        }
        
		driver.close();

	}

}
