package io.cucumber.test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.reusablemethods.GooglePage;
import io.cucumber.reusablemethods.Initialization;
import io.cucumber.reusablemethods.WebstaurantPage;

public class StepDefinitions extends Initialization {
 
    @Given("I login into Webstaurant application")
    public void applicationLogin() {
    	loadurl();
    }
    
    @When("I search for Stainless Steel tables using search button")
    public void searchRecord() throws InterruptedException {
    	WebstaurantPage web = new WebstaurantPage(driver);
    	web.searchForRecord();
    }
    
    @Then("I validate that the seached results contain the word Table in their name for all pages")
    public void validateSearchResult() {
    	WebstaurantPage web = new WebstaurantPage(driver);
    	web.validateSearchedRecord();
    }
    
    @When("i click on the Add to cart button for last record")
    public void addToCart() throws InterruptedException {
    	WebstaurantPage web = new WebstaurantPage(driver);
    	web.addRecordToCart();
    }
    
    @And("I click on view Cart button")
    public void viewCart() throws InterruptedException {
    	WebstaurantPage web = new WebstaurantPage(driver);
    	web.viewRecordInCart();
    }
    
    @And("I click on Empty Cart button")
    public void emptyCart() throws InterruptedException {
    	WebstaurantPage web = new WebstaurantPage(driver);
    	web.emptyRecordInCart();
    }
 
    
    @Then("I validate the cart gets empty")
    public void validateCart() {
    	WebstaurantPage web = new WebstaurantPage(driver);
    	web.validateEmptyCart();
    	close();
    }
    
    @Given("I login into Google application")
    public void applicationLoginGoogle() {
    	loadurlGoogle();
    }
    
    @When("^I search for the word \"(.*)\"$")
    public void searchText(String word) throws InterruptedException {
    	GooglePage web = new GooglePage(driver);
    	web.searchForRecord(word);
    }
}
