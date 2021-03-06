package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class YandexTest {
    @Test
    void selenideSearchTest() {
        open("https://ya.ru");

        $(byName("text")).setValue("лепра").pressEnter();

        $("html").shouldHave(text("суверенный лепрозорий"));
    }
}