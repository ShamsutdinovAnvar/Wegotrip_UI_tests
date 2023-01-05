package com.wegotrip.pages;

import com.codeborne.selenide.Selenide;
import com.wegotrip.pages.components.LoginComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.wegotrip.pages.testdata.UserData.password;
import static com.wegotrip.pages.testdata.UserData.username;

public class LoginPage {
    private final LoginComponent loginComponent = new LoginComponent();

    public LoginPage openPage(String url) {
        open(url);
        return this;
    }

    public LoginPage checkLogin() {
        open("https://wegotrip.com");
        $(byText("Account")).click();
        loginComponent.checkLogin(username, password);
        $(".Button.Button--simple.Button--icon-before.Button--bordered.Button--md-text-hidden.Button--xs-text-hidden.UserAccount__button").click();
        $("a[href='/en/bookings/']").shouldHave(text("My tours and tickets"));
        return this;
    }

    public LoginPage clear() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        return this;
    }
}
