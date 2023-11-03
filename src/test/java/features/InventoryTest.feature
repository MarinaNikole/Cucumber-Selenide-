@inventory
Feature: Inventory

  Background:
    Given I open Login page
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory

  @six_inventory_items
  Scenario: 6 inventory items are displayed
    And 6 inventory items are displayed


  @name_A-Z
  Scenario: Sorting by name A-Z
    When I push sort dropdown button
    And I select Sorting by name A-Z
    Then I see sorted inventory items


  @name_Z-A
  Scenario: Sorting by name Z-A
    When I push sort dropdown button
    And I select Sorting by name Z-A
    Then I see sorted inventory items in Z-A order


  @price_from_low_to_high
  Scenario: Sorting by price from low to high
    When I push sort dropdown button
    And I select Sorting by price from low to high
    Then I see sorted by price from low to high inventory items


  @price_from_high_to_low
  Scenario: Sorting by price from high to low
    When I push sort dropdown button
    And I select Sorting by price from high to low
    Then I see sorted by price from high to low inventory items