package com.wegotrip;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.wegotrip.config.ProjectProvider;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import static io.qameta.allure.Allure.step;

import com.wegotrip.helpers.AllureAttachments;

public class BaseTest {
    @BeforeAll
    static void setUp() {
        ProjectProvider.configBase();

        step("Устанавливаем интеграцию с Selenide", () ->
                SelenideLogger.addListener("AllureSelenide", new AllureSelenide()));
        step("Устанавливаем конфигурацию", () -> {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
        });
    }

    @AfterEach
    void addAttachments() {
        step("прикрепляем логи и отчеты выполнения", () -> {
            AllureAttachments.screenshotAs("Last screenshot");
            AllureAttachments.pageSource();
            AllureAttachments.browserConsoleLogs();
            AllureAttachments.addVideo();
        });
    }

    @AfterAll
    static void CloseWebDriver() {
        step("закрываем вебдрайвер", () -> {
                    Selenide.closeWindow();
                    Selenide.closeWebDriver();
                }
        );
    }

}


