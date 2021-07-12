@hudl_test
Feature:Hudl functional test

  Background:open login page
    Given user is on the login page

   @test
   Scenario Outline: User able to login the system and test video clips are playing and able to make a comment and delete
     When User enter '<email>' and '<password>'
     Then User landed home page and assert it user able to logged in
     When User click video user navigate to vides page
     Then User click first video and three videos play back to back
     And User click replay button user able to watch three videos back to back again
     Then User able to make a comment and delete
     And Close browser video page
     Examples:
       | email        | password    |
       | burhanalierol@outlook.com        | 123456Bb.|