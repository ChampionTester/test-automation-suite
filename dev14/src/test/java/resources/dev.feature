Feature: To Check home page

  Background:User is on home page
  @dev
  Scenario: User is able to navigate to About Us page using About Us link
    Given User is on homepage
    When user clicks on About Us link
    Then User is directed to About us page