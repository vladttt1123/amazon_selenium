package manager;

import org.openqa.selenium.WebDriver;
import pages.SettingPage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultsPage;
import pages.ShoppingCartPage;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }


    public ShoppingCartPage getShoppingCartPage() {
        return new ShoppingCartPage(driver);
    }

    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage(driver);
    }


    public ProductPage getProductPage() {
        return new ProductPage(driver);
    }

    public SettingPage getSettingPage() {
        return new SettingPage(driver);
    }
}
