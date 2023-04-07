package seleniumBasics;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandlingWindows {

	public static void main(String[] args)  throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		String parentWindowHandle =driver.getWindowHandle();
		System.out.println("Parent window handle: "+parentWindowHandle);
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click Here")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		String oldWindowHandle = driver.getWindowHandle();
		System.out.println("Old Window handle: "+oldWindowHandle);
		System.out.println("Still in old window? "+(parentWindowHandle.equals(oldWindowHandle)));
		
		Set<String> handles= driver.getWindowHandles(); // ->return set of window handle of all window
		System.out.println("Number of window opened: "+handles.size());
		
        Iterator<String> it =handles.iterator();
//		String window1Handle= it.next();
//		String window2Handle= it.next();
//		String window3Handle= it.next();
//		
//	    System.out.println(window1Handle.equals(parentWindowHandle));
//	    System.out.println(window1Handle.equals(oldWindowHandle));
//	    
//		


		
//		driver.switchTo().window(window2Handle);
//		System.out.println("Title of window 2: "+driver.getTitle());
//		Thread.sleep(3000);
//		driver.close();
//		
//		driver.switchTo().window(window3Handle);
//		System.out.println("Title of window 3: "+driver.getTitle());
//		Thread.sleep(3000);
//		driver.close();
//		
//		driver.switchTo().window(window1Handle);
//		System.out.println("Title of window 1: "+driver.getTitle());
//		Thread.sleep(3000);
//		driver.close();
	    
	    while(it.hasNext()) {
	    	String handle= it.next();
	    	driver.switchTo().window(handle);
	    	System.out.println(driver.getTitle());
	    	System.out.println(driver.getCurrentUrl());
	    	driver.close();
	    }
	
		
		
		
		
		
//		Thread.sleep(3000);
//		driver.close();
//		driver.quit();
		
		
		
		

	}

}
