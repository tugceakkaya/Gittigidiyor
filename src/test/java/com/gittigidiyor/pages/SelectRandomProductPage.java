package com.gittigidiyor.pages;

import com.gittigidiyor.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static com.gittigidiyor.driver.BaseTest.driver;

public class SelectRandomProductPage {

    Methods methods;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public SelectRandomProductPage() {
        methods = new Methods();
    }

    public void selectRandomProduct() {

        List<WebElement> allProducts = driver.findElements(By.cssSelector(".pmyvb0-0.jCCkZh>ul>li"));
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();
        methods.waitBySeconds(1);

    }


}
