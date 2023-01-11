Feature: Login testing with valid credentials using Examples table

#Description: write some important requirement/need (optional)

#Background: Common step (optional)

Scenario Outline: As a user, I want to login to Automation Exercise with valid credentials

Given Open the browser
And Pass the URL "<URL>"
When Click on Login1
And Enter the username "<username>"
And Enter the password "<password>"
And Click on Login2
Then Validate login is successful
Examples:
|URL                                |username                |password   |
|https://www.automationexercise.com/|rezwanislam857@gmail.com|Boston2023 |
|https://www.automationexercise.com/|smarttech@gmail.com		 |Password123|