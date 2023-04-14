
@TRAN10-552
Feature: As a store manager and sales manager, I should be able to add an event

  @TRAN10-551
  @salesManagerFleet
  Scenario: User can access the "Add Event" page
    When User should click on any vehicle
    Then User should land on Add Event page

  @TRAN10-546
   @salesManagerFleet
  Scenario: Sales Manager can click add event button
    When User should click on any vehicle
    Then User should click Add Event button

  @TRAN10-547
  @storeManagerFleet
  Scenario: Store Manager can click add event button
    When User should click on any vehicle
    Then User should click Add Event button

  @TRAN10-548
  @truckDriverFleet
  Scenario: Driver should not see add event button
    When User should click on any vehicle
    Then Driver should not click Add Event button

  @TRAN10-549
  @storeManagerFleet
  Scenario: After clicking on "Add event" button, "Add Event" page should pop up
    When User should click on any vehicle
    And User can click Add Event button
    Then Add Event page should pop up

  @TRAN10-550
    @salesManagerFleet
  Scenario:   If any compulsory field is not filled, message should be displayed after clicking on the save button
    When User should click on any vehicle
    And User can click Add Event button
    And User can click save button
    Then User should see the error message






