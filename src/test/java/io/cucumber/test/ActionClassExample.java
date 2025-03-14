package io.cucumber.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionClassExample {

//	public static void main(String[] args) 
//	 { 
//	   WebDriver driver = new ChromeDriver(); 
//	   Actions actions = new Actions(driver); 
//	    actions.
//	  } 

	
	//******************************************************************************************************************************************
		
	
	
	
	
	
	//Click at Current Location
	
//	public static void main(String[] args) 
//	{ 
//	// Create a driver object of ChromeDriver browser.
//		String chromeDriverPath= System.getProperty("user.dir")+ "/Drivers/chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//	     WebDriver driver = new ChromeDriver(); 
//
//	// Maximize the browser. 
//	    driver.manage().window().maximize(); 
//
//	// Create a variable URL to store the URL of Google home page. 
//	// Since the return type of URL is String, we will declare URL as String type. 
//	     String URL = "https://www.google.com"; 
//
//	// Call get() method of WebDriver and pass URL as a parameter. 
//	     driver.get(URL); 
//
//	// Wait for some time to load. 
//	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//
//	// Locate the element “Gmail” by By.xpath. 
//	     WebElement Gmail = driver.findElement(By.xpath("//a[text()='Gmail']")); 
//
//	// Create an object of Actions class and pass reference variable driver as a parameter to its constructor. 
//	     Actions actions = new Actions(driver); 
//
//	// Get the location and Coordinate (x, y) of WebElement “gmail”. Call getLocation(), getX(), and getY() methods to find the location and coordinate. 
//	     int getX = Gmail.getLocation().getX(); 
//	     System.out.println("X coordinate: " +getX); 
//	     int getY = Gmail.getLocation().getY(); 
//	     System.out.println("Y coordinate: " +getY); 
//
//	// Call moveByOffset() method of Actions class to move the mouse cursor from initial position to given Offset. 
//	// Pass the coordinates of x and y as parameters to moveByOffset() method. 
//	     actions.moveByOffset(getX, getY).click(); 
//	     actions.perform(); 
//	  
//	     System.out.println("Clicked Successfully on Gmail"); 
//	     driver.close(); 
//	  } 

	//******************************************************************************************************************************************
		
	
	//Click on WebElement 
//	public static void main(String[] args) 
//	 { 
//	// Create a driver object of ChromeDriver browser. 
//	     WebDriver driver = new ChromeDriver(); 
//
//	// Maximize the browser. 
//	     driver.manage().window().maximize(); 
//
//	// Create a variable URL to store the URL of Google home page. Since the return type of URL is String, we will declare URL as String type. 
//	     String URL = "https://www.google.com"; 
//
//	// Call get() method of WebDriver and pass URL as a parameter. 
//	     driver.get(URL); 
//
//	// Wait for some time to load. 
//	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//
//	// Locate the element “Gmail” by By.xpath. 
//	     WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']")); 
//
//	// Create an object of Actions class and pass reference variable driver as a parameter to its constructor. 
//	     Actions actions = new Actions(driver); 
//	     actions.click(gmail); 
//	     actions.perform(); 
//	    
//	     System.out.println("Clicked Successfully on Gmail"); 
//	     driver.close(); 
//	  } 

	//******************************************************************************************************************************************
		
	
	
	//Double Click Action 
	
	public static void main(String[] args) 
	{ 
	// Create a driver object for ChromeDriver browser. 
		String chromeDriverPath= System.getProperty("user.dir")+ "/Drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
	   
	    WebDriver driver = new ChromeDriver(); 

	// Maximize web browser. 
	   driver.manage().window().maximize(); 

	// Store URL in a variable URL of String type. 
	   String url = "https://selenium08.blogspot.com/2019/11/double-click.html"; 

	// Call get() method and pass the URL as an input parameter. 
	   driver.get(url); 

	// Wait for loading complete web page. 
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

	// Locate WebElement by using By.xpath. 
	    WebElement dblclick = driver.findElement(By.xpath("//button[text() = 'Double-Click me to see Alert message']")); 

	// Create an object of Actions class and pass the driver as an parameter. 
	   Actions actions = new Actions(driver); 

	// Call moveToElement() method to move the mouse to the location of button element and pass element as an input parameter. 
	   actions.moveToElement(dblclick); // Line 1. 

	// Call doubleClick() method to peform the double-click action at current location. 
	    actions.doubleClick(); // Line 2. 

	// Call perform() method to perform a sequence of actions. 
	   actions.perform(); //Line 3. 

	// The Line 1, Line 2, and Line 3 can also be written in a single line like this: 
	// actions.moveToElement(dblclick).doubleClick().perform(); 

	  System.out.println("Double click action performed successfully at current location"); 
	  } 

	
	//******************************************************************************************************************************************
	
	
	
	//Performing Double-click on WebElement
	
//	public static void main(String[] args) 
//	 { 
//	// Create a driver object for ChromeDriver browser. 
//	   WebDriver driver = new ChromeDriver(); 
//
//	// Maximize web browser. 
//	   driver.manage().window().maximize(); 
//
//	// Store URL in a variable URL of String type. 
//	   String url="https://selenium08.blogspot.com/2019/11/double-click.html"; 
//
//	// Call get() method and pass the URL as an input parameter. 
//	   driver.get(url); 
//
//	// Wait for loading complete web page. 
//	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//
//	// Locate WebElement by using By.xpath. 
//	   WebElement dblclick = driver.findElement(By.xpath("//button[text() = 'Double-Click me to see Alert message']")); 
//
//	// Create an object of Actions class and pass the driver as an parameter. 
//	   Actions actions = new Actions(driver); 
//
//	// Call doubleClick() method to peform the double-click action at current location. 
//	   actions.doubleClick(dblclick); // Line 2. 
//
//	// Call perform() method to perform a sequence of actions. 
//	   actions.perform(); //Line 3. 
//
//	// The Line 1, Line 2, and Line 3 can also be written in a single line like this: 
//	// actions.doubleClick(dblclick).perform();
//	    
//	    System.out.println("Double click action performed successfully on an element"); 
//
//	// Switching to Alert from web page. 
//	   Alert alert = driver.switchTo().alert(); 
//
//	// Capture the text displayed on pop up and save it in a variable getText of type String. 
//	   String getText = alert.getText(); 
//	   System.out.println("Alert text: " +getText); 
//
//	// Click on OK button. 
//	   alert.accept(); 
//	  } 
	
	
	
	//******************************************************************************************************************************************
		
	
	
	//Right Click on WebElement 
	
//	public static void main(String[] args) 
//	{ 
//	// Create a driver object to launch ChromeDriver browser. 
//	   WebDriver driver = new ChromeDriver(); 
//
//	// Maximize the browser. 
//	   driver.manage().window().maximize(); 
//
//	// Create a variable URL of String type to store the URL. 
//	     String url = "https://selenium08.blogspot.com/2019/12/right-click.html"; 
//
//	// Call get() method of WebDriver and pass URL as a parameter. 
//	     driver.get(url); 
//
//	// Wait for some time to load web page. 
//	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//
//	// Locate the WebElement by By.xpath. 
//	   WebElement contextMenu = driver.findElement(By.xpath("//div[@id = 'div-context']")); 
//
//	// Create an object of Actions class and pass reference variable driver as a parameter to its constructor. 
//	     Actions actions = new Actions(driver); 
//	      actions.contextClick(contextMenu); 
//
//	// Locate an element "Python" by By.xpath in the context menu. 
//	     WebElement python = driver.findElement(By.xpath("//a[text() = 'Python']")); 
//
//	// Call click(WebElement) method and pass element as an input parameter. 
//	     actions.click( python ); 
//	     actions.perform(); 
//	    System.out.println("Right-clicked Successfully on Context menu"); 
//
//	// Switch to alert pop-up from web page by using below syntax. 
//	   Alert alert = driver.switchTo().alert(); 
//
//	// Get text displayed on pop-up. 
//	   String getText = alert.getText(); 
//	   System.out.println("Displayed Text on pop-up: " +getText); 
//
//	// Call accept() method of alert interface to click OK button to accept pop-up. 
//	     alert.accept(); 
//	     driver.close(); 
//	   } 
	//******************************************************************************************************************************************
	
	
	//context click at Current Location 
	
//	public static void main(String[] args) 
//	{ 
//	 WebDriver driver = new ChromeDriver(); 
//	 driver.manage().window().maximize();
//	 
//	// Create a variable URL of String type to store the URL. 
//	   String url = "https://selenium08.blogspot.com/2019/12/right-click.html"; 
//
//	// Call get() method of WebDriver and pass URL as a parameter. 
//	   driver.get(url); 
//	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//
//	// Locate the WebElement by By.xpath. 
//	   WebElement contextMenu = driver.findElement(By.xpath("//div[@id = 'div-context']")); 
//
//	// Create an object of Actions class and pass reference variable driver as a parameter to its constructor. 
//	   Actions actions = new Actions(driver); 
//
//	// Call moveToElement() method to move the mouse cursor from initial position (0,0) to element contextMenu. 
//	    actions.moveToElement(contextMenu); // Passing contextMenu as an parameter. 
//	    actions.contextClick(); // Calling contextClick() method to right click on context menu. 
//
//	// Locate an element "Java" by By.xpath in the context menu. 
//	    WebElement java = driver.findElement(By.xpath("//a[text() = 'Java']")); 
//
//	// Call click(WebElement) method and pass element as an input parameter. 
//	   actions.click( java ); 
//	   actions.perform(); 
//	  System.out.println("Right-clicked Successfully on Context menu"); 
//
//	// Switch to alert pop-up from web page by using below syntax. 
//	   Alert alert = driver.switchTo().alert(); 
//
//	// Get text displayed on pop-up. 
//	   String getText = alert.getText(); 
//	   System.out.println("Displayed Text on pop-up: " +getText); 
//
//	// Call accept() method of alert interface to click OK button to accept pop-up. 
//	   alert.accept(); 
//	   driver.close(); 
//	  }
	//******************************************************************************************************************************************
	
	
	//Click and Hold 
	
//	public static void main(String[] args) 
//	 { 
//	   WebDriver driver = new ChromeDriver(); 
//	   driver.manage().window().maximize(); 
//	   
//	   String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html"; 
//	   driver.get(url); 
//
//	// Locate the element C by By.xpath. 
//	     WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']")); 
//
//	// Create an object of actions class and pass reference of WebDriver as a parameter to its constructor. 
//	     Actions actions = new Actions(driver); 
//
//	// Move the cursor to the position of element C. 
//	     actions.moveToElement(titleC); // Call clickAndHold() method to perform click and hold operation. 
//	     actions.clickAndHold().perform(); 
//	  } 

	//******************************************************************************************************************************************
		
	//Perform Click and Hold WebElement Action 
	
//	public static void main(String[] args) 
//	{ 
//	  WebDriver driver = new ChromeDriver(); 
//	  driver.manage().window().maximize(); 
//	 
//	  String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html"; 
//	  driver.get(url); 
//
//	// Locate the element C by By.xpath. 
//	     WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']")); 
//
//	// Create an object of actions class and pass reference of WebDriver as a parameter to its constructor. 
//	     Actions actions = new Actions(driver); 
//
//	// Call clickAndHold() method to perform click and hold operation on element C. 
//	     actions.clickAndHold(titleC).perform(); 
//	  } 

	//******************************************************************************************************************************************
	
	
	
	//Move to Element and Click 
	
//	public static void main(String[] args) 
//	{ 
//	 WebDriver driver = new ChromeDriver(); 
//	 driver.manage().window().maximize(); 
//	 
//	  String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html"; 
//	   driver.get(url); 
//
//	// Locate the element A by By.xpath. 
//	  WebElement titleA = driver.findElement(By.xpath("//li[text()= 'A']")); 
//	  WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']")); 
//
//	// Create an object of actions class and pass reference of WebDriver as a parameter to its constructor. 
//	   Actions actions = new Actions(driver); 
//
//	// Call moveToElement() method of actions class to move mouse cursor to a WebElement A. 
//	   actions.moveToElement(titleA); 
//	   actions.clickAndHold(); 
//	   
//	   actions.moveToElement(titleC); 
//	   actions.release().perform(); 
//	  } 

	//******************************************************************************************************************************************
	
	
	//Drag and Drop Action 
	
//	public static void main(String[] args) 
//	{ 
//	  WebDriver driver = new ChromeDriver(); 
//	  driver.manage().window().maximize(); 
//	 
//	   String URL = "https://selenium08.blogspot.com/2020/01/drag-me.html"; 
//	   driver.get(URL); 
//
//	// Locate WebElements by By.id. 
//	   WebElement src = driver.findElement(By.id("draggable")); 
//
//	// Create an object of Actions class and pass the driver object reference to its constructor. 
//	   Actions actions = new Actions(driver); 
//
//	// Call dragAndDropBy() method of actions class. 
//	     actions.dragAndDropBy(src, 200, 150); 
//	     actions.perform(); 
//	  } 

	//******************************************************************************************************************************************
		
	
}
