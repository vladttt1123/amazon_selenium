package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingPage extends BasePage {



    @FindBy(xpath = "//*[@id=\"icp-language-heading\"]")
    private WebElement languageCurrencyMenuHeader;

    @FindBy(xpath = "//*[contains(@class, 'a-button-input')]")
    private WebElement languageCurrencySaveChangesButton;

    @FindBy(xpath = "//*[@id=\"icp-cancel-button\"]")
    private WebElement languageCurrencyCancelButton;

    @FindBy(xpath = "//*[@id='icp-language-settings']/div[2]")
    private WebElement  languageCurrencOPtionToSelectEnglish;





    public SettingPage(WebDriver driver) {
        super(driver);
    }


    public boolean isLanguageCurrencyMenuHeaderVisible(){
        return languageCurrencyMenuHeader.isDisplayed();
    }

    public boolean isLanguageCurrencySaveChangesButtonVisible(){
        return languageCurrencySaveChangesButton.isDisplayed();
    }

    public boolean isLanguageCurrencyCancelButtonVisible(){
        return languageCurrencyCancelButton.isDisplayed();
    }


    public boolean isLanguageCurrencOPtionToSelectEnglish(){
        return languageCurrencOPtionToSelectEnglish.isDisplayed();
    }













}
