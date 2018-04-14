Feature: Login 

Scenario Outline: 
	login with valid Credintials 

	Given lauch the browser 
	When  user should be in loginpage 
	Then Enter username "<username>" 
	Then Enter password "<password>" 
	Then Click on login button 
	
	Examples: 
		| username |password|
		|  sunil |sunil123|
		|  sunil2|sunil321|