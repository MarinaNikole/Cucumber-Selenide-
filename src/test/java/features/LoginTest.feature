@login
Feature: Login

  Background: I`m in login page
    Given I open Login page

  @success_login
  Scenario: Success login with valid data
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory

  @invalid_data
  Scenario Outline: Login with invalid data
    When I input "<username>" to username field
    And input "<password>" to password field
    When I push the Login button
    Then I see the message "<errorMessageText>" is displayed

    Examples:
      | username        | password     | errorMessageText                                            |
      | standard_user   | 3456789      | Username and password do not match any user in this service |
      | standard_userr  | secret_sauce | Username and password do not match any user in this service |
      | locked_out_user | secret_sauce | Sorry, this user has been locked out.                       |


  @empty_fields
  Scenario Outline: Login with empty fields
    When I input "<username>" to username field
    And input "<password>" to password field
    When I push the Login button
    Then I see the message "<errorMessageText>" is displayed

    Examples:
      | username      | password     | errorMessageText     |
      |               |              | Username is required |
      |               | secret_sauce | Username is required |
      | standard_user |              | Password is required |


@logout
  Scenario: Success log out
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory
    When I push burger menu
    And I follow logout link
    Then I`m in login Page








 #  @invalid_password
#  Scenario: Login with invalid password
#   // Given I open Login page
#    When I input "standard_user" to username field
#    And input "3456789" to password field
#    When I push the Login button
#    Then I see the message  "Epic sadface: Username and password do not match any user in this service" is displayed

#  @invalid_username
#  Scenario:  Login with invalid username
#  // Given I open Login page
#    When I input "standard_userr" to username field
#    And input "secret_sauce" to password field
#    When I push the Login button
#    Then I see the message  "Epic sadface: Username and password do not match any user in this service" is displayed

#  @locked_out_user
#  Scenario: Login with locked out user
#  // Given I open Login page
#    When I input "locked_out_user" to username field
#    And input "secret_sauce" to password field
#    When I push the Login button
#    Then I see error message that user has been locked out
