#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@fblogin
Feature: Test Facebook login
  

 Background:
 Given User should be open "https://www.facebook.com/"
 
 # @Facebooklogin
  Scenario: Test Facebook Loing Function with Valid UserName Invalid Password
   # Given User should be open "https://www.facebook.com/"
    And User enter username "sudhirsatre7" and password "sudhir-12"
    When User click LoginButton
    Then User enter the Home Page
    And Browser close
    
  Scenario: Test Facebook Loing Function with InValid UserName valid Password
  #  Given User should be open "https://www.facebook.com/"
    And User enter username "sudhirsatr" and password "sudhir-123"
    When User click LoginButton
    Then User enter the Home Page
     And Browser close
    
   Scenario: Test Facebook Loing Function with InValid UserName Invalid Password
   # Given User should be open "https://www.facebook.com/"
    And User enter username "sudhirsatresds7" and password "sudhir-sadsad12"
    When User click LoginButton
    Then User enter the Home Page 
    And Browser close
    
   Scenario: Test Facebook Loing Function with Valid UserName valid Password
   # Given User should be open "https://www.facebook.com/"
    And User enter username "sudhirsatre7" and password "sudhir-123"
    When User click LoginButton
    Then User enter the Home Page
     And Browser close 

 