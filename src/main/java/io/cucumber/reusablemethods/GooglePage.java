package io.cucumber.reusablemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class GooglePage {

    WebDriver driver;

	
	String name_SearchTextBox = "q";
	String xpath_SearchButton = "//*[@class='CqAVzb lJ9FBc']//input[1]";
	
	
    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    
public void searchForRecord(String word) throws InterruptedException {

		Thread.sleep(8000);
    	driver.findElement(By.name(name_SearchTextBox)).sendKeys(word);
    	Thread.sleep(3000);
    	driver.findElement(By.xpath(xpath_SearchButton)).click();
    	Thread.sleep(5000);
    	
}
    

    
}