package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;

public class ShoppingCartPage extends BasePage {


    @FindBy(xpath = "//*[contains(@class, 'a-size-medium-plus')]")
    private WebElement ifItemWasAddedToCart;

    @FindBy(xpath = "//*[@id='sw-gtc']//*[contains(@class, 'a-button-text')]")
    private WebElement goToCart;

    @FindBy(xpath = "//*[@id='sc-subtotal-label-activecart']")
    private WebElement subTotalOfShoppingCart;

    @FindBy (xpath = "//*[@name='proceedToRetailCheckout']")
    private WebElement proceedToCheckOutButton;

    @FindBy(xpath = "//*[@id='a-autoid-0']//*[contains(@class, 'a-button-inner')]")
    private WebElement quantityButton;

    @FindBy(xpath = "//*[@name='submit.delete.Cf6226f9e-610f-4def-8e5e-967e9fbdd5d2']")
    private WebElement deleteButton;

    @FindBy(xpath = "//*[contains(@class, 'navFooterBackToTopText')]")
    private WebElement backToTopButton;




    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProceedToCheckOutButtonVisible(){
        return proceedToCheckOutButton.isDisplayed();
    }
    public boolean isQuantityButtonVisible(){
        return quantityButton.isDisplayed();
    }
    public boolean isDeleteButtonVisible(){
        return deleteButton.isDisplayed();
    }
    public boolean isBackToTopButtonVisible(){
        return backToTopButton.isDisplayed();
    }

    public void clickGoToCart() {
        goToCart.click();
    }


    private WebElement subTotalofShoppingCart() {
        return subTotalOfShoppingCart;
    }

    public String getIfSubtotalOfShoppingCartNotChanged() {
        return subTotalofShoppingCart().getText();
    }


    private WebElement ifItemWasAddedToCart() {
        return ifItemWasAddedToCart;
    }

    public String getIfItemWasAddedToCart() {
        return ifItemWasAddedToCart().getText();
    }





}


