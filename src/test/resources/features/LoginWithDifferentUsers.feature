Feature: Log in with different users

  @DiffUsersLogin
  Scenario Outline: Different users should be able to log in
    Given I am on the login page
    When I login using a "<email>" and "<password>"
    Then "<username>" should be visible at the top


    @Students
    Examples:
      | email             | password | username        |
      | student27@library | E1uZrsAu | Test Student 27 |
      | student28@library | tJ93UQS3 | Test Student 288888 |
      | student29@library | g8EyNm9B | Test Student 29 |
      | student30@library | QX6FWzj6 | Test Student 30 |

    @Librarians
    Examples:
      | email               | password | username          |
      | librarian13@library | YCJCbmU3 | Test Librarian 13 |
      | librarian14@library | bWN7YaaB | Test Librarian 14 |
      | librarian15@library | YLu0ZIMj | Test Librarian 15 |
      | librarian16@library | MnG7Xy72 | Test Librarian 16 |
      | librarian17@library | adE5UAha | Test Librarian 17 |

