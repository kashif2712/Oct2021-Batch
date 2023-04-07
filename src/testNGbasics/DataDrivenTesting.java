package testNGbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {
	WebDriver driver;

	
	@BeforeClass
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
public void backtohomepage() {
      driver.findElement(By.id("nav-logo-sprites")).click();
}


@AfterClass
public void tearDown() {
	driver.close();
}
	

@Test(dataProvider="positiveSearchData")
public void  positiveSearchFunctionalityTest(String product) {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
	driver.findElement(By.id("nav-search-submit-button")).click();
	String actualTitle =driver.getTitle();
	String expectedTitle = "Amazon.com : "+product;
	Assert.assertEquals(actualTitle, expectedTitle);
	Assert.assertTrue(driver.getCurrentUrl().contains(product));
	Assert.assertFalse(!driver.getTitle().contains(product));
	
		
}

@DataProvider
public String[] positiveSearchData() {
	String[] searchProduct= {"apple","orange","samsung"};
	return searchProduct;
	
}

@Test(dataProvider="positiveMenuLinkData")
public void positiveMenuLinkFunctionalityTest(String link) {
	driver.findElement(By.linkText(link)).click();
	String actualTitle =driver.getTitle();
	String expectedTitle= "Amazon.com: "+link;
	Assert.assertEquals(actualTitle,expectedTitle);
	Assert.assertTrue(driver.getCurrentUrl().contains(link.replace(" ","")));
	Assert.assertFalse(!driver.getTitle().contains(link));
	
	
}

@DataProvider
public String[] positiveMenuLinkData() {
	String[] menuLink= {"Amazon Basics","New Realeases","Today's Deals "};
	return menuLink;
	
	
	

}

}
