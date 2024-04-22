Feature: Deleting a resource
  As a admin
  I want to delete an existing resource
  So that I can remove it from the system

  Scenario: As a admin I can deleting a resource with valid ID
    Given I set API endpoint for deleting a resource
    When I send a DELETE request with a valid resource ID
    Then I receive status code 200

  Scenario: As a admin I cannot delete a resource with invalid ID
    Given I set API endpoint for deleting a resource
    When I send a DELETE request with an invalid resource ID
    Then I receive status code 200