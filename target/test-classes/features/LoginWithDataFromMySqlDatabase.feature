@AddAccount
Feature: Codefios page login functionality validation and adding account validation

  Background: 
    Given User is on the codefios login page
    When User enters "username" from mysql database
    When User enters "password" from mysql database
    And User clicks on sign in button
    Then User should be able to land on dashboard page

  Scenario Outline: User should be able to add an account
    When User clicks on list account button
    Then User should be able to land on list account page
    When User clicks on add account button
    Then User should be able to land on the add account form
    When User enters account accountName as "<accoutnName>"
    When User enters account description as "<description>"
    Then User enters account initialBalance as "<initialBalance>"
    When User enters account accountNumber as "<accoutnNumber>"
    When User enters account contactPerson as "<contactPerson>"
    When User should be able to click on save button
    And User should be able to see the success alert pop-pup

    Examples: 
      | accoutnName | description | initialBalance | accoutnNumber | contactPerson  |
      | Zoubir      | lorem       |         100.00 |          5479 | Zoubir_contact |
