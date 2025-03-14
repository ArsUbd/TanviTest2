package io.cucumber.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandelingAlerts {

	public static void main(String[] args) 
	{ 
	// Create an object of ChromeDriver class. 
		String chromeDriverPath= System.getProperty("user.dir")+ "/Drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
	   WebDriver driver = new ChromeDriver(); 
	   String URL="https://selenium08.blogspot.com/2019/07/alert-test.html"; 
	  
	   driver.get(URL); driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	   driver.manage().window().maximize(); 

	// Click on simple alert button to show alert box. 
	   WebElement element = driver.findElement(By.xpath("//input[@id='simple']")); 
	    element.click(); 

	// Switching to Alert from webpage. 
	     Alert alert = driver.switchTo().alert(); 

	// Get or read the text displayed on Alert popup and save it in a string using variable "getText" in order to print it later. 
	     String getText = driver.switchTo().alert().getText(); 
	     System.out.println(getText); 

	// Check that the correct message is displayed to the user Alert box. 
	     if(getText.equalsIgnoreCase("Hello! I am a simple alert box!")) 
	     { 
	// Display a message that indicates whether verification was successful. 
	      System.out.println("It worked, the expected simple alert was shown"); 
	       } 
	     else 
	     { 
	         System.out.println("Something went wrong, expected simple alert was not shown"); 
	       } 
	// Click OK button, by calling accept() method. 
	      alert.accept(); 
	 //     driver.close(); 
	  } 

	
	//******************************************************************************************************************************************
		
	
	
	
	
	
	
//	public static void main(String[] args) 
//	 { 
//	  WebDriver driver = new ChromeDriver(); 
//	  String URL = "https://selenium08.blogspot.com/2019/07/alert-test.html"; 
//	  
//	  driver.get(URL); 
//	  driver.manage().window().maximize(); 
//	 
//	  WebElement element = driver.findElement(By.xpath("//button[@id='confirm']")); 
//	    element.click(); 
//
//	// Switching to alert from web page. 
//	    Alert alert = driver.switchTo().alert(); 
//	    String getText = driver.switchTo().alert().getText(); 
//	    System.out.println(getText); 
//	 
//	 if(getText.equalsIgnoreCase("This is a confirm alert. Do you want to accept or cancel?")) 
//	 { 
//	   alert.accept(); 
//	   System.out.println("You accepted alert"); 
//	  } 
//	 else 
//	 { 
//	    alert.dismiss(); 
//	    System.out.println("You dismissed alert"); 
//	  } 
//	 driver.close(); 
//	  } 

	//******************************************************************************************************************************************
	
	
//	public static void main(String[] args) 
//	{ 
//		String chromeDriverPath= System.getProperty("user.dir")+ "/Drivers/chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//	   
//	  WebDriver driver = new ChromeDriver(); 
//	  String URL = "https://selenium08.blogspot.com/2019/07/alert-test.html"; 
//	  driver.get(URL); 
//	  driver.manage().window().maximize(); 
//
//	// Click on confirm button to show prompt alert box. 
//	    WebElement element = driver.findElement(By.xpath("//button[@id='prompt']")); 
//	     element.click(); 
//
//	// Switching to alert from web page. 
//	    Alert alert = driver.switchTo().alert(); 
//
//	// Enter some text on prompt alert box. 
//	     alert.sendKeys("Deep"); 
//	     alert.accept(); 
//
//	// Check webpage displays message with text entered in prompt box. 
//	     WebElement displayMessage = driver.findElement(By.id("prompt_demo")); 
//	     String getText = displayMessage.getText(); 
//	     System.out.println(getText); 
//	 
//	  if(getText.equalsIgnoreCase("Hello Deep! How are you today?"))
//	  { 
//	      System.out.println("Exact matched"); 
//	  }
//	  else { 
//	     System.out.println("Something went wrong"); 
//	   } 
//	    driver.close(); 
//	  } 

	
}
