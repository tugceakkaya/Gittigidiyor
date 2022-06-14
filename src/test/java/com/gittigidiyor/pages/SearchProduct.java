package com.gittigidiyor.pages;

import com.gittigidiyor.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.gittigidiyor.driver.BaseTest.driver;

public class SearchProduct {


    Methods methods;

    public SearchProduct() {
        methods = new Methods();
    }

    public void searchProduct() {
        WebElement search = driver.findElement(By.cssSelector("input[data-cy='header-search-input' ]"));
        search.sendKeys("Bilgisayar");
        driver.findElement(By.cssSelector(".qjixn8-0.sc-1bydi5r-0.gaMakD")).click();

        methods.waitBySeconds(3);
    }
}
