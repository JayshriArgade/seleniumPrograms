package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod
{

	static WebDriver driver;
	
	public static void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\selenium\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
	}
	
	public static void getUrl(String str)
	{
		driver.get(str);
	}
	
	public static void handleWebElement()
	{
		WebElement username = driver.findElement(By.name("Username"));
		System.out.println(username.getText());
		
		driver.findElement(By.tagName("input")).sendKeys("Jayshri");
		driver.findElement(By.id("456")).sendKeys("Check@123");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(By.className("password_#123")).clear();
		
		//driver.findElement(By.linkText("Submit form")).click();
		driver.findElement(By.partialLinkText("Submit")).click();
	}
	
	public static void main(String[] args)
	{
       LaunchBrowser();
       getUrl("file:///C:/Users/Jayshri%20Argade/Desktop/login.html");
       handleWebElement();
	}

}
