Feature: NTT Landing Page

  Scenario: Access NTT landing page
    Given I access the NTT landing endpoint
    Then the response code should be 200
