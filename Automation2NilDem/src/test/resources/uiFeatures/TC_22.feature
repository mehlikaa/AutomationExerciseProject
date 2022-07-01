@mehlikaTC22 @mehlika
Feature: View Category Products

  Scenario: TC_22: Add to cart from Recommended items
    Given m Launch browser and navigate to url
    And m Scroll to bottom of page
    Then m Verify RECOMMENDED ITEMS are visible
    And m Click on Add To Cart on Recommended product
    And m Click on View Cart button
    Then m Verify that product is displayed in cart page