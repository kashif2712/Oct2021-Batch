package seleniumBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		
		 Actions action = new Actions(driver);
			WebElement accountList =driver.findElement(By.id("nav-link-accountList"));
			

			action.moveToElement(accountList).build().perform();
			
			File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot1,new File("C:/Users/SkyWalker/eclipse-workspace/MyFirstProgram/src/seleniumBasics/screenshot1.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		

		WebDriverWait explicitWait = new WebDriverWait(driver,30);
		WebElement primeMenuOption = driver.findElement(By.id("nav-link-amazonprime"));
	    explicitWait.until(ExpectedConditions.visibilityOf(primeMenuOption));
	    explicitWait.until(ExpectedConditions.elementToBeClickable(primeMenuOption));
		action.moveToElement(primeMenuOption).build().perform();
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
