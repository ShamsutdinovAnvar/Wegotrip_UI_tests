package com.wegotrip.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/${env}.properties"
})
public interface BaseTestConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("https://wegotrip.com")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();

    @Key("browserSize")
    String getBrowserSize();

    @Key("remoteUrl")
    String getRemoteURL();
}

