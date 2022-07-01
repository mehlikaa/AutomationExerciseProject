@mehlikaTC19 @mehlika
Feature: View Category Products

Scenario Outline: TC_019 User should be see all products

Given m Launch browser and navigate to url
And m Click on Products button
Then m Verify that Brands are visible on left side bar
And m Click on any brand name "<brands>"
Then m Verify that user is navigated to brand page and brand products are displayed
And m On left side bar, click on any other brand link
Then m Verify that user is navigated to that brand page and can see products
Then m Verify that user can add to cart any chosen product

    Examples: Brand's Order
      |brands |
      |1|
      |2|
      |3|
      |4|
      |5|
      |6|
      |7|
      |8|
