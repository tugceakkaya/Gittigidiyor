package com.gittigidiyor.test;

import com.gittigidiyor.driver.BaseTest;
import com.gittigidiyor.pages.LoginPage;
import org.junit.Test;

public class LoginTest  extends BaseTest {

    @Test
    public void loginTest(){
        LoginPage loginPage=new LoginPage();
        loginPage.getLogin();

    }

}
