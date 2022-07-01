
@mehlikaTC20 @mehlika
Feature: View Category Products

Scenario Outline: TC_020 User should be see all products
  Given m Launch browser and navigate to url
And m Click on Products button
Then m Verify user is navigated to ALL PRODUCTS page successfully
And m Enter product name "<productName>" in search, verify SEARCHED PRODUCTS is visible and add first products to cart.
#Then m Verify all the products related to search are visible
And m Click Cart button and verify that products are visible in cart


  Examples: Product Name
    |productName|
    |DRESS      |
    |SHIRT    |
    |tops       |
    |saree      |
    |jeans      |

  Scenario: Sign Up and verify selected items in your cart
    Given m Click Signup Login button and submit login details
    And m Click and go to Cart page
    Then m Verify that those products are visible in cart after login as well
