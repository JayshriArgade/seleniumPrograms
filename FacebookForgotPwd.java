package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookForgotPwd
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
	
	public static void forgotPwdData()
	{
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		driver.findElement(By.id("identify_email")).sendKeys("9096295533");
		driver.findElement(By.id("did_submit")).click();
	}

	public static void main(String[] args)
	{
	   launchBrowser();
	   getApplicationUrl("https://www.facebook.com/");
	   forgotPwdData();
	}

}
