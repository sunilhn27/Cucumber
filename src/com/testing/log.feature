Feature: Testing login page 

Scenario Outline: Testing with valid credintials 

	Given Testing with valid credintials 
	Then Enter username as "<username>" 
	Then Enter  password as "<password>" 
	Then Click on login 
	
	Examples: 
		|username|password|
		|Admin|admin|
		
		
