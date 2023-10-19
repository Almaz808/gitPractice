Feature: Login functionality

  @Smoke
  Scenario: Login with valid credentials
    Given user should go to login page
    And user should enter in username valid credential
    And user should enter in password field valid password credential
    When user click login button
    Then user should login successfully