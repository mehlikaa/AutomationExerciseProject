@mehlikaTC18 @mehlika
Feature: View Category Products

  Scenario: TC_018 User should be see all products
    Given m Launch browser and navigate to url
    Then m Verify that categories are visible on left side bar
    And m Click on WOMEN category
    And m Click on any category link under WOMEN category
    Then m Verify that category page is displayed and confirm text WOMEN PRODUCTS
    And m On left side bar, click on any sub-category link of MEN category
    Then m Verify that user is navigated to that category page
