package com.gittigidiyor.test;

import com.gittigidiyor.driver.BaseTest;
import com.gittigidiyor.pages.*;
import org.checkerframework.checker.units.qual.A;
import org.junit.Test;

public class AddToBasketTest extends BaseTest {

    @Test
    public void addToBasketTest(){

        SearchProduct searchProduct = new SearchProduct();
        searchProduct.searchProduct();
        SearchTransationsPage searchTransationsPage=new SearchTransationsPage();
        searchTransationsPage.searchTransationsPage();
        SelectRandomProductPage selectRandomProductPage=new SelectRandomProductPage();
        selectRandomProductPage.selectRandomProduct();
        AddToBasketPage addToBasketPage=new AddToBasketPage();
        addToBasketPage.addToBasket();
    }

}
