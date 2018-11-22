Feature: Searching on Booking site

 Scenario: Search for hotels in corresponding city 
    Given I am on main application page
    When I enter city name into the search field
    When I click the count field for adults and children
    When I choose 2 adults
    When I choose 1 room
    When I click the calendar
    When I choose a start date
    When I choose an end day
    When I click the search button
    Then I see various of hotels for entered city
    
 Scenario: Search for hotels in corresponding city and verify that rating >= 9
    Given I am on main application page
    When I enter city name into the search field
    When I click the count field for adults and children
    When I choose 2 adults
    When I choose 1 room
    When I click the calendar
    When I choose a start date
    When I choose an end day
    When I click the search button
    When I sort hotels by price and feedback
    When I open the first hotel
    Then I confirm that rate >= 9
