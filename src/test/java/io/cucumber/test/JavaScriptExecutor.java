package io.cucumber.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils; 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutor {

//	public static void main(String[] args) 
//	 { 
//	   WebDriver driver = new ChromeDriver(); 
//
//	// Maximize the window. 
//	   driver.manage().window().maximize(); 
//
//	// Store the URL of home page in a variable URL of type String. 
//	    String URL = "https://www.google.com"; 
//
//	// Call get() method and pass URL as a parameter. 
//	    driver.get(URL); 
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//
//	// Create the JavascriptExecutor interface object by Type casting of WebDriver instance. 
//	    JavascriptExecutor js = (JavascriptExecutor)driver; 
//
//	// Call executeScript() method to get the title of web page. 
//	     Object title = js.executeScript("return document.title"); // Here, the return type of executeScript() method is object. 
//
//	// Since the return type of executeScript() method is object, we need to perform type casting to get title in String text. 
//	     String getTitle = (String)title; 
//	     System.out.println("Title of Home page: " +getTitle); 
//
//	// The last three lines of code can also be written in one line like this: 
//	// String getTitle = (String)js.executeScript("return document.title"); 
//	   
//	   driver.close(); 
//	  } 
	
	//**************************************************************************************************************************
	
//	public static void main(String[] args) 
//	{ 
//	  WebDriver driver = new ChromeDriver(); 
//	  driver.manage().window().maximize(); 
//	 
//	      String URL = "https://www.google.com"; 
//	// Call get() method and pass URL as a parameter. 
//	     driver.get(URL); 
//	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//
//	// Locate the WebElement Searchbox and submit button of Google home page by By.xpath. 
//	   WebElement search = driver.findElement(By.xpath("//input[@name = 'q']")); 
//	   WebElement submit = driver.findElement(By.xpath("//input[@name = 'btnK']")); 
//
//	// Create the JavascriptExecutor interface object by Type casting of WebDriver instance. 
//	   JavascriptExecutor js = (JavascriptExecutor)driver; 
//
//	// Send a text value "Selenium" using JavascriptExecutor. 
//	   js.executeScript("arguments[0].value = 'Selenium'", search); // Line 1 
//
//	// Click on submit button using JavascriptExecutor. 
//	   js.executeScript("arguments[0].click()", submit); // Line 2 
//
//	// We can write Line 1 and Line 2 code in a single line like this: 
//	// js.executeScript("arguments[0].value = 'Selenium', arguments[1].click()", search, submit); 
//
//	   System.out.println("Test successful"); 
//	   driver.close(); 
//	  } 

	//**************************************************************************************************************************
	
	//scroll webpage down by 1000 pixels vertically.
	
//	public static void main(String[] args) 
//	{ 
//	// Create driver object. 
//	   WebDriver driver = new ChromeDriver(); 
//
//	// Maximizing the window. 
//	   driver.manage().window().maximize(); 
//
//	// Launch the application. 
//	    String url = "https://www.yahoo.com"; 
//	     driver.get(url); 
//
//	// Create the JavascriptExecutor interface object by Type casting of WebDriver instance. 
//	     JavascriptExecutor js = (JavascriptExecutor)driver; 
//
//	// Call scrollBy() method of Javascript using window object with passing number of pixels as parameter values. 
//	// Call executeScript() method of JavascriptExecutor interface with passing window.scrollBy() as parameter value. 
//	      
//	      js.executeScript("window.scrollBy(0,1000)"); // It will scroll down the page by 1000 pixel vertical 
//	  } 


	//**************************************************************************************************************************
	
	//Scroll Down Web Page by visibility of Element
	
//	public static void main(String[] args) 
//	{ 
//	// Create driver object. 
//	     WebDriver driver = new ChromeDriver(); 
//
//	// Maximizing the window. 
//	     driver.manage().window().maximize(); 
//
//	// Launch the application. 
//	     String URL = "https://selenium08.blogspot.com/2020/02/vertical-scroll.html"; 
//	      driver.get(URL); 
//
//	// Locate web element "Health" by By.xpath. 
//	     WebElement element = driver.findElement(By.xpath("//a[text() = 'Health']")); 
//
//	// Create the JavascriptExecutor interface object by Type casting of WebDriver instance. 
//	     JavascriptExecutor js = (JavascriptExecutor)driver; 
//
//	// Call scrollIntoView() method of Javascript using magic variable arguments[0]. 
//	// Call executeScript() method JavascriptExecutor interface with passing arguments[0].scrollIntoView() as parameter values. 
//	    
//	      js.executeScript("arguments[0].scrollIntoView();", element); // It will scroll down the page by visibility of element "Health". 
//	   } 

	//**************************************************************************************************************************
	
	//Scroll Down at the bottom of Web page
	
//	public static void main(String[] args) 
//	{ 
//	// Create driver object. 
//	     WebDriver driver = new ChromeDriver(); 
//
//	// Maximizing the window. 
//	     driver.manage().window().maximize(); 
//
//	// Launch the application. 
//	     String URL = "https://selenium08.blogspot.com/"; driver.get(URL); 
//
//	// Create the JavascriptExecutor interface object by Type casting of WebDriver instance. 
//	     JavascriptExecutor js = (JavascriptExecutor) driver; 
//
//	// Call scrollTo() method of Javascript using window object. 
//	      js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); // It will scroll down until the end of the page .
//	  }

	
	//**************************************************************************************************************************
	
	//scroll web page horizontal
	
//	 public static void main(String[] args) 
//	 { 
//	 // Create web driver object. 
//	      WebDriver driver = new ChromeDriver(); 
//
//	 // Maximizing the window. 
//	      driver.manage().window().maximize(); 
//
//	 // Launch the application. 
//	      String url = "https://selenium08.blogspot.com/2020/02/horizontal-scroll.html"; 
//	       driver.get(url); 
//	      WebElement element = driver.findElement(By.xpath("//a[text() = 'Relationship']")); 
//
//	 // Create the JavascriptExecutor interface object by Type casting of WebDriver instance. 
//	       JavascriptExecutor js = (JavascriptExecutor)driver; 
//
//	 // Call scrollIntoView() method of Javascript using arguments[0]. 
//	       js.executeScript("arguments[0].scrollIntoView();", element); 
//	   } 

	//**************************************************************************************************************************
		
	
//	@Test 
//	public void takeScreenshot() throws IOException 
//	{ 
//	// Create an object of ChromeDriver. 
//	     WebDriver driver = new ChromeDriver(); 
//
//	// Maximizing the browser windows. 
//	     driver.manage().window().maximize(); 
//
//	     String URL = "https://www.facebook.com"; 
//	     driver.get(URL); 
//
//	     WebElement element = driver.findElement(By.xpath("//input[@name='email']")); 
//	       element.sendKeys("Arslan");
//
//	// Convert web driver object into TakeScreenshot. 
//	     TakesScreenshot ts = (TakesScreenshot)driver; 
//
//	// Call getScreenshotAs() method to create image file. 
//	     File scrFile = ts.getScreenshotAs(OutputType.FILE); 
//
//	// Create an object of the file to move the image file to the new destination and pass the file path as an argument. 
//	     File desFile = new File("C:\\Users\\Arslan Shaikh\\Pictures\\Screenshots\\facebook.png"); 
//
//	// Call copyFile() method to save the file at destination. 
//	     FileUtils.copyFile(scrFile, desFile); 
//	      System.out.println("Taking Screenshots"); 
//
//	     driver.close(); 
//	 } 

}
