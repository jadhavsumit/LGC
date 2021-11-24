Feature: Google Maps Verification

  Scenario: Verifying the Dublin Text on google maps
    Given User is on google maps landing page
    When User enters Dublin text in searchbox 
    Then User clicks on search button
    And Verify left panel has Dublin as a headline text
    When User Click directions 
		Then verify destination field as Dublin
	
