Feature: AltoBelajar Login

  Scenario: Logo Presence on AltoBelajar home page
    Given I launch chrome browser
    When I open Alto Hrm Homepage
    Then I verify that the logo present on page
    And close Browser