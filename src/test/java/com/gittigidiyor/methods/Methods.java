package com.gittigidiyor.methods;

import com.gittigidiyor.driver.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static com.gittigidiyor.driver.BaseTest.driver;

public class Methods {
    WebDriver driver;


    public Methods() {
        driver = BaseTest.driver;
        driver.manage().timeouts().pageLoadTimeout(40,
                TimeUnit.SECONDS);
    }

    public void click(By cssSelector) {
        driver.findElement(cssSelector).click();


    }

    public void waitBySeconds(long seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void click(WebElement element) {


    }
}
