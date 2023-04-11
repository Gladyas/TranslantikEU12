@TRAN10-520
Feature:Delete a Car
  User story:
  As a 'Sales Manager' and 'Store Manager', I should be able to delete a car


  @storeManagerFleet
  Scenario:All users can see the delete button by hovering over the three dots at the end of each row
    When store manager hovering mouse over the three dots
    Then store manager can see the delete button

  @storeManagerFleet
  Scenario:"Delete Confirmation" pop up should be displayed when the user clicks on the delete button
    When store manager hovering mouse over the three dots
    And  user manager click the delete button
    Then  user should see delete confirmation pop up

  @truckDriver
  Scenario:You do not have permission to perform this action." message should be displayed
    When driver hovering mouse over the three dots
    And user click the delete button
    And user should see delete confirmation pop up
    And user click the yes delete button
    Then  You do not have permission to perform this action message should be displayed

  @salesManager
  Scenario: 'Sales Manager' can delete any car by clicking on the delete button
    When sales manager hovering mouse over the three dots
    And user click the delete button
    And user should see delete confirmation pop up
    And user click the yes delete button
    Then Item deleted message should be displayed.



  Scenario:'Store Manager' can delete any car by clicking on the delete button
    When store manager hovering mouse over the three dots
    And user click the delete button
    And user should see delete confirmation pop up
    And user click the yes delete button
    Then Item deleted message should be displayed.


  Scenario:'Sales Manager' can delete any car on information page
    When sales manager click any vehicle row
    And click information page delete button
    And user should see delete confirmation pop up
    Then Item deleted message should be displayed.



  Scenario:'Store Manager' can delete any car on information page
    When store manager hovering mouse over the three dots
    And click information page delete button
    And user should see delete confirmation pop up
    Then Item deleted message should be displayed.


  Scenario: When 'Sales Manager' delete a car, the corresponding car should also be removed from the Fleet-Vehicle page.
    When  When sales manager click any vehicle row
    And user get the Chassis Number
    And click information page delete button
    And user should see delete confirmation pop up
    And Item deleted message should be displayed.
    Then user should check corresponding car also be removed from the Fleet-Vehicle page



  Scenario: When 'Store Manager' delete a car, the corresponding car should also be removed from the Fleet-Vehicle page.
    When  When store manager click any vehicle row
    And user get the Chassis Number
    And click information page delete button
    And user should see delete confirmation pop up
    And Item deleted message should be displayed.
    Then user should check corresponding car also be removed from the Fleet-Vehicle page

