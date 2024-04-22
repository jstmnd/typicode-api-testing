Feature: Creating a resource
  As a admin
  I want to create a new resource
  So that I can add it to the system

  Scenario: As a admin I can creating a resource with valid data
    Given I set API endpoint for creating a resource
    When I send a POST request with valid JSON data
    Then I receive status code 201
    And the resource is created successfully

  Scenario: As a admin I cannot create a resource without JSON data
    Given I set API endpoint for creating a resource
    When I send a POST request without JSON data
    Then I receive status code 200