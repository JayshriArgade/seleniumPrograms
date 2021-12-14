package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FacebookSigninUsingXpath extends AlwaysRequiredMethods
{
	public static void main(String[] args) 
	{
		launchBrowser();
		getApplicationUrl("https://www.facebook.com");
		
		WebElement element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input[@name='email']"));
	    sendKeys(element, "jayshriargade999@gmail.com");
	    
	    WebElement element1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div[2]/div/input[@name='pass']"));
	    sendKeys(element1, "Jayshri@123");
	    
	    WebElement element2 = driver.findElement(By.xpath("//button[@name='login']"));
	    clickButton(element2);
	}

}
