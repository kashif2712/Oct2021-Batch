package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicsScripts {

	public static void main(String[] args) throws InterruptedException {
		// Browser / path of the driver
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		// 2.Instance/object of driver pointing toward parent class WebDriver -> Polymorphism
		WebDriver driver =new ChromeDriver();
		
		// maximizing browser size
		
	    driver.manage().window().maximize();
		
		//3. Load application- url
		driver.get("https:\\amazon.com");
		
		// Test Script
		// pause execution- static wait 
		Thread.sleep(1000);
		// for closing browser
		driver.close();
		
		
		
		
        

	}

}
