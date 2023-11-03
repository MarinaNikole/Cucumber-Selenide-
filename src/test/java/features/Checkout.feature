@Checkout
Feature: Checkout
  Scenario: Success checkout
    Given I open Login page
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory

    When I push Backpack Add to cart button
    And  I push Bike Light Add to cart button
    And I press Cart icon
    Then I am in Cart Page
    When I push Checkout Button
    Then I am in Your Information Page
    When I input "Ivan", "Ivanov" and "12345"
    And I push the Continue Button
    Then I am in Checkout Page
    When I push Finish Button
    Then I am in Complete Page




