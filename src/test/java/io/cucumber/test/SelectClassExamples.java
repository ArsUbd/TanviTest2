package io.cucumber.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassExamples {

	//******************************************************************************************************************************************
	
//	public static void main(String[] args) 
//	 { 
//	   WebDriver driver = new ChromeDriver(); 
//	   WebElement element = driver.findElement(By.xpath("//select[@name='country']")); 
//	   Select select = new Select(element); 
//	   select.
//	  } 
//	
	
	//******************************************************************************************************************************************
	
//	public static void main(String[] args) 
//	{ 
//	// Create a driver object of class by using reference of WebDriver. 
//	    WebDriver driver = new ChromeDriver(); 
//
//	// Maximize the browser. 
//	    driver.manage().window().maximize(); 
//
//	// Declare a variable URL of type String and store the URL. 
//	     String URL = "https://selenium08.blogspot.com/2019/11/dropdown.html"; 
//
//	// Call get() method to open the web page URL and pass URL as a parameter. 
//	     driver.get(URL); 
//
//	// Wait for some time to load the whole web page. 
//	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//
//	// Locate dropdown element on web page by By.xpath. 
//	    WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']")); 
//
//	// Verify the dropdown is enabled and visible. 
//	   if(dropdown.isEnabled() && dropdown.isDisplayed()) 
//	   { 
//	      System.out.println("Dropdown is enabled and visible"); 
//	   } 
//	  else { 
//	      System.out.println("Dropdown is not visible"); 
//	  } 
//	// Create an object of Select class and pass the dropdown of type WebElement as an argument. 
//	    Select select = new Select(driver.findElement(By.xpath("//select[@name='country']"))); 
//
//	// Verify that dropdown does not allow the multiple selections. 
//	   if(select.isMultiple()) 
//	   { 
//	      System.out.println("Dropdown list accepts multiple choices"); 
//	   } 
//	  else { 
//	     System.out.println("Dropdown list does not accept multiple choices"); 
//	  } 
//	// Call getOptions() method to get all options of list. size() method is used to get size of list. 
//	   int listSize = select.getOptions().size(); 
//	   System.out.println("List size: " +listSize); 
//
//	// Select the option "India" by sending visible text. 
//	   select.selectByVisibleText("India"); 
//
//	// Check that "India" is selected as an option or not. 
//	// Use System.out.println method to display a message to indicate whether the option is chosen and verification was successful or not. 
//	     String getText = select.getFirstSelectedOption().getText(); 
//	     System.out.println("Option chosen: " +getText); 
//
//	// Close the browser. 
//	     driver.close(); 
//	  } 
	
	
	//*******************************************************************************************************************************************
	
//	public static void main(String[] args) 
//	 { 
//	   WebDriver driver = new ChromeDriver(); 
//	   driver.manage().window().maximize(); 
//	   String URL = "https://selenium08.blogspot.com/2019/11/dropdown.html"; 
//	   driver.get(URL); 
//
//	// Wait for some time to load the whole web page. 
//	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//
//	// Locate dropdown element on web page by By.xpath. 
//	     WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']")); 
//
//	// Create an object of Select class and pass the dropdown of type WebElement as an argument. 
//	     Select select = new Select(dropdown); 
//
//	// Select the option "USA" by sending its value attribute. 
//	     select.selectByValue("US"); 
//	     System.out.println("Option is successfully selected"); 
//
//	// Close the browser. 
//	 //    driver.close(); 
//	  } 
	
	
	//******************************************************************************************************************************************
	
//	public static void main(String[] args) 
//	 { 
//	  WebDriver driver; 
//	   driver = new ChromeDriver(); 
//	   driver.manage().window().maximize(); 
//	   String URL = "https://selenium08.blogspot.com/2019/11/dropdown.html"; 
//	   driver.get(URL); 
//
//	// Wait for some time to load the whole web page. 
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//
//	// Locate dropdown element on web page by By.xpath. 
//	    WebElement dropdown = driver.findElement(By.xpath("//select[@name='Month']")); 
//
//	// Create an object of Select class and pass the dropdown of type WebElement as an argument. 
//	    Select multiplechoicelist = new Select(dropdown); 
//
//	// Verify that dropdown allows the multiple-choice list or not. 
//	  if(multiplechoicelist.isMultiple())
//	  { 
//	     System.out.println( "Dropdown allows multiple-choice list"); 
//	  } 
//	 else { 
//	    System.out.println("Dropdown does not allow multiple-choice"); 
//	 } 
//	// Now select the different choice by using visible text. 
//	    multiplechoicelist.selectByVisibleText("July"); 
//	    multiplechoicelist.selectByVisibleText("May"); 
//	    multiplechoicelist.selectByVisibleText("March"); 
//
//	// Verify that the number of choices in the list selected. 
//	  if(multiplechoicelist.getAllSelectedOptions().size() == 3) 
//	  { 
//	     System.out.println("3 options have been chosen"); 
//	  } 
//	 else { 
//	    System.out.println("Code not worked"); 
//	  } 
//	//  driver.close(); 
//	  } 
	
	
	//******************************************************************************************************************************************
	
//	public static void main(String[] args) 
//	{ 
//	 WebDriver driver; 
//	 driver = new ChromeDriver(); 
//	 driver.manage().window().maximize(); 
//	 String URL = "https://selenium08.blogspot.com/2019/11/dropdown.html"; 
//	 driver.get(URL); 
//
//	// Wait for some time to load the whole web page. 
//	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//
//	// Locate dropdown element on web page by By.xpath. 
//	  WebElement dropdown = driver.findElement(By.xpath("//select[@name='Month']")); 
//
//	// Create an object of Select class and pass the dropdown of type WebElement as an argument. 
//	   Select multiplechoicelist = new Select(dropdown); 
//
//	// Verify that dropdown allows the multiple-choice list or not. 
//	  if(multiplechoicelist.isMultiple())
//	  { 
//	    System.out.println( "Dropdown allows multiple-choice list"); 
//	  } 
//	 else { 
//	    System.out.println("Dropdown does not allow multiple-choice"); 
//	  } 
//	// If multiple-choice allow, select the different choice by sending visible texts. 
//	   multiplechoicelist.selectByVisibleText("July"); 
//	   multiplechoicelist.selectByVisibleText("May"); 
//	   multiplechoicelist.selectByVisibleText("March"); 
//
//	// Verify that the number of choices in the list selected. 
//	  if(multiplechoicelist.getAllSelectedOptions().size() == 3) 
//	  { 
//	    System.out.println("3 options have been chosen:"); 
//	  } 
//	else { 
//	  System.out.println("Code not worked"); 
//	 } 
//	// Create a List. For this, create an object of ArrayList class by using the reference of List interface. 
//	    List<String> expectedSelection = new ArrayList<String>(); 
//
//	// Call add() method of List to add expected elements for selection. 
//	    expectedSelection.add("July"); 
//	    expectedSelection.add("May"); 
//	    expectedSelection.add("March"); 
//
//	// Iterating WebElement by using the advanced for loop to retrieve the actually selected elements and then add selected elements in the list using add() method. 
//	   List<String> actualSelection = new ArrayList<String>(); 
//	   for(WebElement element : multiplechoicelist.getAllSelectedOptions()) 
//	   { 
//	     actualSelection.add(element.getText()); // Here, getText() method of WebElement class has been used to add the text label of all the options in the list.
//	   } 
//	// Now compare actualSelection with expectedSelection by using containsAll() method to check that correct options are selected in the list.. 
//	   if(actualSelection.containsAll(expectedSelection)) 
//	   { 
//	      System.out.println(actualSelection); 
//	   } 
//	 driver.close(); 
//	 } 
	
	
	//******************************************************************************************************************************************
	
//	public static void main(String[] args) 
//	{ 
//	 WebDriver driver = new ChromeDriver(); 
//	 driver.manage().window().maximize(); 
//	 String URL = "https://selenium08.blogspot.com/2019/11/dropdown.html"; 
//	 driver.get(URL); 
//
//	// Wait for some time to load the whole web page. 
//	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//
//	// Locate dropdown element on web page by By.xpath. 
//	   WebElement dropdown = driver.findElement(By.xpath("//select[@name='Month']")); 
//
//	// Create an object of Select class and pass the dropdown of type WebElement as an argument. 
//	    Select select = new Select(dropdown); 
//
//	// Call getOptions() method of select class to get all options available in the list. 
//	// Since return type of getOptions method is a list of WebElements, therefore, 
//	//we will store them by creating a variable getOptions of type List of WebElement. 
//	    
//	     List<WebElement> getOptions = select.getOptions(); 
//
//	// Create a list of generic type String to add all dropdown options in the list. 
//	   List<String> list = new ArrayList<String>(); 
//
//	// Use advanced for loop to add all options in the list. 
//	   for(WebElement element : getOptions) 
//	   { 
//	      list.add(element.getText()); // Here, getText() method of WebElement class has been used to add the text label of all the options in the list. 
//	   } 
//	  System.out.println(list); 
//
//	// We can also iterate list one by one by using iterator() method. 
//	// So, to iterate list, call iterator() method using reference variable list. Since the return type of iterator method is Iterator of generic type String, therefore, we will store it by using a variable itr of generic type String. 
//
//	// At the beginning, itr (cursor) will point to index just before the first element in the list. 
//	    Iterator<String> itr = list.iterator(); 
//
//	// Checking the next element availability using reference variable it. 
//	   while(itr.hasNext())
//	   { 
//	// Moving cursor to next element using reference variable it. 
//	     String str = itr.next(); 
//	     System.out.println(str); 
//	    } 
//	  driver.close(); 
//	 } 
//	
	
	//******************************************************************************************************************************************
	
//	public static void main(String[] args) 
//	 { 
//	   WebDriver driver = new ChromeDriver(); 
//	   driver.manage().window().maximize(); 
//	  
//	   String URL = "https://selenium08.blogspot.com/2019/11/dropdown.html"; 
//	  driver.get(URL); 
//
//	// Wait for some time to load the whole web page. 
//	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//
//	// Locate dropdown element on the web page by By.xpath. 
//	     WebElement dropdown = driver.findElement(By.xpath("//select[@name='Month']")); 
//
//	// Create an object of Select class and pass the dropdown of type WebElement as an argument. 
//	     Select select = new Select(dropdown); 
//
//	// Verify that the dropdown supports multiple-choice or not.. 
//	   if(select.isMultiple()) 
//	   { 
//	      System.out.println("Multiple choices are allowed, Select multiple options in the list "); 
//	   } 
//	 else { 
//	    System.out.println("Multiple choices are not allowed"); 
//	  } 
//	// Select the option "India" by sending visible text. 
//	     select.selectByVisibleText("May"); 
//
//	// Select an option by sending its value. 
//	     select.selectByValue("Ap"); 
//
//	// Select an option by sending its index. 
//	     select.selectByIndex(10); 
//
//	// Now, we will deselect already selected option by calling deselectByVisibleText() method of the select class. 
//	   select.deselectByVisibleText("May"); 
//	   System.out.println("Option May is deselected successfully"); 
//	   
//	   driver.close(); 
//	  } 
}
