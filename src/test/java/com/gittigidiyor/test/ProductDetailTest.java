package com.gittigidiyor.test;

import com.gittigidiyor.driver.BaseTest;
import com.gittigidiyor.pages.*;
import org.junit.Test;

public class ProductDetailTest extends BaseTest {

    @Test
    public void productDetailTest(){

        SearchProduct searchProduct = new SearchProduct();
        searchProduct.searchProduct();
        SearchTransationsPage searchTransationsPage=new SearchTransationsPage();
        searchTransationsPage.searchTransationsPage();
        SelectRandomProductPage selectRandomProductPage=new SelectRandomProductPage();
        selectRandomProductPage.selectRandomProduct();
        AddToBasketPage addToBasketPage=new AddToBasketPage();
        addToBasketPage.addToBasket();
        ProductDetailPage productDetailPage=new ProductDetailPage();
        productDetailPage.productDetailPage();

    }

}
