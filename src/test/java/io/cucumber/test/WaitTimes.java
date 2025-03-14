package io.cucumber.test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class WaitTimes {

	protected WebDriver driver;
	
	//**************************************************************************************************************
	@Test
	public void guru99tutorials() throws InterruptedException 
	{
	driver = new ChromeDriver(); 
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES) ;
	String eTitle = "WebstaurantStore: Restaurant Supplies & Foodservice Equipment";
	String aTitle = "" ;
	// launch Chrome and redirect it to the Base URL
	driver.get("https://www.webstaurantstore.com/" );
	//Maximizes the browser window
	driver.manage().window().maximize() ;
	//get the actual value of the title
	aTitle = driver.getTitle();
	//compare the actual title with the expected title
	if (aTitle.equals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
	}
	//close browser
	driver.close();
	}
	
	//**************************************************************************************************************
	
//	@Test
//	public void guru99tutorials() throws InterruptedException 
//	{
//	driver = new ChromeDriver(); 
//	WebDriverWait wait=new WebDriverWait(driver, 20);
//	String eTitle = "WebstaurantStore: Restaurant Supplies & Foodservice Equipment";
//	String aTitle = "" ;
//	// launch Chrome and redirect it to the Base URL
//	driver.get("https://www.webstaurantstore.com/" );
//	//Maximizes the browser window
//	driver.manage().window().maximize() ;
//	//get the actual value of the title
//	aTitle = driver.getTitle();
//	//compare the actual title with the expected title
//	if (aTitle.contentEquals(eTitle))
//	{
//	System.out.println( "Test Passed") ;
//	}
//	else {
//	System.out.println( "Test Failed" );
//	}
//	WebElement register;
//	register= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//*[text()='Register']")));
//	register.click();
//	}

	//**************************************************************************************************************
	
//	@Test
//	public void guru99tutorials() throws InterruptedException 
//	{
//	String eTitle = "WebstaurantStore: Restaurant Supplies & Foodservice Equipment";
//	String aTitle = "" ;
//	driver = new ChromeDriver();
//	// launch Chrome and redirect it to the Base URL
//	driver.get("https://www.webstaurantstore.com/" );
//	//Maximizes the browser window
//	driver.manage().window().maximize() ;
//	//get the actual value of the title
//	aTitle = driver.getTitle();
//	//compare the actual title with the expected title
//	if (aTitle.contentEquals(eTitle))
//	{
//	System.out.println( "Test Passed") ;
//	}
//	else {
//	System.out.println( "Test Failed" );
//		}
//	
//	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
//			.withTimeout(Duration.ofSeconds(30)) 			
//			.pollingEvery(Duration.ofSeconds(5)) 			
//			.ignoring(NoSuchElementException.class);
//	WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
//	
//		public WebElement apply(WebDriver driver ) {
//			return driver.findElement(By.xpath("//*[text()='Register']"));
//		}
//	});
//	//click on the selenium link
//	clickseleniumlink.click();
//	//close browser
//	driver.close() ;
//	}


}
