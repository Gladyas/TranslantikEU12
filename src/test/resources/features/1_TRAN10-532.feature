@TRAN10-534
Feature: Default

	Background:
		#@TRAN10-532
		
		    Background:  user on fleet-vehicles page
		      Given user on fleet-vehicles page
		

	#{color:#00875a}*User Story :* {color}
	#
	#As a user, I should be able to arrange vehicle table data under Fleet-Vehicle page
	#
	# 
	#
	#{color:#ff8b00}*_Acceptance Criteria:_*{color}
	#
	#*1-* User can arrange rows/vehicle numbers to be displayed by clicking on 'View Per Page' button under Fleet-Vehicles module
	#*2-* The value of 'View Per Page' should be '25' by default
	#
	#*3-* 'View Per Page' includes the values shown as below and the user can select each of them:
	#      ->10
	#      ->25
	#      ->50
	#      ->100
	#*4-* User can sort a column in ascending or descending order by clicking the column name
	#*5-* User can remove all sortings and filterings on the page by using the reset button
	#h4.
	@TRAN10-533
	Scenario: View per page button is displayed and clickable
		Scenario:View per page button is displayed and clickable
		        When view per page button is displayed
		        Then view per page button is clickable