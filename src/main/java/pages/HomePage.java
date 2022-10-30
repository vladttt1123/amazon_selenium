package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.security.auth.x500.X500Principal;

public class HomePage extends BasePage {



    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id='nav-search-submit-button']")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id='nav-logo-sprites']")
    private WebElement amazonLogo;

    @FindBy(xpath = "//*[@id='nav-cart-text-container']//*[contains(@class, 'nav-line-2')]")
    private WebElement cartButton;

    @FindBy(xpath = "//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")
    private WebElement languageAndRegionSelection;

    @FindBy(xpath = "//*[@id='icp-currency-dropdown-selected-item-prompt']//*[contains(@class, 'a-button-text')]")
    private WebElement currencySelectionButton;

    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[4]")
    private WebElement giftCards;

    @FindBy(xpath = "//*[@aria-label='Easter gift cards']/img")
    private WebElement easterGiftCard;

    @FindBy(xpath = "//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input")
    private WebElement closePopUp;

    @FindBy(xpath = "//*[@aria-label='Birthday gift cards']/img")
    private WebElement birthdayGiftCard;

    @FindBy(xpath = "//*[@aria-label='Thank you gift cards']/img")
    private WebElement thankYouCard;

    @FindBy(xpath = "//*[@aria-label='Workplace gift cards']/img")
    private WebElement workSpaceCard;

    @FindBy(xpath = "//*[@id=\"nav-link-accountList-nav-line-1\"]")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@id='createAccountSubmit']")
    private WebElement createAmazonAccountbutton;

    @FindBy(xpath = "//*[@id='ap_customer_name']")
    private WebElement yourNameField;

    @FindBy(xpath = "//*[@id='ap_email']")
    private WebElement mobileOrEmailField;

    @FindBy(xpath = "//*[@id='ap_password']")
    private WebElement passwordButton;

    @FindBy(xpath = "//*[@id='ap_password_check']")
    private WebElement reenterPasswordButton;

    @FindBy(xpath = "//*[@id='continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//*[@id='ap_email']")
    private WebElement loginCredentialOnSignInPAge;

    @FindBy(xpath = "//*[@id=\"continue\"]")
    private WebElement continiueButtonOnLoginPage;

    @FindBy(xpath = "//*[@id=\"auth-error-message-box\"]/div/h4")
    private WebElement errorMessage;

    @FindBy(xpath = "//*[@id='auth-password-mismatch-alert']//*[contains(@class, 'a-alert-content')]")
    private WebElement passMismatchErrorMsg;

    @FindBy(xpath = "//*[@id=\"ab-registration-link\"]")
    private WebElement createBusinessAccountButton;


    @FindBy(xpath = "//*[contains(@class, 'icp-nav-link-inner')]")
    private WebElement languageCurrencyMenuButton;



    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }



    public void isSearchFieldVisible() {
        searchField.isDisplayed();
    }


    public void enterTextToSearchField(final String searchText) {
        searchField.sendKeys(searchText);
    }

    public void enterTextToLoginCredentialField(final String searchText){
        loginCredentialOnSignInPAge.sendKeys(searchText);
    }

    public void enterYourNameOnRegistrationpage(final String searchText){
        yourNameField.sendKeys(searchText);
    }

    public void enterYourMobileOrEmail(final String searchText){
        mobileOrEmailField.sendKeys(searchText);
    }

    public void enterYourPasswordOnRegistrationPage(final String searchText){
        passwordButton.sendKeys(searchText);
    }

    public void reenterYourPasswordOnRegistrationPage(final String searchText){
        reenterPasswordButton.sendKeys(searchText);
    }



    public void clickContinueButtonOnRegistrationPage(){
        continueButton.click();
    }
    public void clickOnCreateBusinessAccountButton(){
        createBusinessAccountButton.click();
    }


    public void clickSearchButton() {
        searchButton.click();
    }
    public void clickLanguageRegionSelection(){
        languageAndRegionSelection.click();
    }

    public void clickOnContinueButtonOnLoginPage(){
        continiueButtonOnLoginPage.click();
    }


    public void clickOnAmazonLogo(){
        amazonLogo.click();
    }

    public void clickOnSignIn(){
        signInButton.click();
    }

    public void clickOnCreateAccount(){
        createAmazonAccountbutton.click();
    }


    public boolean isAmazonLogoVisible(){
       return amazonLogo.isDisplayed();
    }

    public boolean isCurrencySelectionButoonVisible(){
        return currencySelectionButton.isDisplayed();
    }

    public boolean isYourNameFieldVisible(){
        return yourNameField.isDisplayed();
    }

    public boolean isMobileOrEmailFieldVisible(){
        return mobileOrEmailField.isDisplayed();
    }

    public boolean isPasswordFieldVisible(){
        return passwordButton.isDisplayed();
    }

    public boolean isReenterPasswordFieldVisible(){
        return reenterPasswordButton.isDisplayed();
    }

    public boolean isContinueButtonVisible(){
        return continueButton.isDisplayed();
    }

    public void clickOnAddToCartLogo(){
        cartButton.click();
    }


    public boolean isAddToCartVisible(){
        return cartButton.isDisplayed();
    }

    public void clickClosePopup(){
        closePopUp.click();
    }

    public void clickOnGiftCards(){
        giftCards.click();
    }

    public void clickLanguageCurrencyMenuButton(){
        languageCurrencyMenuButton.click();
    }



    public boolean isEasterCardVisible(){
        return easterGiftCard.isDisplayed();
    }
    public boolean isBirthdayCardVisible(){
        return birthdayGiftCard.isDisplayed();
    }

    public boolean isThankYouCardVisible(){
        return thankYouCard.isDisplayed();
    }
    public boolean isWorkPlaceCardVisible(){
        return workSpaceCard.isDisplayed();
    }
    public boolean islanguageCurrencyMenuButtonVisible(){
        return languageCurrencyMenuButton.isDisplayed();
    }




    public WebElement getPassErrMsg(){
        return passMismatchErrorMsg;
    }

    public String getIfPassMismatchMsgAppears(){
      return  getPassErrMsg().getText();
    }



    public WebElement getErrorNotification(){
        return errorMessage;
    }
    public String getIfErrorMEssageAppears(){
        return getErrorNotification().getText();
    }

}
