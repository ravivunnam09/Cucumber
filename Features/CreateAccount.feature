Feature: Create Account

  Background: 
    Given User launch "<browserName>" Browser

  @smoke
  Scenario Outline: : Create Amazon Account with Invalid data
    And User open URL "<applicationURL>"
    Then verify the page title
    Then User search the product "<productName>"

    Examples: 
      |  | browserName |  | applicationURL         |  | productName    |  |
      |  | chrome      |  | https://www.amazon.in/ |  | Iphone mobiles |  |

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

  @smoke
  Scenario Outline: : Validate Automation Practice Page Title
    And User open URL "<applicationURL>"
    Then verify the page title "<pageTitle>"

    Examples: 
      |  | browserName |  | applicationURL                          |  | pageTitle |  |
      |  | ie          |  | http://automationpractice.com/index.php |  | My Store  |  |

  @smoke
  Scenario: Searching Products in Amazon
    And User open URL
      | applicationURL         |
      | https://www.amazon.in/ |
    Then verify the page title
    Then User search the product
      | products       |
      | Iphone |
