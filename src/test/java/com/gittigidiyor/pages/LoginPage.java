package com.gittigidiyor.pages;

import com.gittigidiyor.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.gittigidiyor.driver.BaseTest.driver;

public class LoginPage {


    Methods methods;
    Logger logger = LogManager.getLogger(LoginPage.class);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public LoginPage() {
        methods = new Methods();
    }

    public void getLogin() {


        Actions actions = new Actions(driver);

        WebElement menuOption = driver.findElement(By.xpath(".//div[contains(text(),'Giriş Yap')]"));

        menuOption.click();
        methods.waitBySeconds(1);
        System.out.println("Done Mouse hover on 'Giris Yap' from Menu");

        methods.click(By.cssSelector(".lghPw"));
        methods.waitBySeconds(1);


        WebElement userName = driver.findElement(By.id("L-UserNameField"));
        userName.sendKeys("tgcakkaya1@gmail.com");
        methods.waitBySeconds(1);
        WebElement psw = driver.findElement(By.id("L-PasswordField"));
        psw.sendKeys("461568T.a");
        methods.waitBySeconds(1);

        WebElement ggLogin = driver.findElement(By.id("gg-login-enter"));
        ggLogin.click();

        String account = driver.findElement(By.cssSelector("div[title='Hesabım']")).getText();

        try {
            if (account.contains("Hesabım")) {
                System.out.println("Hesaba giriş yapıldu");
            }
        } catch (Throwable pageNavigationError) {
            System.out.println("Hesaba giriş yapılamadı");
        }


        methods.waitBySeconds(1);


    }

}






