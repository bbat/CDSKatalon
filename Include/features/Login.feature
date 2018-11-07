Feature: User Login
  As an existing customer I want to login to my Cdiscount Customer Zone

  Scenario Outline: Unsuccessful login
    When on the CustomerZone authentication page I enter the email <email>
    ##And  on the CustomerZone authentication page I enter the password <password>
    ##And  on the CustomerZone authentication page I click on the Valider button
    ##Then I should <status> connected on the CustomerZone

    Examples: 
      | email |## password | status |
      | toto  |## tata     | be     |
      | titi  |## toto     | not b  |
