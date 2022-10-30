package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//button[contains(@class, 'heart-icon')]")
    private List<WebElement> wishListIcons;
    @FindBy(xpath = "//span[contains(text(), '$25 PlayStation Store Gift Card [Digital Code]')]")
    private WebElement firstGiftCardInTheList;



    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickWishListOnFirstProduct() {
        wishListIcons.get(0).click();
    }

    public void clickFirstGiftCardInTheList(){
        firstGiftCardInTheList.click();
    }



}
