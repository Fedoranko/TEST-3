package com.example.test3;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide.*;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubHover {
    @Test
    void checkHover() {
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $("[data-testid='Grid-:R2kl:']").shouldHave(text("The AI-powered"));
    }

    @Test
    void dragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
//        actions().moveToElement($("#column-a > header")).clickAndHold()
//                .moveByOffset(200,0).release().perform();
//        sleep(2000);
//        $("#column-a").dragAndDropTo($("#column-b"));
        actions().dragAndDropBy($("#column-a"), 201, 0).perform();

        $$("#columns > div").first().shouldHave(text("B"));
    }
}
