package com.mycompany.app;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class YandexTest {

    final String SITE_URL = "https://ya.ru";

    @Test
    @Description("User Can Search Propellerads With Yandex")
    public void UserCanSearchPropelleradsWithYandex() {
        OpenYandexAndSearch("propellerads");
        $$("#search-result li.serp-item").find(text("propellerads")).shouldBe(visible);
    }

    @Step("Open Yandex and search propellerads")
    public void OpenYandexAndSearch(String word){
        open(SITE_URL);
        $("#text").setValue(word).pressEnter();
    }

}
