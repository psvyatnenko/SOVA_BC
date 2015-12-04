
Scenario: Authorization with valid data

Given On LMS authorization page
When Input valid login
And Input valid password
And Press enterButton
Then Open objectPage

Scenario: Authorization with empty data

Given On LMS authorization page
When Input empty login
And Input empty password
And Press enterButton
Then Open objectPage

