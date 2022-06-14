package com.gittigidiyor.test;

import com.gittigidiyor.driver.BaseTest;

import com.gittigidiyor.pages.SearchProduct;
import org.junit.Test;

public class SearchTest extends BaseTest {

    @Test
    public void searchTest() {
        SearchProduct searchProduct = new SearchProduct();
        searchProduct.searchProduct();
    }
}
