Feature: Products

  Scenario: GET - Products Get All Products
    Given I set endpoint for get list product
    When I request get list product
    Then Validate status code is 200

  Scenario: GET - Products Get Product By ID
    Given I set endpoint for get by id product
    When I request get product by id
    Then Validate status code is 200

