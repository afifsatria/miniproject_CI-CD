Feature: Get All Category

  Scenario: GET - Categories Get All Category
    Given I set an endpoint for get all categories
    When I request GET category list
    Then I validate the status code is 200