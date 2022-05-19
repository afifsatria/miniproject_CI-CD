Feature: Login

  Scenario Outline: POST - Authentication Login
    Given I set an endpoint for login user
    And I input "<email>" with "<password>"
    When I request detail account email user
    Then validate status code is <status_code>
    And validate the "<message>" after request login
   And get token if "<message>" for other request
    Examples:
      |email              |password |status_code |message  |
      |t                  |t        |200         |success  |
      |                   |t        |400         |required |
      |t                  |         |400         |required |
      |                   |         |400         |required |
      |t                  |w        |400         |required |