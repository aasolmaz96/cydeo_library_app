@Search
Feature: Search results feature on the users page

  As a user, when I login as a librarian and I go to Users page, then table should have following columns:
  • Actions
  • UserID
  • Full Name
  • Email
  • Group
  • Status

  Scenario: View table on users page
    Given I am on the login page
    When I login as a "librarian"
    And I navigate to "users" page
    Then Table should have following column names
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |




