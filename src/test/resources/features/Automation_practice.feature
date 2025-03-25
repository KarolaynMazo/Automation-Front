#Author:

Feature: I as an automation analyst
  I need to consume the services of https://demoqa.com/automation-practice-form


  Scenario Outline: the customer wants to enter the form data
    Given 'customer' you want to navigate to the page
    When enter the  information <Product>
    Then they should see the <Product>
    Examples:
      | Product |
      | Blouses |
