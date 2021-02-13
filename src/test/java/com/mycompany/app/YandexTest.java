package com.mycompany.app;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class YandexTest {

    final String SITE_URL = "https://ya.ru";

    @Test
    @Description("User Can Search Propellerads With Yandex")
    public void UserCanSearchPropelleradsWithYandex() {
        OpenYandexAndSearchPropellerads();
        $$("#search-result li.serp-item").find(text("PropellerAds")).shouldBe(visible).shouldHave(text("propellerads.com"));
    }

    @Test
    @Description("User Can Open Propellerads With Yandex")
    public void UserCanOpenPropelleradsWithYandex(){
        OpenYandexAndSearchPropellerads();

        OpenPropellerads();
    }

    @Step("Open Yandex and search propellerads")
    public void OpenYandexAndSearchPropellerads(){
        open(SITE_URL);
        $("#text").setValue("propellerads").pressEnter();
    }

    @Step
    public void OpenPropellerads(){
        $$("#search-result li.serp-item").find(text("PropellerAds")).scrollTo().click();
    }
}
