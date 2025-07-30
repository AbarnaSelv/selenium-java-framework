@santiy
Feature: BookCart application demo

Background:
Given User should navigate to the application
And User clicks on the login

Scenario: Login should be success

@reg
And User enters the username as "abarna03"
And User enters the password as "Abharnas#123"
When user clicks the login button
Then login should be success

@smoke @reg
Scenario: Login should be failed

And User enters the username as "Abarnas"
And User enters the password as "AbharnaS#03"
When user clicks the login button
But login should be failed

