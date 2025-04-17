#Author:Karolaynmazo@gmail.com

Feature: I as an automation analyst
  I need to consume the services of https://demoqa.com/automation-practice-form 


  Scenario Outline: the customer wants to enter the form data
    Given 'customer' want enter the data in the form
    When enter the requested information
      | Name   | LastName   | Email   | Gender   | Mobile   | Subjects   | Hobbies   | Address   | State   | City   |
      | <Name> | <LastName> | <Email> | <Gender> | <Mobile> | <Subjects> | <Hobbies> | <Address> | <State> | <City> |
    Then should see the message 'Thanks for submitting the form'
    Examples:
      | Name  | LastName | Email            | Gender | Mobile     | Subjects | Hobbies | Address            | State | City  |
      | Pedro | Jimenez  | pejome@gmail.com | Male   | 0123456789 | Biology  | Sports  | Envigado,Antioquia | NCR   | Noida |
