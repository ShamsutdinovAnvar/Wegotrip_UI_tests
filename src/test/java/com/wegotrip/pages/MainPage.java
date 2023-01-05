package com.wegotrip.pages;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    public MainPage openPage(String url) {
        open(url);
        $(".TopBar__functional").should(appear);

        return this;
    }

    public MainPage checkButtonHelp() {
        $(".Button.Button--simple.Button--icon-before.Button--md-text-hidden.Button--xs-text-hidden.DropdownButton__button").click();
        $("a[href='https://wegotrip.com/en/feedback/']").shouldHave(text("Contact us"));
        return this;
    }

    public MainPage checkButtonFavorites() {
        $("a[href='/en/favorites/']").click();
        $(".h1.m-32.m-64-t.Favorites__title").shouldHave(text("Favorites"));
        return this;
    }

    public MainPage checkButtonAccount() {
        $("button[class='Button Button--simple Button--icon-before Button--bordered Button--md-text-hidden Button--xs-text-hidden UserAccount__button'] span[class='Button__text']").click();
        $("div[class='DropdownBody'] button:nth-child(2)").shouldHave(text("Log in"));
        return this;
    }

    public MainPage checkBlockDestinations() {
        $("a[href='/en/destinations/']").click();
        $(".Breadcrumbs__item.Breadcrumbs__item--current").shouldHave(text("All destinations"));
        return this;
    }
}
