package io.cucumber.reusablemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class WebstaurantPage {

    WebDriver driver;

	int containsTable=0;
	int doesNotContainTable=0;
	String id_SearchTextBox = "searchval";
	String value_SearchRecordText ="stainless steel work tables";
	String xpath_SearchButton = "//button[@value='Search']";
	String xpath_SearchRecordsLinkText = "//div[@id='details']/a[@data-testid='itemDescription']";
	String value_SearchedRecordsLinkText = "Table";
	String xpath_GoToNextPagebutton = "//li[contains(@class,'rc-pagination-next')]/a[contains(@aria-label,'Go to page')]";
	String xpath_CountertopEdgeDropdown ="//select[@title='Countertop Edge']";
	String xpath_FinishUpgradeDropdown ="//select[@title='Finish Upgrade']";
	String xpath_OverShelfDropdown ="//select[@title='Overshelf']";
	String xpath_SinkBowlDropdown ="//select[@title='Sink Bowl']";
	String xpath_AddToCartButton = "//div[@id='product_listing']/div[last()]//input[@value='Add to Cart']";
	String xpath_AddToCartWithOptionsButton = "//button[text()='Add To Cart']";
	String xpath_ViewCartButton = "//a[text()='View Cart']";
	String xpath_EmptyCartButton = "//a[text()='Empty Cart']";
	String xpath_EmptyCartForSureButton ="//button[text()='Empty Cart']";
	String xpath_EmptyCartMessage = "//p[@class='header-1']";
	
    public WebstaurantPage(WebDriver driver) {
        this.driver = driver;
    }

    
public void searchForRecord() throws InterruptedException {

    	
    	driver.findElement(By.id(id_SearchTextBox)).sendKeys(value_SearchRecordText);
    	driver.findElement(By.xpath(xpath_SearchButton)).click();
    	Thread.sleep(5000);
    	
}
    
public void validateSearchedRecord() {
	do {
		List<WebElement> searchedRecords = driver.findElements(By.xpath(xpath_SearchRecordsLinkText));
				     	
    	for(WebElement rec:searchedRecords) {
    		if(rec.getText().contains(value_SearchedRecordsLinkText)) {
    			containsTable++;
    		}
    		else {
    			doesNotContainTable++;
    		}
    	}
    	if(!driver.findElement(By.xpath(xpath_GoToNextPagebutton)).getAttribute("class").contains("disabled")) {
    		driver.findElement(By.xpath(xpath_GoToNextPagebutton)).click();
    		
    	}	
	}while(elementDisplayed());	
	System.out.println("Total Numer of record containing the word Table :-" + containsTable);
	System.out.println("Total Numer of record Not containing the word Table :-" +doesNotContainTable); 
}


public void addRecordToCart() throws InterruptedException, NoSuchElementException {
	driver.findElement(By.xpath(xpath_AddToCartButton)).click();
	
	if(driver.findElement(By.xpath(xpath_OverShelfDropdown)).isDisplayed()){
		Select sel =new Select(driver.findElement(By.xpath(xpath_OverShelfDropdown)));
		sel.selectByVisibleText("Center Mounted Eagle Group DOS1072-16/4 Table Mount Type 430, 16 Gauge Stainless Steel Double Overshelf - 72\" x 10\" x 30\"");	
   		
	}
	
		driver.findElement(By.xpath(xpath_AddToCartWithOptionsButton)).click();
   		Thread.sleep(3000);
	
}

public void viewRecordInCart() throws InterruptedException {
	driver.findElement(By.xpath(xpath_ViewCartButton)).click();
	Thread.sleep(5000);
}

public void emptyRecordInCart() throws InterruptedException {
	driver.findElement(By.xpath(xpath_EmptyCartButton)).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(xpath_EmptyCartForSureButton)).click();
	Thread.sleep(6000);
}

public void validateEmptyCart() {
	Assert.assertEquals(driver.findElement(By.xpath(xpath_EmptyCartMessage)).getText(), "Your cart is empty.");
}

    public boolean elementDisplayed() {
        try {
            return driver.findElement(By.xpath("//li[contains(@class,'rc-pagination-next')]/a[contains(@aria-label,'Go to page')]")).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    
}