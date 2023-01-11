Feature: Login testing using data table

#Description: write some important requirement/need (optional)

#Background: Common step (optional)

Scenario: As a user, I want to login to Automation Exercise with valid credentials

Given Open the browser
And Pass the URL #"<URL>"
|URL                                |
|https://www.automationexercise.com/|
When Click on Login1
And Enter the username #"<username>"
|username                |
|rezwanislam857@gmail.com|
And Enter the password #"<password>"
|password   |
|Boston#2023|
And Click on Login2
Then Validate login is successful