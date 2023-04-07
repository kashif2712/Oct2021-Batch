package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationConcept {
	
	//sync between application loading & automation execution
	
	// 2 Types
	
	//1.Static wait->Thread.sleep(5000); pause in execution

	//2.Dynamic wait-> pause execution for defined amount of time until element is found, if found continue execution
	   //a. Implicit wait-> global wait, applicable for all element where action is going to be performed
	   //b. Explicit wait-> defined for specific element
	                 // fluent wait:-> polling/frequency of search can be adjusted
	
	//0-5-10-15-20---20sec-----3|11\16=10sec waste
	//02-4-6-8-10-12-14-16-18-20-----20sec------ 3|11|16= 2sec waste
	
	

	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://amazon.com");
	   
	   // implicit wait
	   driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	   
	   Actions action = new Actions(driver);
		WebElement accountList =driver.findElement(By.id("nav-link-accountList"));
		
//		Thread.sleep(3000); // static wait
		action.moveToElement(accountList).build().perform();
		
		
		
		
//	   explicit wait 
		WebDriverWait explicitWait = new WebDriverWait(driver,30);
		WebElement primeMenuOption = driver.findElement(By.id("nav-link-amazonprime"));
	    explicitWait.until(ExpectedConditions.visibilityOf(primeMenuOption));
	    explicitWait.until(ExpectedConditions.elementToBeClickable(primeMenuOption));
		action.moveToElement(primeMenuOption).build().perform();
		
		//Fluent wait
		FluentWait<WebDriver> fl= new FluentWait<WebDriver>(driver)
		      .withTimeout(Duration.ofSeconds(0))
		      .pollingEvery(Duration.ofSeconds(2))
		      .ignoring(NoSuchElementException.class);
		WebElement flagIcon=driver.findElement(By.id("icp-nav-flyout"));
		fl.until(ExpectedConditions.presenceOfElementLocated(By.id("icp-nav-flyout")));
		action.moveToElement(flagIcon).build().perform();
		
		
		
		
		      
		
		
		
		
		Thread.sleep(3000);
	    driver.close();
	   
	   
	   		

	}

}
