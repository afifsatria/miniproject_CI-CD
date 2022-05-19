Feature: Ratings

  Scenario: GET - Ratings Get Product’s Rating
    Given I set endpoint for get product rating
    When I request get product rating
    Then I get validate status code is 200