package seleniumBasics;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingWebTableAndCalender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
//		
//		WebElement firstofferDestination = driver.findElement(By.xpath("//table[@width='270']/tbody/tr[1]/td[1]/font"));
//		System.out.println(firstofferDestination.getText());
//		WebElement firstofferAmount = driver.findElement(By.xpath("//table[@width='270']/tbody/tr[1]/td[2]/div/font"));
//		System.out.println(firstofferAmount.getText());
//		
//		WebElement secondofferDestination = driver.findElement(By.xpath("//table[@width='270']/tbody/tr[2]/td[1]/font"));
//		System.out.println(secondofferDestination.getText());
//		WebElement secondofferAmount = driver.findElement(By.xpath("//table[@width='270']/tbody/tr[2]/td[2]/div/font"));
//		System.out.println(secondofferAmount.getText());
		
		for(int i=1; i<=5; i++) {
			WebElement offerDestination = driver.findElement(By.xpath("//table[@width='270']/tbody/tr["+i+"]/td[1]/font"));
			WebElement offerAmount =driver.findElement(By.xpath("//table[@width='270']/tbody/tr["+i+"]/td[2]/div/font"));
			System.out.println("OFFER"+i+":");
			System.out.println(offerAmount.getText()+": "+offerAmount.getText());
			
			
			
			
		}
		
		
		for(int i =1; i<7; i++) {
			WebElement menuLinksTable = driver.findElement(By.cssSelector("table[width='110']>tbody>tr>td>table>body"));
			WebElement link = menuLinksTable.findElement(By.cssSelector("tr:nth-child("+i+")>td:nth-child(2)>font>a"));
			String linktxt = link.getText();
			link.click();
			System.out.println("Page Title of "+link.getText()+" :"+driver.getTitle());
			driver.navigate().back();
			}
		
		
		
		driver.close();		
		
		

	}

}
