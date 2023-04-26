@sanity
Feature: Test example 3 feature
  In order to perform various operations with Data Tables
  and maps and lists we are doing following examples with same

  Background:
    Given user navigates to facebook website
    When user validates the home page title with age and locations
      | Age      | Location |
      | Below 18 | India    |
      | Above 18 | USA      |

  Scenario Outline: In order to verify login to facebook
    Then user entered "<username>" username
    And user entered "<password>" password
    Then user "<loginType>" successfully logged in
    Examples:
      | username | password | loginType   |
      | Valid    | Valid    | shouldBe    |
      | Invalid  | Invalid  | shouldNotBe |

  Scenario Outline: In order to verify Registration to facebook
    Then user entered "<username>" for registration
    And user entered "<password>" for next step as registration
    And user select the age category
      | Age      | Location |
      | Below 18 | India    |
      | Above 18 | USA      |
    And user select the height category
      | height      |
      | Below 150cm |
      | Above 170cm |
    Then user "<loginType>" successfully completed the registration
    Examples:
      | username | password | loginType   |
      | Valid    | Valid    | shouldBe    |
      | Invalid  | Invalid  | shouldNotBe |