Feature: Patching A resources
  As a admin
  I want to patching a resources
  So that I can view the resources

  Scenario: As a admin I can patching a resources
    Given I set API endpoint for patching a resources
    When I send a PATCH request to the endpoint
    Then I receive status code 200
    And I receive the resources