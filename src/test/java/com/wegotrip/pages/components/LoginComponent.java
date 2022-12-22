package com.wegotrip.pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginComponent {

    public LoginComponent checkLogin(String username, String password) {
        $(byText("Log in")).click();
        $(byText("Log in with password")).click();
        $("input[name='username']").setValue(username);
        $("input[name='password']").setValue(password).pressEnter();
        return this;
    }
}
