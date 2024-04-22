Feature: Updating a resource
  As a admin
  I want to update an existing resource
  So that I can modify its details

  Scenario: As a admin I can updating a resource with valid data and ID
    Given I set API endpoint for updating a resource
    When I send a PUT request with valid JSON data and ID
    Then I receive status code 200
    And I receive an updated list

  Scenario: As a admin I cannot update a resource without JSON data
    Given I set API endpoint for updating a resource
    When I send a PUT request without JSON data
    Then I receive status code 200