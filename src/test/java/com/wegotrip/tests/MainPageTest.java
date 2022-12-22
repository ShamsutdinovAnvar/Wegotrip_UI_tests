package com.wegotrip.tests;

import com.wegotrip.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainPageTest extends TestBase {
    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Check button 'Help'")
    void checkButtonHelpTest() {
        mainPage.openPage("")
                .checkButtonHelp();
    }

    @Test
    @DisplayName("Check button 'Favorites'")
    void checkButtonFavoritesTest() {
        mainPage.openPage("")
                .checkButtonFavorites();
    }

    @Test
    @DisplayName("Check button 'Account'")
    void checkButtonAccountTest() {
        mainPage.openPage("")
                .checkButtonAccount();
    }

    @Test
    @DisplayName("Check button 'Explore all destinations'")
    void checkBlockDestinationsTest() {
        mainPage.openPage("")
                .checkBlockDestinations();
    }
}
