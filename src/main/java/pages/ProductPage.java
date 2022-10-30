package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//p[text()='$100 Code']")
    private WebElement couponForOneHundredUsd;

    @FindBy(xpath = "//*[@id=\"productTitle\"]")
    private WebElement ifPriceIsChangedToOneHundreed;




    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAddToCart(){
        addToCartButton.click();
    }






}
