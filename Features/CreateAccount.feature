Feature: Create Account

  Background: 
    Given User launch "<browserName>" Browser

  @regression
  Scenario Outline: : TS_001 Search the given product in amazon
    And User open URL "<applicationURL>"
    Then verify the page title
    Then User search the product "<productName>"

    Examples: 
      |  | browserName |  | applicationURL         |  | productName  |  |
      |  | chrome      |  | https://www.amazon.in/ |  | ipads latest |  |

  @regression
  Scenario Outline: : TS_002 Verify option for mobiles having Made for Amazon
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

  @sanity
  Scenario Outline: : TS_003 Validate Automation Practice Page Title
    And User open URL "<applicationURL>"
    Then verify the page title "<pageTitle>"

    Examples: 
      |  | browserName |  | applicationURL                          |  | pageTitle |  |
      |  | ie          |  | http://automationpractice.com/index.php |  | My Store  |  |

  @sanity
  Scenario: TS_004 Searching Products in Amazon
    And User open URL
      | applicationURL         |
      | https://www.amazon.in/ |
    Then verify the page title
    Then User search the product
      | products |
      | Iphone   |

  @smoke
  Scenario Outline: TS_005 Validate All Menu option is enabled
    And User open URL "<applicationURL>"
    Then verify the All Menu option
     Examples: 
      |  | browserName |  | applicationURL         |
      |  | chrome      |  | https://www.amazon.in/ |
