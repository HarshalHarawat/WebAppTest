Feature: Rahul Shetty Website Testing
                    
                    
Background: Login webpage
            Given Land on the Login of Webpage 

@Smoke      
Scenario Outline: Login Page

When Enter the <username> and <password>
And click on the checkboxes
And click on the Sign In button
Then Navigated to Home Page
And click on Logout

Examples:

|	username | password |
|	rahul    | rahulshettyacademy |
| harshal  | rahulshettyacademy |


@Only
Scenario: Visit us Page

When click on the visit us page
Then Get the title of Visit us Page

@Regression
Scenario: Dummy 1
Given
When
Then

@Regression @Smoke
Scenario: Dummy 2
Given
When
Then




