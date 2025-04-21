package pages.elements;

import com.codeborne.selenide.SelenideElement;

import io.qameta.allure.Step;

import java.time.Duration;

import com.codeborne.selenide.Condition;

public class InputElement {

     private SelenideElement selector;

     public InputElement(SelenideElement selector){
        this.selector = selector;
     }

      @Step("проверяем наличие поля input")
      public InputElement inputVisible(){
            selector.shouldBe(Condition.visible, Duration.ofSeconds(5));
            return this;
      }

      @Step("Кликаем по полю input")
      public InputElement clickInput(){
            selector.click();
            return this;
        }
    
      @Step("Вставить значение и нажать Enter")
      public InputElement insertInput(String value){
            selector.setValue(value)
                    .pressEnter();
            return this;
      }



}
