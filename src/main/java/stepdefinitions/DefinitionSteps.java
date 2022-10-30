package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SettingPage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultsPage;
import pages.ShoppingCartPage;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DefinitionSteps {
    private static final long DEFAULT_TIMEOUT = 10;


    WebDriver driver;
    HomePage homePage;
    ShoppingCartPage shoppingCartPage;
    SearchResultsPage searchResultsPage;
    ProductPage productPage;
    SettingPage settingPage;
    PageFactoryManager pageFactoryManager;

    @Before
    public void testsSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }


    @After
    public void tearDown(){
        driver.close();
    }



    @Given("User opens {string} page")
    public void userOpensHomePagePage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);


    }


    @And("User makes search by keyword {string}")
    public void userMakesSearchByKeywordKeyword (final String keyword) {
        homePage.enterTextToSearchField(keyword);
    }


    @And("User clicks search button")
    public void userClicksSearchButton()
    {
        homePage.clickSearchButton();
    }



    @And("User clicks on first product")
    public void userClicksOnFirstProduct() {
        searchResultsPage = pageFactoryManager.getSearchResultsPage();
        searchResultsPage.clickFirstGiftCardInTheList();
    }

    @And("User click on add to cart button")
    public void userClickOnAddToCartButton() {
        productPage = pageFactoryManager.getProductPage();
        productPage.clickOnAddToCart();
    }



    @And("User checks if item was added to cart {string}")
    public void userChecksIfItemWasAddedToCartExpectedText(final String expectedText) {
        shoppingCartPage = pageFactoryManager.getShoppingCartPage();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertEquals(shoppingCartPage.getIfItemWasAddedToCart(), expectedText);
    }

    @And("User clicks on Go To Cart")
    public void userClicksOnGoToCart() {
        shoppingCartPage = pageFactoryManager.getShoppingCartPage();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        shoppingCartPage.clickGoToCart();
    }
    @And("User clicks on Amazon Logo")
    public void userClicksOnAmazonLogo() {
        homePage.clickOnAmazonLogo();
    }

    @And("User clicks on Cart Logo")
    public void userClicksOnCartLogo() {
        homePage.clickOnAddToCartLogo();
    }



    @And("User checks if Item is still in the list {string}")
    public void userChecksIfItemIsStillInTheListExpectedText(final String expectedText) {
        shoppingCartPage = pageFactoryManager.getShoppingCartPage();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertEquals(shoppingCartPage.getIfSubtotalOfShoppingCartNotChanged(), expectedText);
    }

    @And("User checks amazon logo visibility")
    public void userChecksAmazonLogoVisibility() {
        assertTrue(homePage.isAmazonLogoVisible());
    }

    @And("User checks add to cart button visibility")
    public void userChecksAddToCartButtonVisibility() {
        assertTrue(homePage.isAddToCartVisible());

    }
    @And("User clicks on langauge bar")
    public void userClicksOnLangaugeBar() {
        homePage.clickLanguageRegionSelection();
    }

    @And("User checks if currency settings option is visible")
    public void userChecksIfCurrencySettingsOptionIsVisible() {
        assertTrue(homePage.isCurrencySelectionButoonVisible());


    }

    @And("User clicks on Gift Cards Button")
    public void userClicksOnGiftCardsButton() {
        homePage.clickOnGiftCards();
    }

    @And("User clicks Dont change on Popup")
    public void userClicksDontChangeOnPopup() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.clickClosePopup();
    }

    @And("User check if easter gift card is visible")
    public void userCheckIfEasterGiftCardIsVisible() {
        assertTrue(homePage.isEasterCardVisible());
    }

    @And("User check if Birthday gift card is visible")
    public void userCheckIfBirthdayGiftCardIsVisible() {
        assertTrue(homePage.isBirthdayCardVisible());
    }

    @And("User checks if Thank You gift card is visible")
    public void userChecksIfThankYouGiftCardIsVisible() {
        assertTrue(homePage.isThankYouCardVisible());
    }

    @And("User checks if WorkPlace gift card is visible")
    public void userChecksIfWorkPlaceGiftCardIsVisible() {
        assertTrue(homePage.isWorkPlaceCardVisible());
    }

    @And("User clicks on Sign In Page")
    public void userClicksOnSignInPage() {
        homePage.clickOnSignIn();
    }

    @And("User clicks on Create your Amazon Account")
    public void userClicksOnCreateYourAmazonAccount() {
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        homePage.clickOnCreateAccount();
    }

    @And("User checks Name filed visibility")
    public void userChecksNameFiledVisibility() {
        assertTrue(homePage.isYourNameFieldVisible());
    }

    @And("User check number or email field visibility")
    public void userCheckNumberOrEmailFieldVisibility() {
        assertTrue(homePage.isMobileOrEmailFieldVisible());

    }

    @And("User checks Password field visbility")
    public void userChecksPasswordFieldVisbility() {
        assertTrue(homePage.isPasswordFieldVisible());
    }

    @And("User checks Reenter Password field visibility")
    public void userChecksReenterPasswordFieldVisibility() {
        assertTrue(homePage.isReenterPasswordFieldVisible());
    }

    @And("Use checks Continue button visibility")
    public void useChecksContinueButtonVisibility() {
        assertTrue(homePage.isContinueButtonVisible());
    }


    @And("User enters invalid format login {string}")
    public void userEntersInvalidFormatLoginKeyword(final String keyword) {
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        homePage.enterTextToLoginCredentialField(keyword);


    }

    @And("User clicks on Cotinue button")
    public void userClicksOnCotinueButton() {
        homePage.clickOnContinueButtonOnLoginPage();

    }

    @And("User checks if error message appears {string}")
    public void userChecksIfErrorMessageAppearsExpectedText(final String expectedText) {
        assertEquals(homePage.getIfErrorMEssageAppears(), expectedText);

    }

    @And("User enters his name on Registration page{string}")
    public void userEntersHisNameOnRegistrationPageName(final String name) {
        homePage.enterYourNameOnRegistrationpage(name);

    }

    @And("User enters his mobile or email on Registration Page {string}")
    public void userEntersHisMobileOrEmailOnRegistrationPageEmail(final String email) {
        homePage.enterYourMobileOrEmail(email);
    }

    @And("User enters password {string}")
    public void userEntersPasswordPass(final String pass) {
        homePage.enterYourPasswordOnRegistrationPage(pass);

    }

    @And("user reenters different password from previous {string}")
    public void userReentersDifferentPasswordFromPreviousVerifypass(final String verifypass) {
        homePage.reenterYourPasswordOnRegistrationPage(verifypass);


    }
    @And("User clicks on Continue button on registration page")
    public void userClicksOnContinueButtonOnRegistrationPage() {
        homePage.clickContinueButtonOnRegistrationPage();
    }



    @And("User checks if error message about different passwords appear{string}")
    public void userChecksIfErrorMessageAboutDifferentPasswordsAppearExpectedText(final String expectedText) {
        assertEquals(homePage.getIfPassMismatchMsgAppears(), expectedText);

    }

    @And("User clicks on Create business account button")
    public void userClicksOnCreateBusinessAccountButton() {
        homePage.clickOnCreateBusinessAccountButton();

    }


    @And("User click on Settings menu")
    public void userClickOnSettingsMenu() {

        assertTrue(homePage.islanguageCurrencyMenuButtonVisible());
        homePage.clickLanguageCurrencyMenuButton();
    }

    @And("User checks if Language settings is visible")
    public void userChecksIfLanguageSettingsIsVisible() {
        settingPage = pageFactoryManager.getSettingPage();
       assertTrue(settingPage.isLanguageCurrencyMenuHeaderVisible());
    }

    @And("User checks if Save Changes button is visible")
    public void userChecksIfSaveChangesButtonIsVisible() {
       assertTrue(settingPage.isLanguageCurrencySaveChangesButtonVisible());
    }

    @And("User checks if Cancel button is visible")
    public void userChecksIfCancelButtonIsVisible() {
      assertTrue(settingPage.isLanguageCurrencyCancelButtonVisible());
    }

    @And("User checks if English language option is visible")
    public void userChecksIfEnglishLanguageOptionIsVisible() {
       assertTrue(settingPage.isLanguageCurrencOPtionToSelectEnglish());
    }

    @And("User checks if Proceed to Checkout Button is Visible")
    public void userChecksIfProceedToCheckoutButtonIsVisible() {
        shoppingCartPage = pageFactoryManager.getShoppingCartPage();
        assertTrue(shoppingCartPage.isProceedToCheckOutButtonVisible());
    }

    @And("User checks if Quantity button is visible")
    public void userChecksIfQuantityButtonIsVisible() {
        assertTrue(shoppingCartPage.isQuantityButtonVisible());
    }

    @And("User checks if Delete Button Is visible")
    public void userChecksIfDeleteButtonIsVisible() {
        assertTrue(shoppingCartPage.isDeleteButtonVisible());
    }

    @And("User checks if back to top button is visible")
    public void userChecksIfBackToTopButtonIsVisible() {
        assertTrue((shoppingCartPage.isBackToTopButtonVisible()));
    }


}




