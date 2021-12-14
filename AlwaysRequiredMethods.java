package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlwaysRequiredMethods 
{
    static WebDriver driver;
    
    public static void launchBrowser()
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\Software\\selenium\\chromedriver_win32\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    }
    
    public static void getApplicationUrl(String str)
    {
    	driver.get(str);
    }
    
    public static void sendKeys(WebElement ele, String str)
    {
    	ele.sendKeys(str);
    }
    
    public static void clickButton(WebElement ele)
    {
    	ele.click();
    }
    
    public static void clearText(WebElement ele)
    {
    	ele.clear();
    }
}
