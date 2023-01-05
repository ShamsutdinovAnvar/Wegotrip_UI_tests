package com.wegotrip.pages;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CityPage {

    public CityPage openPage() {
        open("/en/london-d8/");
        return this;
    }

    public CityPage checkCityPageTitle() {
        $(".h1.Hero__title").shouldHave(text("Self-Guided Walking Tours in London"));
        return this;
    }

    public CityPage checkBlockTopAttractionsInCity() {
        $(byText("Top attractions in London")).shouldHave(appear);
        return this;
    }

    public CityPage checkBlockPopularCitiesInCountry() {
        $(byText("Popular cities to visit in United Kingdom")).shouldHave(appear);
        return this;
    }

    public CityPage checkBlockTopAttractionsInCountry() {
        $(byText("Top attractions in United Kingdom")).shouldHave(appear);
        return this;
    }
}
