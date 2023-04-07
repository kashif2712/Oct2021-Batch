package seleniumBasics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingConfigFileCrossBrowserTesting {
	static Properties prop;
	static WebDriver driver;
	
	
	

	public static void main(String[] args)  {
		
		
		try {
			Properties prop = new  Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\SkyWalker\\eclipse-workspace\\MyFirstProgram\\src\\seleniumBasics\\Config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			   System.setProperty(prop.getProperty("chromeKey"),prop.getProperty("chromePath"));			   driver = new ChromeDriver();
		}else if(prop.getProperty("browser").equalsIgnoreCase("firefox")||prop.getProperty("browser").equalsIgnoreCase("ff")) {
			 System.setProperty(prop.getProperty("ffKey"),prop.getProperty("ffPath"));
			   driver = new FirefoxDriver();   
		}else if(prop.getProperty("browser").equalsIgnoreCase("internet explorer")||prop.getProperty("browser").equalsIgnoreCase("ff")){
			 System.setProperty(prop.getProperty("ieKey"),prop.getProperty("iePath"));
			 driver = new InternetExplorerDriver();
		}else if(prop.getProperty("browser").equalsIgnoreCase("msedge")||prop.getProperty("browser").equalsIgnoreCase("edge")){
			System.setProperty(prop.getProperty("edgeKey"),prop.getProperty("edgePath"));
			   driver = new EdgeDriver();
		}else {
			System.err.println("Not a suppoerted browser for testing");
		}
	    
		   System.setProperty(prop.getProperty("chromeKey"),prop.getProperty("chromePath"));
	       driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get(prop.getProperty("url"));
		   driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		   
		   
		   Actions action = new Actions(driver);
			WebElement accountList =driver.findElement(By.id("nav-link-accountList"));
			

			action.moveToElement(accountList).build().perform();
		

			WebDriverWait explicitWait = new WebDriverWait(driver,30);
			WebElement primeMenuOption = driver.findElement(By.id("nav-link-amazonprime"));
		    explicitWait.until(ExpectedConditions.visibilityOf(primeMenuOption));
		    explicitWait.until(ExpectedConditions.elementToBeClickable(primeMenuOption));
			action.moveToElement(primeMenuOption).build().perform();
			
			
			FluentWait<WebDriver> fl= new FluentWait<WebDriver>(driver)
			      .withTimeout(Duration.ofSeconds(0))
			      .pollingEvery(Duration.ofSeconds(2))
			      .ignoring(NoSuchElementException.class);
			WebElement flagIcon=driver.findElement(By.id("icp-nav-flyout"));
			fl.until(ExpectedConditions.presenceOfElementLocated(By.id("icp-nav-flyout")));
			action.moveToElement(flagIcon).build().perform();
			
			
			
			
			      
			
			
			
			
			
		    driver.close();
		   
		
		
		

	}

}
