package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingIframeFragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:jqueryui.com/droppable/");
		
//		WebElement draggableObject= driver.findElement(By.id("draggable"));
		
		List<WebElement> iframes =driver.findElements(By.tagName("iframe"));
		System.out.println("number of iframes: "+ iframes.size());
		
		WebElement singleIframe = iframes.get(0);
//		singleiframe.getText();
		driver.switchTo().frame(singleIframe);
		WebElement draggableObject= driver.findElement(By.id("draggable"));
		WebElement droplocation= driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		
		//#1
//		action.moveToElement(draggableObject).build().perform();
//		action.clickAndHold().build().perform();
//		action.moveToElement(droplocation).build().perform();
//		action.release().build().perform();
//		 
		
		//#2
//		action.clickAndHold(draggableObject).build().perform();
//		action.release(droplocation).build().perform();
		
		//#3
		
//		action.clickAndHold(draggableObject).release(droplocation).build().perform();
		
		
		//#4
		action.dragAndDrop(draggableObject, droplocation).build().perform();
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
	
		
		
		
		

	}

}
