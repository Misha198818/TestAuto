package pages;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import io.qameta.allure.Step;
import pages.elements.InputElement;
import pages.elements.LogoElement;

public class TestViki {

    private final String urlPage = "https://ru.m.wikipedia.org/wiki/";

    
    private final SelenideElement inputPage = $x("//input[@class='search skin-minerva-search-trigger']");
    private final SelenideElement inputPageAfter =  $x("//input[@class='search mf-icon-search']");
    private final SelenideElement logoPage =  $x("//img[@alt='Википедия']");

    protected final InputElement inputElement = new InputElement(inputPage);
    protected final InputElement inputAfterElement =  new InputElement(inputPageAfter);
    protected final LogoElement logoElement = new LogoElement(logoPage);

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
