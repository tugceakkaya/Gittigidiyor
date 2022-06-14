package com.gittigidiyor.pages;

import com.gittigidiyor.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static com.gittigidiyor.driver.BaseTest.driver;

public class SearchTransationsPage {
    Methods methods;
    JavascriptExecutor je = (JavascriptExecutor) driver;

    public SearchTransationsPage(){
        methods=new Methods();
    }

public void searchTransationsPage(){

    WebElement pageTwo = driver.findElement(By.cssSelector(".sc-12aj18f-4.gJBRrS>ul>li:nth-of-type(3)"));
    je.executeScript("arguments[0].scrollIntoView(true);",pageTwo);
    methods.waitBySeconds(3);
    pageTwo.click();


    methods.waitBySeconds(3);

}

}
