package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo
{
	static WebDriver driver;
	
	public static void getBrowserUrl(String url) 
	{
		driver.get(url);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeBrowser()
	{
		driver.close();   //Closes current window tab
		
		//driver.quit();   closes all window tabs / discards the webdriver object
	}
	
	public static void titleValidation()
	{
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		
		if(actualTitle.equals(expectedTitle))
		   System.out.println("Actual title equals to Expected title");
		else
			System.err.println("Actual title not equals to Expected title");		
	}
	
	public static void toGetCurrentUrlAndPageSource()
	{
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL = "+currentUrl);
		
		//String pageSrc = driver.getPageSource();
		//System.out.println("Page source = "+pageSrc.substring(0, 20));
	}
	
	public static void navigationMethods()
	{
		driver.navigate().back();  //navigates to back URL
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.navigate().forward();  //navigates to forward URL
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.facebook.com/");
	}
	
	public static void manageMethods()
	{
		//System.out.println("Size of window before maximize = "+driver.manage().window().getSize());
		//Dimension dim = new Dimension(800, 500);
		//driver.manage().window().setSize(dim);
		//System.out.println("Size of window after set dimension = "+driver.manage().window().getSize());
		
		//driver.manage().window().fullscreen();
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Point point = new Point(200, 300);
		driver.manage().window().setPosition(point);
		System.out.println("window display after set position = "+driver.manage().window().getPosition());
		
		System.out.println(driver.manage().getCookies());
		System.out.println("After deleting all cookies = ");
		driver.manage().deleteAllCookies();
		Cookie cookie = new Cookie("cookie 1", "hdskfhsdficvhdiodsdsoif");
		driver.manage().addCookie(cookie);
	}

	public static void main(String[] args)
	{
	    System.setProperty("webdriver.chrome.driver", "D:\\Software\\selenium\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
          
        getBrowserUrl("https://www.google.com");
        titleValidation();
       // toGetCurrentUrlAndPageSource();
       // navigationMethods();
        manageMethods();
       // closeBrowser();
    }

}
