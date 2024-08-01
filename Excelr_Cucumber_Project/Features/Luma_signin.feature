
Feature: Sign-in Test for Luma Website
	
	 
	  Scenario: To test login functionality with valid data
	  Given User is on Home page
	  And Click on Sign-in link
	  When User enters valid email as "<email>" and password as "<password>"
	  And Click on Sign-in button
	  Then User is landed to Home page
	  And Username is displayed
	
	  Examples: 
	  | email | password  |
	  | basavaprabhu@gmail.com | Bp12345678 |
    | Hello@gmail.com | hello123  |
 
