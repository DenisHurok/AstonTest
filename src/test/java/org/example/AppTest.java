package org.example;


import org.example.pages.CartPage;
import org.example.pages.MainPage;
import org.example.pages.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;


public class AppTest {
    private WebDriver driver;
    private MainPage mainPage;
    private CartPage cartPage;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/java/Resource/chromedriver.exe");
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        cartPage = new CartPage(driver);
        driver.get("https://www.wildberries.ru/");
        mainPage.waitForLoaded();
    }

    @AfterTest
    public void browserClose() {
        driver.quit();
    }

    @Test
    public void testWildberries() {
        mainPage.searchForProduct("часы");
        List<Product> products = mainPage.addProductsToCartByIndex(new int [] {1, 2});
        mainPage.goToCart();
        List<Product> cartProducts = cartPage.getAllProductsData();

        Assert.assertEquals(products.size(),cartProducts.size(),"Quantity of selected products is not equal to the quantity of products in the basket");
        Assert.assertEquals(cartPage.getTotalPrice(), Product.getTotalPrice(products),"Total price of products is not equal");

        for (int i = 0; i < cartProducts.size(); i++) {
            Product product = products.get(i);
            Product cartProduct = cartProducts.get(i);
            Assert.assertEquals(product.getName(),cartProduct.getName(),"Different item names");
            Assert.assertEquals(product.getPrice(),cartProduct.getPrice(), "Price of products is not equal");
        }
    }
}
