Feature: Register

  Scenario Outline: POST - Authentication Register
    Given I set an endpoint for register user
    When I input "<fullname>" with "<Email>" with "<Password>"
    And I request detail account user
    Then I validate status code is <statuscode>
    Examples:
        |fullname|Email      |Password |statuscode |
        |tama    |tama12       |15       |200        |
        |tari    |           |12       |400        |
        |rahmat  |rahmat     |         |400        |
        |        |           |         |400        |
        |raden   |raden      |@@@@     |400        |