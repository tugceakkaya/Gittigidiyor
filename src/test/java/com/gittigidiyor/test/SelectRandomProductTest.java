package com.gittigidiyor.test;

import com.gittigidiyor.driver.BaseTest;
import com.gittigidiyor.pages.LoginPage;
import com.gittigidiyor.pages.SearchProduct;
import com.gittigidiyor.pages.SearchTransationsPage;
import com.gittigidiyor.pages.SelectRandomProductPage;
import org.junit.Test;

public class SelectRandomProductTest extends BaseTest {

    @Test
    public void  selectRandomProduct(){
        SearchProduct searchProduct = new SearchProduct();
        searchProduct.searchProduct();
        SearchTransationsPage searchTransationsPage=new SearchTransationsPage();
        searchTransationsPage.searchTransationsPage();
        SelectRandomProductPage selectRandomProductPage=new SelectRandomProductPage();
        selectRandomProductPage.selectRandomProduct();
    }

}
