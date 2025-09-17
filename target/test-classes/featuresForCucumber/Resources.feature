
Feature: User Registration

  Scenario: Successful Registration of the User with Valid Email and Password and Matching Repeat Password
    Given The user is on "validLink"
    When The user provides a valid email address "validEmail"
    ## ideally would also need to connect to DB using mySQL to check that the email does not exist there
    And The user provides a valid password "validPassword"
    And The User provides a matching repeat password "validRepeatPassword"
    And The User hits Register button
    Then The user should be able to register successfully

