package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementTypesAndLocationStrategy {
	
	
	//   Selenium Automation:
    //1. locate the element (WebElement/WebObject/GUI object or element)
    //2. perform action
    //3. validate the action 
	
	// WebElements or WebObjects or GUI objects or element:
	    // Types
	    //1. Text Box/Field: user can input some characters
	    //2. Button/tab: user input to click on it
	    //3. Radio Button: user input to click to select,"Round button"
	    //4. Check box: user input to click to select, "check mark"
	    //5.Links: click takes user to different page or application
	    //6.Text:to provide informations
        //7.Drop down:clicking on it more options are visible-> Static or Dynamic
	    //8.Menu/Menu link:high value feature/product/flow
	    //9.Pictures/Videos
	// Strategy to locate webElement
	//Types
	    //1.Name:value pointed mostly are unique, most commonly used
	    //2. ID: value pointed mostly are unique, most commonly used
	    //3. linkText: text of the link itself
	    //4. partial linkTest : unique portion of the link
	    //5. calssName: mostly not unique value, mostly not helpful to identify an element alone
	    //6. tagName: generic name, not able to identify an element, but helps to identify group of element
	    //7. Xpath:can be used when nothing works,copy or customizable
	    //8. Css selector: can be used when nothing works, copy or customizable
	
	// understanding DOM:
	//<input type ="text" name="userName" size="10" pb-role="username">
	//1.tagName- input
	//2.value- text/userName/10/userName
	//3.value- text/userName/10/userName
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		//IDentify elements:-> Name and ID
//		WebElement userNameTxtField = driver.findElement(By.name("userName"));
//		userNameTxtField.sendKeys("test");
//		Thread.sleep(3000);
//		driver.findElement(By.name("password"));
//		WebElement passwordTxtField = driver.findElement(By.name("password"));
//		passwordTxtField.sendKeys("123");
//		Thread.sleep(3000);
//		driver.findElement(By.name("submit")).click();
//		
		
		// Creating Verification point
//		String expectedLoginSuccessPageUrl= "https://demo.guru99.com/test/newtours/login_sucess.php";
//		String actualLoginSuccessPageUrl = driver.getCurrentUrl();
//		if(actualLoginSuccessPageUrl.equals(expectedLoginSuccessPageUrl)) {
//			System.out.println("Positive login functionality test: Passed");
//			
//		}else {
//			System.err.println("Positive login functionality test: Failed");
//		}
	
		// handling linktext
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("SIGN-OFF")).click();
//		driver.findElement(By.linkText("REGISTER")).click();
//		String expectedRegisterPageTitle ="Register: Mercury Tours";
//	    String actualRegisterPageTitle = driver.getTitle();
//		if(actualRegisterPageTitle.equals(expectedRegisterPageTitle)) {
//			System.out.println("Register link functionality test: Passed");
			
//		}else
//			System.out.println("Register link functionality test:Failed");
		
		//Using ID strategy
		String productToSearch ="apple";
		WebElement searchTxnField= driver.findElement(By.id("twotabsearchtextbox"));
		searchTxnField.sendKeys("apple");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		String actualProductSearchPageUrl= driver.getCurrentUrl();
		if(actualProductSearchPageUrl.contains(productToSearch)) {
			System.out.println("Search functionality test: Passed");
			
		}else
			System.err.println("Search functionality test: failed");
		
				
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
