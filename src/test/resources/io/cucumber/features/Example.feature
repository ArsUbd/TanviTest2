Feature: Webstaurant Application Test

  Scenario Outline: Using Webstaurant application i search for stainesless steal table and validate output
    Given I login into Google application
    Then I search for the word <word>
    Examples:                      		

		|word  |	

		|User1     |	
