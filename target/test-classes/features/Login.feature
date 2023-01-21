@Login
Feature: Login feature

  Background:
    Given I am on the login page

  Scenario: Login as a librarian
    When I login as a "librarian"
    Then Dashboard should be displayed in the url

  Scenario: Login as a student
    When I login as a "student"
    Then Books should be displayed in the url

