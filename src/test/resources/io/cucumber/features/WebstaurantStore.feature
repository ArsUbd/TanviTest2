Feature: Webstaurant Application Test

  Scenario: Using Webstaurant application i search for stainesless steal table and validate output
    Given I login into Webstaurant application
    When I search for Stainless Steel tables using search button
    Then I validate that the seached results contain the word Table in their name for all pages
    When i click on the Add to cart button for last record
    And I click on view Cart button
    And I click on Empty Cart button
    Then I validate the cart gets empty
