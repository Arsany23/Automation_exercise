Feature: Register

  Scenario: user can Register with valid data
    Given user navigate into web
    When user click on signup button
    And user choose Mr
    And user enter Name "arsany122"
    And user enter Email "arsanyelkess122@gmail.com"
    And user enter pass "1234qwer"
    And user select Day "15"
    And user select Month "December"
    And user select Year "1999"
    And user enter First Name "Arsany"
    And user enter Last Name "Elkess Begool"
    And user enter address "4,abbas el akkad"
    And user select Country
    And user enter state "Cairo"
    And user enter city "Nasr City"
    And user enter Zip Code "12345"
    And user enter Mobile Number "01205832693"
    And user click on Create Account button
    Then user enter to Confirmation Page "https://www.automationexercise.com/account_created"