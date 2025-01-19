Feature: SignUp
  @smo
  Scenario: user can SignUp with valid data
    Given user navigate into web
    When user click on signup_login button
    And user enter Name "Arsany122"
    And user enter Email "arsanyelkess122@gmail.com"
    And user click on SignUp button
    Then user enter to SignUp page "https://automationexercise.com/signup"


  Scenario Outline:user can not SignUp with invalid data
    Given user navigate into web
    When user click on signup_login button
    And user enter email "<Name>"
    And user enter pass "<Email>"
    And user click on SignUp button
    Then user enter to home page "<message>"


    Examples:
      | Name   | Email      | message|
      |   1222 |  gfxhr.er  |https://automationexercise.com/login        |
      |   .... |  ggvcx.oq  |https://automationexercise.com/login        |
      |        |            |https://automationexercise.com/logi         |
