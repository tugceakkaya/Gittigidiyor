package com.gittigidiyor.test;

import com.gittigidiyor.driver.BaseTest;
import com.gittigidiyor.pages.LoginPage;
import com.gittigidiyor.pages.SearchProduct;
import com.gittigidiyor.pages.SearchTransationsPage;
import org.junit.Test;

public class SearchTransationsTest extends BaseTest {

    @Test
    public void searchTransationsTest(){
        SearchProduct searchProduct = new SearchProduct();
        searchProduct.searchProduct();
        SearchTransationsPage searchTransationsPage=new SearchTransationsPage();
        searchTransationsPage.searchTransationsPage();
    }

}
