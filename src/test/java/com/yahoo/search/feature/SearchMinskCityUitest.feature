@SearchTest
Feature: Test cases for Yahoo!
  Scenario: User enter in search line "Минск" and receives a search result
    Given User is on the Home page
    When The user enters a value "Минск" into the search line
    Then User receives a search result and equals extended result
