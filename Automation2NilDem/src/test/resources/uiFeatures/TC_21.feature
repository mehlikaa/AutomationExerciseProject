
@mehlikaTC21 @mehlika
Feature: View Category Products

  Scenario: TC_021 Add review on product

    Given m Launch browser and navigate to url
    And m Click on Products button
    Then m verify user is navigated to ALL PRODUCTS page successfully
    And m Click on View Product button
    Then m Verify Write Your Review is visible
    And m Enter name, email and review
    And m Click Submit button
    Then m Verify success message; Thank you for your review.