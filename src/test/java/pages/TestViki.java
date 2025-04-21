package pages;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.Selenide;

import io.qameta.allure.Step;
import pages.elements.InputElement;
import pages.elements.LogoElement;

public class TestViki {

    private final String urlPage = "https://ru.m.wikipedia.org/wiki/";

    protected final InputElement inputElement = new InputElement($x("//input[@class='search skin-minerva-search-trigger']"));
    protected final InputElement inputAfterElement =  new InputElement($x("//input[@class='search mf-icon-search']"));
    protected final LogoElement logoElement = new LogoElement($x("//img[@alt='Википедия']"));

    @Step("Открываем главную страницу")
    public TestViki openPage(){
        Selenide.open(urlPage);
        return this;       
    }
    
    @Step("Вводим поисковый запрос")
    public TestViki inputRequest(){
        inputElement.inputVisible()
                    .clickInput();
        inputAfterElement.inputVisible()
                         .insertInput("Точное время");                   
        return this;                  
    }

    @Step("Проверяем наличие элемента")
        public TestViki eleventVisible(){
            logoElement.logoVisible();
            return this;                   
        }
}
