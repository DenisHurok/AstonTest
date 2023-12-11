package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.time.Duration;
import java.util.List;

public class AppTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();
        driver.get("https://www.mts.by/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @AfterMethod
    public void quit() {
        Driver.quitDriver();
    }
    public void cookieClose() {
        WebElement cookieClose = driver.findElement(By.xpath("//button[@id='cookie-agree']"));
        if (cookieClose.isDisplayed()) {
            cookieClose.click();
        }
    }

    @Test
    public void task1() {
        WebElement blockTitle = driver.findElement(By.xpath("//h2[contains(.,'Онлайн пополнение без комиссии')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(blockTitle).perform();
        wait.until(ExpectedConditions.visibilityOf(blockTitle));
        String textOfBlock = blockTitle.getText();
        Assert.assertEquals("Онлайн пополнение\nбез комиссии", textOfBlock);
    }

    @Test
    public void task2() {
        WebElement paymentLogos = driver.findElement(By.className("pay__partners"));
        List<WebElement> imagesList = paymentLogos.findElements(By.tagName("img"));
        Assert.assertEquals(false, imagesList.isEmpty());
        for (WebElement image : imagesList) {
            Assert.assertTrue(image.getSize().getHeight() > 0);
            Assert.assertTrue(image.getSize().getWidth() > 0);
        }
    }

    @Test
    public void task3() {
        cookieClose();
        driver.findElement(By.xpath("//a[contains(text(),'Подробнее о сервисе')]")).click();
        Assert.assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", driver.getCurrentUrl());
    }

    @Test
    public void task4() {
        WebElement phone = driver.findElement(By.id("connection-phone"));
        phone.clear();
        phone.sendKeys("297777777");
        WebElement sumInput = driver.findElement(By.id("connection-sum"));
        sumInput.sendKeys("10");
        WebElement email = driver.findElement(By.id("connection-email"));
        email.sendKeys("Abc@mail.ru");

        cookieClose();
        WebElement form = driver.findElement(By.id("pay-connection"));
        WebElement button = form.findElement(By.xpath(".//button[contains(@class, 'button button__default') and text()='Продолжить']"));
        button.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/iframe")));
        Assert.assertTrue(driver.findElement(By.xpath("//div/iframe")).isDisplayed());
    }

}
