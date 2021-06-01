Feature: Create Account

  Background: 
    Given User launch "<browserName>" Browser

  @smoke
  Scenario Outline: : Create Amazon Account with Invalid data
    And User open URL "<applicationURL>"
    And Close browser

    Examples: 
      |  | browserName |  | applicationURL         |  |
      |  | chrome      |  | https://www.amazon.in/ |  |
      |  | ie          |  | http://automationpractice.com/index.php |  |
      |  | ie          |  | https://www.flipkart.com/ |  |
     
