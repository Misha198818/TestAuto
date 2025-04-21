import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pages.TestViki;

public class TestOne extends BaseTest{

    TestViki testViki = new TestViki();

    @DisplayName("Википедия")
    @Test
    public void Test(){
        testViki.openPage()
                .inputRequest()
                .eleventVisible();
    }  
}
