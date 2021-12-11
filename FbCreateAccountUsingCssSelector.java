package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbCreateAccountUsingCssSelector
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
	
	public static void createNewAccountPopup()
	{
		driver.findElement(By.linkText("Create New Account")).click();
	}
	
	public static void accountInputData()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Jayshri");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Argade");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("9096295533");
		driver.findElement(By.cssSelector("input[id='password_step_input']")).sendKeys("Jayshri@123");
	}
	
	public static void accountDropdownData()
	{
		WebElement testdate = driver.findElement(By.cssSelector("select[id='day']"));
		Select dropdown1 = new Select(testdate);
		dropdown1.selectByValue("17");
		
		WebElement testmonth = driver.findElement(By.cssSelector("select[id='month']"));
		Select dropdown2 = new Select(testmonth);
		dropdown2.selectByValue("4");
		
		WebElement testyear = driver.findElement(By.cssSelector("select[id='year']"));
		Select dropdown3 = new Select(testyear);
		dropdown3.selectByValue("1995");
	}
	
	public static void accountRadioButtonData()
	{
		
		WebElement radio1 = driver.findElement(By.cssSelector("input[value='1']"));
		radio1.click();
		System.out.println(radio1.isSelected());
	}
	
	public static void submitButton()
	{	
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		
	}
	
	public static void main(String[] args)
	{
       launchBrowser();
       getApplicationUrl("https://www.facebook.com");
       createNewAccountPopup();
       accountInputData();
       accountDropdownData();
       accountRadioButtonData();
       submitButton();
	}

}
