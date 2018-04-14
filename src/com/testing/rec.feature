Feature: Testing Add in recruitment 

Scenario: Testing Recruitment feature 

	Given User should be login 
	Then Enter username and password 
		|Admin|admin| 
	Then Click on login 
	Then Click on Recruitment button 
	Then Click on Add button 
	Then enter firstname middlename lastname email phno 
		|sunil|shetty|john|sunilh.27@gmail.com|7411161889|
		|sagar|john|mary|sagar.27@gmail.com|7464646889| 
	