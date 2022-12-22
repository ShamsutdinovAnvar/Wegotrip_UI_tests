package com.wegotrip.pages;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.wegotrip.pages.testdata.UserData.attraction;
import static com.wegotrip.pages.testdata.UserData.city;

public class SearchPage {
    public SearchPage openPage(String url) {
        open(url);
        return this;
    }
    public SearchPage checkAttractionSearch() {
        $(".Search__input").setValue(attraction).pressEnter();
        $("a[href='/en/paris-d3/']").shouldHave(text("Paris"));
        return this;
    }

    public SearchPage checkCitySearch() {
        $(".Search__input").setValue(city).pressEnter();
        $(".Link.SearchItem__row.SearchItem__city").shouldHave(appear);
        return this;
    }
}
