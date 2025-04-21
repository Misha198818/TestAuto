package pages.elements;

import java.time.Duration;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import io.qameta.allure.Step;

public class LogoElement {

    private SelenideElement selector;

    public LogoElement (SelenideElement selector){
        this.selector = selector;
    }

    @Step("проверяем наличие логотипа")
    public LogoElement logoVisible(){
        selector.shouldBe(Condition.visible, Duration.ofSeconds(3));
        return this;
    }
}
