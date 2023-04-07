package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertAndWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("test");
		driver.findElement(By.name("submit")).click();
		
		String alert1= driver.switchTo().alert().getText();
		System.out.println(alert1);
//		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		
		String alert2 =driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		 
		
		driver.findElement(By.name("res")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
