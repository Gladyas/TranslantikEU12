

@TRAN10-539
@truckDriverFleet
Feature: As a user, I should be able to arrange vehicle table data under Fleet-Vehicle page




  @TRAN10-533
  Scenario:View per page button is displayed and clickable
    When view per page button is displayed
    Then view per page button is clickable




  @TRAN10-535
  Scenario: The value of 'View Per Page' should be '25' by default
    When view per page button is displayed
    Then the value is twenty five by default



  @TRAN10-536
  Scenario:View Per Page' includes the values shown as below and the user can select each of them:
  10,25,50,100

    When view per page button is clicked
    And each values are displayed
    Then each values are selectable


  @TRAN10-537
  Scenario: User can sort a column in ascending or descending order by clicking the column name
    When chassis column and location column is clicked
    Then user can sort columns in ascending order
    When chassis column and location column is clicked
    Then user can sort columns is descending order




    @TRAN10-538
   Scenario:User can remove all sorting and filtering on the page by using the reset button
     When chassis column and location column is clicked
     When user clicks on manage filter button
     And user select licence plate from filters menu
      And user clicks on reset button
      And user don't have any sorting
     Then user don't have any filtering





