#Autor:troyano85

Feature: open the web page

  @successful
  Scenario:validation of the iteration to the form
    Given "student" is on the website
    And validate the iterations option
    When Click on the form and select the Practice Form option
    Then will display the valid text "Practice Form"