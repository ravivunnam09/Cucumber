Feature: Create Account

  Background: 
    Given User launch "<browserName>" Browser

  @regression
  Scenario Outline: : Create Amazon Account with Invalid data
    And User open URL "<applicationURL>"
    Then User search the product "<productName>"
    And Close browser

    Examples: 
      |  | browserName |  | applicationURL         |  | productName    |  |
      |  | chrome      |  | https://www.amazon.in/ |  | Iphone mobiles |  |
     #|  | ie          |  | http://automationpractice.com/index.php |  |
  
  @smoke
  Scenario Outline: : Verify option for mobiles having Made for Amazon
    And User open URL "<applicationURL>"
    Then User navigate to HomePage
    When User clicks on Moblies link
    Then System navigates to Mobiles page
    And click on Made for Amazon
    Then System navigates to list of Items page
    When User clicks on Moblies link
    Then System navigates to Mobiles page
    And Close browser

    Examples: 
      |  | browserName |  | applicationURL         |  |
      |  | chrome      |  | https://www.amazon.in/ |  |
