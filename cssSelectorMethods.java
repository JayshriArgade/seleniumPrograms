package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorMethods
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
		
		public static void handleWebElement()
		{
			String product = "Laptop bag";
			driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
			WebElement searchbar = driver.findElement(By.cssSelector("input[name='q']"));
			String placeholder = searchbar.getAttribute("placeholder");
			System.out.println("Actual Placeholder = "+placeholder);
			
			searchbar.sendKeys(product);
			String attributevalue = searchbar.getAttribute("value");
			System.out.println("Attribute value = "+attributevalue);
			
			String fontfamily = searchbar.getCssValue("font-family");
			System.out.println("Font family = "+fontfamily);
			
			System.out.println(driver.findElement(By.cssSelector("a[class='_1_3w1N']")).getText());
			
			boolean result = false;
			try
			{
				result = driver.findElement(By.cssSelector("a[class='_1_3w1N']")).isDisplayed();
			}catch(RuntimeException e) {
				
			}
			
			System.out.println(result);
		}

		
	public static void main(String[] args)
	{
		launchBrowser();
		getApplicationUrl("https://www.flipkart.com");
        handleWebElement();
	}

}
