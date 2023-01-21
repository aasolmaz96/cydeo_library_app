@LoginParam
Feature: Login with parameters feature

  User should be able to login with the username and passwords provided

  Background:
    Given I am on the login page

  Scenario: Login as librarian 7
    When  I enter username "librarian7@library"
    And I enter password "C5WUiPUP"
    And Click the login button
    Then  Dashboard should be displayed in the url

  Scenario: Login as student 34
    When  I enter username "student34@library"
    And I enter password "JySGHP8G"
    And Click the login button
    Then  Books should be displayed in the url

  Scenario: Login as librarian in the same line
    When I enter username "librarian10@library" and password "ZIkOcbCa"
    And Click the login button
    Then Dashboard should be displayed in the url