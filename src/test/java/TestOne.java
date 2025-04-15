import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

public class TestOne extends BaseTest{

    @Test
    public void TestPage(){
        Selenide.open("https://ya.ru/");
        Selenide.$x("//input[@class='search3__input mini-suggest__input']")
                        .setValue("Java")
                        .pressEnter();
        Selenide.$x("//a[@class='HeaderLogo']").shouldBe(Condition.visible);
    }
}
