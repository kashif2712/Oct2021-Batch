package testNGbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParametrizationXML {
	Properties prop;
	WebDriver driver;
	
	@Parameters(value={"browser","url"})
	@BeforeMethod
	public void initialization(String browser, String url) {
		try {
		    prop = new  Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\SkyWalker\\eclipse-workspace\\"
					+ "MyFirstProgram\\src\\testNGbasics\\Config.properties");
			
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		if(browser.equalsIgnoreCase("chrome")) {
			   System.setProperty(prop.getProperty("chromeKey"),prop.getProperty("chromePath"));			   
		}else if(browser.equalsIgnoreCase("firefox")||browser.equalsIgnoreCase("ff")) {
			 System.setProperty(browser,prop.getProperty("ffPath"));
			   driver = new FirefoxDriver();   
		}else if(browser.equalsIgnoreCase("internet explorer")||prop.getProperty("browser").equalsIgnoreCase("ie")){
			 System.setProperty(prop.getProperty("ieKey"),prop.getProperty("iePath"));
			 driver = new InternetExplorerDriver();
		}else if (browser.equalsIgnoreCase("msedge")||browser.equalsIgnoreCase("edge")){
			System.setProperty(prop.getProperty("edgeKey"),prop.getProperty("edgePath"));
			   driver = new EdgeDriver();
		}else {
			System.err.println("NotSupportedBrowser");
		}
	    
		   driver.manage().window().maximize();
		   driver.get(url);
		   driver.manage().timeouts().implicitlyWait(Long.valueOf(prop.
				   getProperty("implicitWaitDuration")),TimeUnit.SECONDS);
		   
		   
		   
		   
	

}
@AfterMethod
public void teardown() {
	driver.close();
	
}


@Parameters(value="product")
@Test
public void  positiveSearchFunctionalityTest(String product) {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
	driver.findElement(By.id("nav-search-submit-button")).click();
	String actualTitle =driver.getTitle();
	String expectedTitle= "Amazon.com : "+product;
	Assert.assertEquals(actualTitle,expectedTitle);
	Assert.assertTrue(driver.getCurrentUrl().contains(product));
	Assert.assertFalse(!driver.getTitle().contains(product));
	
		
}
}