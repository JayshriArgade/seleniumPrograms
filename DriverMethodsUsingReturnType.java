package seleniumTest;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethodsUsingReturnType 
{
	static WebDriver driver;
	public static WebDriver openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
        return driver;
	}
	
	public static void getUrl(String url)
	{
		driver.get(url);
	}
	
	public static String getCurrentUrl()
	{
		String str = driver.getCurrentUrl();
		return str;
	}
	
	public static String getUrlTitle()
	{
		String str1 = driver.getTitle();
		return str1;
	}
	
	public static void validateUrl(String str, String str1)
	{
		String actual = str;
		String expected = str1;
		
		if(actual.equals(expected))
		   System.out.println("Both URL's are Same");
		else
			System.out.println("Actual URL not matching with expected");
		
	}
	
	public static String pageSource()
	{
		String str2 = driver.getPageSource();
		return str2;
	}

	public static void backMethod()
	{
		driver.navigate().back();
	}
	
	public static void main(String[] args) 
	{
		openBrowser();
		getUrl("https://www.facebook.com/");
		System.out.println("Application title = "+getUrlTitle());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Expected URL");
		String s = sc.next();
		validateUrl(getCurrentUrl(),s);
		backMethod();
		System.out.println("Current Page source = "+pageSource());
	}

}
