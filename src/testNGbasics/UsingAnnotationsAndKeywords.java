package testNGbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsingAnnotationsAndKeywords {
	
		
	WebDriver driver;
	
	@BeforeMethod
	public void initialization() {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
	
	}	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
		
	
	@Test
	public void  positiveSearchFunctionalityTest() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String actualTitle =driver.getTitle();
		String expectedTitle= "Amazon.com : apple";
		Assert.assertEquals(actualTitle,expectedTitle);
		Assert.assertTrue(driver.getCurrentUrl().contains("apple"));
		Assert.assertFalse(!driver.getTitle().contains("apple"));
			
	}
	
	@Test
	public void positiveMenuLinkFunctionalityTest() {
		driver.findElement(By.linkText("Amazon Basics")).click();
		String actualTitle =driver.getTitle();
		String expectedTitle= "Amazon.com: Amazon Basics";
		Assert.assertEquals(actualTitle,expectedTitle);
		Assert.assertTrue(driver.getCurrentUrl().contains("AmazonBasics"));
		Assert.assertFalse(!driver.getTitle().contains("Amazon Basics"));
		

}
	
}
