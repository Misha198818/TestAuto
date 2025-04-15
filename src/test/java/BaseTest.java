import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseTest {

    public static void configBrouser(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";           
    }

    @BeforeAll
    public static void init(){
        configBrouser();
    }
}