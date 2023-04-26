@smoke
Feature: Test example 1 feature
  In order to perform various operations with practice site One
  User need to test all possible scenarios related with them

  Background:
    Given user navigates to facebook website
    When user validates the home page title

  Scenario: In order to verify login to facebook Successfully
    Then user entered "valid" username
    And user entered "valid" password
    Then user "shouldBe" successfully logged in

  Scenario: In order to verify login to facebook Unsuccessfully
    Then user entered "Invalid" username
    And user entered "Invalid" password
    Then user "shouldNotBe" successfully logged in


