Feature: Listing all resources
  As a admin
  I want to retrieve a list of all resources
  So that I can view them

  Scenario: As a admin I can retrieving all resources successfully
    Given I set API endpoint for listing all resources
    When I send a GET request to the endpoint
    Then I receive status code 200
    And I receive a list of resources

  Scenario: As a admin I cannot retrieve all resources with invalid ID
    Given I set API endpoint for listing all resources
    When I send a GET request with incorrect ID
    Then I receive a error message