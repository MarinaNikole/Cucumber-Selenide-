@inventory
Feature: Inventory


  Scenario: 6 inventory items are displayed
    Given I open Login page
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory
    And 6 inventory items are displayed


    @name_A-Z
    Scenario: Sorting by name A-Z
      Given I open Login page
      When I input "standard_user" to username field
      And input "secret_sauce" to password field
      When I push the Login button
      Then I am on the page Inventory
      When I follow sort link
      And I select Sorting by name A-Z
      Then I see sorted inventory items
