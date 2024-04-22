Feature: Getting a resource
  As a admin
  I want to retrieve a specific resource with ID
  So that I can view its details

  Scenario: As a admin I can retrieving a resource with valid ID
    Given I set API endpoint for getting a resource
    When I send a GET request with a valid resource ID
    Then I receive status code 200
    And I receive details of the resource

  Scenario: As a admin I cannot retrieve a resource with non-existent ID
    Given I set invalid API endpoint for getting a resource
    When I send a GET request with a non-existent resource ID
    Then I receive status code 200