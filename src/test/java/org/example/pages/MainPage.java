package org.example.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final String productPrice = ".price__lower-price";
    private final String productName = ".product-card__name";
    private final String productBrand = ".product-card__brand";
    private final String productCartAddBasket = ".product-card__add-basket";

    @FindBy(id = "searchInput")
    private WebElement searchInput;
    @FindBy(id = "applySearchBtn")
    private WebElement buttonSearch;
    @FindBy(xpath = "//a[@data-wba-header-name='Cart']/span")
    private WebElement buttonGoToBasket;
    @FindBy(css = ".product-card")
    private List<WebElement> allProductCard;

    public void searchForProduct(String productName) {
        searchInput.sendKeys(productName);
        buttonSearch.click();
        this.waitForLoaded();
    }

    public List<Product> addProductsToCartByIndex(int [] indexes){
        List<Product> products = new ArrayList<>();
        for (int index : indexes) {
            WebElement card = this.getCardByIndex(index);
            products.add(new Product(this.getProductName(card), this.getProductPrice(card)));
            this.addToCart(card);
        }
        products.sort(Comparator.comparing(Product::getName));
        return products;
    }

    public WebElement getCardByIndex(int index) {
        return allProductCard.get(index);
    }

    public String getProductName(WebElement card){
        String brand = card.findElement(By.cssSelector(productBrand)).getText();
        String name = card.findElement(By.cssSelector(productName))
                .getText()
                .replace("/ ", "");
        if (!Objects.equals(brand, "")) {
            name = name.replace("часы", "часы " + brand);
        }
        return name;
    }

    public int getProductPrice(WebElement card) {
        return Integer.parseInt(card.findElement(By.cssSelector(productPrice)).getText()
                .replaceAll(" ", "")
                .replace("₽",""));
    }

    public void addToCart(WebElement card) {
        getActions().moveToElement(card).perform();
        card.findElement(By.cssSelector(productCartAddBasket)).click();
    }

    public CartPage goToCart() {
        buttonGoToBasket.click();
        this.waitForLoaded();
        return new CartPage(driver);
    }
}