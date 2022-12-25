package com.wegotrip.tests;

import com.wegotrip.BaseTest;
import com.wegotrip.pages.SearchPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {
    SearchPage searchPage = new SearchPage();

    @Test
    @DisplayName("Check search for attractions")
    void checkSearchAttractionTest() {
        searchPage.openPage("")
                .checkAttractionSearch();
    }

    @Test
    @DisplayName("Check search for cities")
    void checkFormTest() {
        searchPage.openPage("")
                .checkCitySearch();
    }
}
