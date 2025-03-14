package io.cucumber.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	 public static void main(String[] args) 
	 { 
	// Create a driver object for ChromeDriver browser. 
	    WebDriver driver = new ChromeDriver(); 

	// Maximize the web browser. 
	    driver.manage().window().maximize(); 

	// Store the URL in a variable of type String. 
	     String URL = "https://selenium08.blogspot.com/2019/11/selenium-iframe.html"; 

	// Call get() method and pass the URL as a parameter. 
	     driver.get(URL); 

	// Wait for some time to load web page completely. 
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

	// Locate the total number of iframes on the web page. 
	     int iFrameSize = driver.findElements(By.tagName("iframe")).size(); 
	     System.out.println("Toal no of iframes: " +iFrameSize); 

	// Locate the first iframe and switch driver to first iframe by index value 0. 
	     driver.switchTo().frame(0); 
	     driver.findElement(By.xpath("//input[@itemprop = 'query-input']")).sendKeys("Selenium Jobs"); 
	     driver.findElement(By.xpath("//button[@class = 'wpb_button wpb_btn-inverse btn']")).click(); 

	// Now, switch to main web page from iframe by using defaultContent() method. 
	     driver.switchTo().defaultContent(); 

	// Closing first frame. 
	     String getTitleOfMain = driver.getTitle(); 
	     System.out.println("Title of main web page: " +getTitleOfMain); 
	   
	     String mainPageURL = driver.getCurrentUrl(); 
	     System.out.println("URL of main web page: " +mainPageURL); 

	   
	      driver.quit(); 
	  } 

	//**************************************************************************************************************************
			 
	 
//	 public static void main(String[] args) 
//	 { 
//	 // Create a driver object for ChromeDriver browser.
//	     WebDriver driver = new ChromeDriver(); 
//
//	 // Maximize the web browser. 
//	     driver.manage().window().maximize(); 
//
//	 // Store the URL in a variable of type String. 
//	      String URL = "https://selenium08.blogspot.com/2019/11/selenium-iframe.html"; 
//
//	 // Call get() method and pass the URL as a parameter. 
//	      driver.get(URL); 
//
//	 // Wait for some time to load web page completely. 
//	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//
//	 // Locate iframe and switch driver context to first iframe by value of name attribute. 
//	      System.out.println("Switching to first frame from main web page"); 
//	      driver.switchTo().frame("iframe_a"); 
//	    
//	      driver.findElement(By.xpath("//input[@itemprop = 'query-input']")).sendKeys("Selenium Jobs"); 
//	      driver.findElement(By.xpath("//button[@class = 'wpb_button wpb_btn-inverse btn']")).click(); 
//
//	 // Switch to main web page from iframe by using defaultContent() method. 
//	      System.out.println("Switching to main web page from first frame"); 
//	      driver.switchTo().defaultContent(); 
//
//	 // Click on link text. 
//	      driver.findElement(By.xpath("//a[text() = 'Freshers Now']")).click(); 
//	      System.out.println("Clicked on link text successfully."); 
//	    
//	      driver.quit(); 
//	   } 

	//**************************************************************************************************************************
		 
	 
//	 public static void main(String[] args) 
//	 { 
//	   WebDriver driver = new ChromeDriver(); 
//	   driver.manage().window().maximize(); 
//	  
//	   String URL = "https://selenium08.blogspot.com/2019/11/selenium-iframe.html"; 
//	   driver.get(URL); 
//	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//
//	// Locate second frame (Naukri) by WebElement. 
//	    WebElement frameElement = driver.findElement(By.name("iframe_b")); // Here, frame is located by using name attribute. 
//	    System.out.println("Switching to second frame from main web page"); 
//	    driver.switchTo().frame(frameElement); // Passing frameElement as an input parameter to frame(). 
//
//	// After switching to the frame, locate element CREATE JOB ALERT By.xpath. 
//	     WebElement jobAlert = driver.findElement(By.xpath("//a[text() = 'CREATE JOB ALERT' ]")); 
//	      jobAlert.click(); 
//
//	// Switch to main web page from iframe by using defaultContent() method. 
//	     System.out.println("Switching to main web page from second frame"); 
//	     driver.switchTo().defaultContent(); 
//	   
//	     driver.quit(); 
//	  } 

}
