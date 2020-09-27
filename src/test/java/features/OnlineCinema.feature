Feature: OnlineCinemaFeature

  Scenario: Verify that the correct video is displayed after selecting the genre
    Given I open 'Main page' on portal
    When I click 'Афиша' on Main Page
        And I click 'Онлайн кинотеатры' on Afisha Page
        And I choose 'Комедия из вкладки фильмы' in 'Жанр' dropdown on Online Cinema page
    Then I verify that all choosen genre are 'Комедия'
        And I click button 'Сериалы' on Online Cinema page
        And I choose 'Комедия из вкладки сериалы' in 'Жанр' dropdown on Online Cinema page
    Then I verify that all choosen genre are 'Комедия'
        And I click button 'Мультфильмы' on Online Cinema page
        And I choose 'Комедия из вкладки мультфильмы' in 'Жанр' dropdown on Online Cinema page
    Then I verify that all choosen genre are 'Комедия'