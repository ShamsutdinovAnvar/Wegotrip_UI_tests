package com.wegotrip.tests;

import com.wegotrip.BaseTest;
import com.wegotrip.pages.LoginPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    @DisplayName("Check authorization with login/password")
    void checkLoginTest() {
        loginPage.openPage("")
                .checkLogin()
                .clear();
    }
}
