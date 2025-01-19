Feature: Login

  Scenario: user can login with valid data
    Given user navigate into web
    When user click on signup login button
    And user enter email "omarjoe5@gmail.com"
    And user enter pass "1234qwer"
    And user click on login button
    Then user enter to home page "https://automationexercise.com/"

    Scenario Outline:user can not login with invalid data
      Given user navigate into web
      When user click on signup login button
      And user enter email "<Email>"
      And user enter pass "<Pass>"
      And user click on login button
      Then user enter to home page "<message>"

      Examples:
        | Email                 | Pass        | message|
        |   omarjoe5@gmail.com  |  dasdsad    |https://automationexercise.com/login        |
        |   csdds@gmail.com     |  1234qwer   |https://automationexercise.com/login        |
        |                       |             |https://automationexercise.com/logi        |

