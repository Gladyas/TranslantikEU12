Feature: Filter Menu


  Background:
    Given The user logged in as "sales manager"
    When The user navigates to "Fleet" "Vehicles"
    And The user clicks on filterIcon

 @manageFilter
  Scenario:Manage Filter Button visible
    Then The user should see Manage Filter button became visible

  Scenario: User can apply filters by clicking on the filter name, from the 'Manage Filters' menu.
    When user clicks on manage filter button
    Then user can click on filters name

  Scenario: User can apply filters by typing the filter name, from the 'Manage Filters' menu.
    When user clicks on manage filter button
    And user types filter name "tags"
    Then filters are clickable