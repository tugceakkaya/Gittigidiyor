package com.gittigidiyor.pages;

import com.gittigidiyor.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static com.gittigidiyor.driver.BaseTest.driver;

public class AddToBasketPage {
    Methods methods;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public AddToBasketPage() {
        methods = new Methods();
    }

    public void addToBasket() {
        WebElement S = driver.findElement(By.id("sellerPriceShippingKeyContainer"));
        js.executeScript("arguments[0].scrollIntoView();", S);

        methods.waitBySeconds(3);
        WebElement addBtn = driver.findElement(By.cssSelector("button#add-to-basket"));
        addBtn.click();
        methods.waitBySeconds(3);


    }
}
