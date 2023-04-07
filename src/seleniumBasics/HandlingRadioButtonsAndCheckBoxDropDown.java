package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingRadioButtonsAndCheckBoxDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.ebay.com");
//		driver.findElement(By.linkText("register")).click();	
//		//Handle Radio Button
//		WebElement businessAccountRadioBtn=driver.findElement(By.id("businessAccount-radio"));
//		WebElement personalAccountRadioBtn=driver.findElement(By.id("personalAccount-radio"));
//		
//		
//		Thread.sleep(3000);
//		businessAccountRadioBtn.click();
//		Thread.sleep(3000);
//		personalAccountRadioBtn.click();
//		driver.findElement(By.id("personalAccount-radio")).click();
//
//		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
//		driver.findElement(By.linkText("Flights")).click();
//		
//		//copying Xpath
//		
//	    WebElement onewayTrip = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]"
//	    		+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
//	
//	   //copying Css selector
//	    WebElement roundTrip = driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2)"
//	    		+ " > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5)"
//	    		+ " > td > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > b > font > input[type=radio]:nth-child(1)"));
//	    Thread.sleep(3000);
//	    onewayTrip.click();
//	    Thread.sleep(3000);
//	    roundTrip.click();
	    
		driver.get("https://amazon.com");
		
//		driver.findElement(By.id("icp-nav-flyout")).click();
//		
//		WebElement spanishRadioBtn = driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[3]/div/label/i"));
//		
//		WebElement englishRadioBtn = driver.findElement(By.cssSelector("#icp-language-settings > div:nth-child(4) > div > label > i"));
//		Thread.sleep(3000);
//		spanishRadioBtn .click();	
//		if(spanishRadioBtn.isSelected()) {
//			System.out.println("Spanish Radio Button test functionality, selected:passed");
//		}else {
//			System.err.println("Spanish Radio Button test functionality, selected:Failed");
//		}
//		Thread.sleep(3000);
//		englishRadioBtn.click();
//		if(englishRadioBtn.isSelected()) {
//			System.out.println("English Radio Button test functionality, selected:Passed");
//			
//		}else {
//			System.err.println("English Radio Button test functionality, selected:Failed");
//		}
//			
			
		
		//Handling CheckBox
//		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
//		driver.findElement(By.cssSelector("#ap_email")).sendKeys("test@gmail.com");
//		
//		driver.findElement(By.id("continue")).click();
//		
//		
//		WebElement remememberMeCheckBx = driver.findElement(By.name("rememberMe"));
//		Thread.sleep(3000);
//		remememberMeCheckBx.click();
//		if(remememberMeCheckBx.isSelected()) {
//			System.out.println("Remember me check box test functionality, selected:passed");
//			
//			
//		}else {
//			System.err.println("Remember me check box test functionality, selected:failed");
//	}
//	
//	Thread.sleep(3000);
//	remememberMeCheckBx.click();
//	if(remememberMeCheckBx.isSelected()) {
//		System.out.println("Remember me check box test functionality, deselected: Passed");
//	}else {
//		System.err.println("Remember me check box test functionality, deselected: Failed");
//		
//	
//}
	
	
	
	    //Handling Drop Down
//	    driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div[1]/div/a/i")).click();
	    WebElement allDropDown= driver.findElement(By.id("searchDropdownBox"));
	    Select select = new Select(allDropDown);
//		Thread.sleep(3000);
//		//a.visible txt
//	    select.selectByVisibleText("Amazon Devices");
//		Thread.sleep(3000);
//	    select.selectByVisibleText("AWS Courses");
//	    
//	    //b. index
//	    Thread.sleep(3000);
//	    select.selectByIndex(7);
//	    Thread.sleep(3000);
//	    select.selectByIndex(8);
//	    
//	    //c.value of option
//	    Thread.sleep(3000);
//	    select.selectByValue("search-alias=financial");
//	    Thread.sleep(3000);
//	    select.selectByValue("search-alias=gift-cards");
	    
	    for(int i=0; i<=20; i++) {
	    	select.selectByIndex(i);
	    	Thread.sleep(1000);
	    	
	    	
	    }
	    
	    
	    
	    
	    
		Thread.sleep(3000);
		driver.close();
		

	}

}
