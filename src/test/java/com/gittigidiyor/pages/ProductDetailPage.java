package com.gittigidiyor.pages;

import com.gittigidiyor.methods.Methods;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

import static com.gittigidiyor.driver.BaseTest.driver;

public class ProductDetailPage {

    Methods methods;


    public ProductDetailPage() {
        methods = new Methods();
    }

    public void productDetailPage() {

        WebElement detail = driver.findElement(By.cssSelector("div[class='gg-d-10 pl0']>a"));
        detail.click();
        methods.waitBySeconds(3);


        String count = driver.findElement(By.cssSelector(".gg-d-16.gg-m-14.detail-text")).getText();
        System.out.println("Ürün adet sayısı: " +count);
        methods.waitBySeconds(3);


        WebElement dropdown = driver.findElement(By.xpath("//select[ @class='amount']"));

        if(dropdown.isEnabled() && dropdown.isDisplayed())
        {
            System.out.println("Açılır menü etkin ve görünürdür");
        }
        else {
            System.out.println("Açılır menu etkin ve görünür değildir! ");
        }

        Select select = new Select(dropdown);


        select.selectByIndex(1);

//ürün sayısı 2 değilse 2 yapılır.
        String getText = select.getFirstSelectedOption().getText();
        System.out.println("Güncel Urun sayısı: " +getText);

        methods.waitBySeconds(1);

       String  price= driver.findElement(By.xpath("//p[@class='new-price']")).getText();

        System.out.println("Ürün fiyatı :"  +price);

        methods.waitBySeconds(1);
        WebElement webEleList = driver.findElement(By.cssSelector("a[title='Sil']"));
        webEleList.click();
        System.out.println("Ürün sepetten çıkarıldı ..");

        methods.waitBySeconds(3);

       List <WebElement> emptyCart= driver.findElements(By.cssSelector("a[title='Sil']"));

        if ( emptyCart.size()>0){
            System.out.println("Sepette ürün vardır");
        }
        else{
            System.out.println("Sepet boş ");
        }

        methods.waitBySeconds(4);














    }








}
