package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin 
{
    static WebDriver driver;
    
    public static void launchBrowser()
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\Software\\selenium\\chromedriver_win32\\chromedriver.exe");
    	driver = new ChromeDriver();
    }
    
    public static void getApplicationUrl(String str)
    {
    	driver.get(str);
    	
    	driver.manage().window().maximize();
    }
    
    public static void loginDetails()
    {
    	driver.findElement(By.id("email")).sendKeys("jayshriargade999@gmail.com");
    	
    	driver.findElement(By.id("pass")).sendKeys("Jayshri@123");
    	
    	driver.findElement(By.name("login")).click();
    }
    
	public static void main(String[] args) 
	{
        launchBrowser();
        getApplicationUrl("https://www.facebook.com/");
        loginDetails();
	}

}
