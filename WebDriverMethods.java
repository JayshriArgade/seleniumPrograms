package seleniumTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods
{

    static WebDriver driver;
	
	public static void getBrowserUrl() 
	{
		driver.get("https://www.google.com");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeBrowser()
	{
		driver.close();   //Closes current window tab
	}
	
	public static void QuitBrowser()
	{	
		driver.quit();   //closes all window tabs / discards the webdriver object
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
	
	public static void toGetCurrentUrl()
	{
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.google.com";
		
		if(currentUrl.equals(expectedUrl))
		    System.out.println("Current URL is same as expected URL ");
		else
			System.out.println("Current URL is not Expected");
	}
	
	public static void toGetPageSource()
	{
		String pageSrc = driver.getPageSource();
		System.out.println("Page source = "+pageSrc.substring(0, 20));
	}
	
	public static void navigationBack() 
	{
		driver.navigate().back();  //navigates to back URL
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void navigationForward()
	{
		driver.navigate().forward();  //navigates to forward URL
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void navigationRefresh()
	{
		driver.navigate().refresh();
	}
	
	public static void navigateToMethod()
	{
		driver.navigate().to("https://www.facebook.com/");
	}
	
	public static void manageWindowSizeMethod()
	{
		System.out.println("Get size method = "+driver.manage().window().getSize());
		Dimension dim = new Dimension(1600,900);
		driver.manage().window().setSize(dim);
		System.out.println("Set size method = "+driver.manage().window().getSize());
	}
	
	public static void windowMaximize()
	{
		driver.manage().window().maximize();
	}
	
	public static void windowFullscreen()
	{
		driver.manage().window().fullscreen();
	}

	public static void windowPosition()
	{
		Point point = new Point(100,200);
		driver.manage().window().setPosition(point);
		driver.manage().window().getPosition();
	}
	
	public static void main(String[] args)
	{
	    System.setProperty("webdriver.chrome.driver", "D:\\Software\\selenium\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
          
        getBrowserUrl();
        //titleValidation();
        //toGetCurrentUrl();
        navigationRefresh();
        windowPosition();
        //windowFullscreen();
        //windowMaximize();
        //toGetPageSource();
        //navigateToMethod();
        //navigationBack();
        //navigationForward();
        //manageWindowSizeMethod();
       // closeBrowser();
    }
}
