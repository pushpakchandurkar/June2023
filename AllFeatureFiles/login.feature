Feature: Test Orange HRM Application

  Scenario: Test Orange HRM Login Functionality
    Given user should be on Login Page
    When user enter valid userid and password
      | Admin | admin123 |
    Then user click on login button

  Scenario: Test Orange HRM Home Page functionality
    Given user should be on home page and validate title
    And validate home page URL

  Scenario: Test Orange HRM PIM Page functionality
    Given user is on PIM on page
    When user click on Add button and enter fname, lname, mname and click on save button
      | firstname | mname | lastname   |
      | pushpak   | G     | chandurkar |
      | Chetan    | S     | Ingale     |
      | Apporva   | P     | Patil      |
    
