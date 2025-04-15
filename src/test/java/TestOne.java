import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

public class TestOne extends BaseTest{

    @Test
    public void TestPage(){
        Selenide.open("https://ru.m.wikipedia.org/wiki/");
        Selenide.$x("//input[@class='search skin-minerva-search-trigger']")
                                                    .click();
        Selenide.$x("//input[@class='search mf-icon-search']")
                                                    .setValue("Java")
                                                    .pressEnter();               
        Selenide.$x("//img[@alt='Википедия']").shouldBe(Condition.visible);
    }
}
