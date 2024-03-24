package one;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pract1FcebOOk_Login {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMOL\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	
         WebElement day= driver.findElement(By.xpath("//*[@id=\"day\"]"));
         Select sel = new Select(day);
         sel.selectByVisibleText("10");
         
         
         Select sel1 = new Select(driver.findElement(By.cssSelector("select[id=\"month\"]")));
         sel1.selectByValue("1");
        
         
         Select sel2= new Select(driver.findElement(By.cssSelector("select[id=\"year\"]")));
         sel2.selectByVisibleText("2000");
         
         
         
         
         
         
	}

}
