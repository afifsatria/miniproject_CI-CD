Feature: Create Category

Scenario Outline: POST - Categories Create Category
Given I set an endpoint for create category
When I input "<name>"
And I request detail category
Then I validate <statusCode>
  Examples:
  |name|statusCode|
  |T   |200       |
  |    |500       |
  |1   |200       |