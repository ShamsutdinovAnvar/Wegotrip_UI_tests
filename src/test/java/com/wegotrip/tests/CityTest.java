package com.wegotrip.tests;

import com.wegotrip.pages.CityPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CityTest extends TestBase {
    CityPage cityPage = new CityPage();

    @Test
    @DisplayName("Check city page title")
    void checkCityPageTitle() {
        cityPage.openPage()
                .checkCityPageTitle();
    }

    @Test
    @DisplayName("Check block 'Top attractions in city'")
    void checkBlockTopAttractionsInCity() {
        cityPage.openPage()
                .checkBlockTopAttractionsInCity();
    }

    @Test
    @DisplayName("Check block 'Popular cities to visit in country'")
    void checkBlockPopularCitiesInCountry() {
        cityPage.openPage()
                .checkBlockPopularCitiesInCountry();
    }

    @Test
    @DisplayName("Check block 'Top attractions in country'")
    void checkBlockTopAttractionsInCountry() {
        cityPage.openPage()
                .checkBlockTopAttractionsInCountry();
    }
}
