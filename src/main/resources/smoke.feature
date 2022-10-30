Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check if item can be added to cart
    Given User opens '<homePage>' page
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User clicks on first product
    And User click on add to cart button
    Then User checks if item was added to cart '<expectedText>'

    Examples:
      | homePage                | keyword                  | expectedText |
      | https://www.amazon.com/ | playstation gift card    | Added to Cart|

  Scenario Outline: Check if item does not disappear from the cart when the page is refreshed
    Given User opens '<homePage>' page
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User clicks on first product
    And User click on add to cart button
    And User clicks on Go To Cart
    And User clicks on Amazon Logo
    And User clicks on Cart Logo
    And User checks if Item is still in the list '<expectedText>'

    Examples:
      | homePage                | keyword                  | expectedText |
      | https://www.amazon.com/ | playstation gift card    | Subtotal (1 item):|


  Scenario Outline: Check if logo, cart and currecny selection vutton are  visible
    Given User opens '<homePage>' page
    And User checks amazon logo visibility
    And User checks add to cart button visibility
    And User clicks on langauge bar
    And User checks if currency settings option is visible



    Examples:
      | homePage                |
      | https://www.amazon.com/ |


  Scenario Outline: Check if all options in Gift Cards section are visible
    Given User opens '<homePage>' page
    And User clicks Dont change on Popup
    And User clicks on Gift Cards Button
    And User check if Birthday gift card is visible
    And User checks if Thank You gift card is visible
    And User checks if WorkPlace gift card is visible

    Examples:
      | homePage                |
      | https://www.amazon.com/ |


  Scenario Outline: Check if mandatory fields for registration are visible
    Given User opens '<homePage>' page
    And User clicks Dont change on Popup
    And User clicks on Sign In Page
    And User clicks on Create your Amazon Account
    And User checks Name filed visibility
    And User check number or email field visibility
    And User checks Password field visbility
    And User checks Reenter Password field visibility
    And Use checks Continue button visibility



    Examples:
      | homePage                |
      | https://www.amazon.com/ |


  Scenario Outline: Negative Check if error message appears when trying to log in with invalid email
    Given User opens '<homePage>' page
    And User clicks Dont change on Popup
    And User clicks on Sign In Page
    And User enters invalid format login '<keyword>'
    And User clicks on Cotinue button
    And User checks if error message appears '<expectedText>'


    Examples:
      | homePage                | keyword                 | expectedText |
      | https://www.amazon.com/ | qwertyui                  | There was a problem|


  Scenario Outline: Negative Check if error message appears when making mistake in reenter password field
    Given User opens '<homePage>' page
    And User clicks on Sign In Page
    And User clicks on Create your Amazon Account
    And User enters his name on Registration page'<name>'
    And User enters his mobile or email on Registration Page '<email>'
    And User enters password '<pass>'
    And user reenters different password from previous '<verifypass>'
    And User clicks on Continue button on registration page
    And User checks if error message about different passwords appear'<expectedText>'

    Examples:
      | homePage                | name | email           | pass       | verifypass   | expectedText |
      | https://www.amazon.com/ | John |test123@test.com | Abc123456! | Abc12345!    | Passwords must match |


  Scenario Outline: User checks if it is possible to start creating business account
    Given User opens '<homePage>' page
    And User clicks on Sign In Page
    And User clicks on Create your Amazon Account
    And User clicks on Create business account button
    And User checks if GetStarted Button is visible.


    Examples:
      | homePage                |
      | https://www.amazon.com/ |


  Scenario Outline: User checks if all crucial elements are displayed on Language settings page
    Given User opens '<homePage>' page
    And User click on Settings menu
    And User checks if Language settings is visible
    And User checks if Save Changes button is visible
    And User checks if Cancel button is visible
    And User checks if English language option is visible

    Examples:
      | homePage                |
      | https://www.amazon.com/ |


  Scenario Outline: User checks if all crucial elements are displayed in shopping cart page

    Given User opens '<homePage>' page
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User clicks on first product
    And User click on add to cart button
    And User clicks on Go To Cart
    And User checks if Proceed to Checkout Button is Visible
    And User checks if Quantity button is visible
    And User checks if back to top button is visible


    Examples:
      | homePage                | keyword                  |

      | https://www.amazon.com/ | playstation gift card    |








